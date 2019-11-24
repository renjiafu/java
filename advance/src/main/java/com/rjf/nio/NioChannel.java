package com.rjf.nio;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioChannel {
    //非缓存
    @Test
    public void test() {
        long start = System.nanoTime();
        FileInputStream ins = null;
        FileOutputStream out = null;

        //1、获取通道
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            ins = new FileInputStream("C:\\Users\\konix\\Desktop\\file.txt");
            out = new FileOutputStream("C:\\Users\\konix\\Desktop\\file2.txt");
            inChannel = ins.getChannel();
            outChannel = out.getChannel();

            //2、分配指定大小的缓冲区
            ByteBuffer buf = ByteBuffer.allocate(1024);
            //3、将通道中的数据存入缓冲区
            while (inChannel.read(buf) != -1) {
                //切换读取数据模式
                buf.flip();
                //将缓冲区的数据写入通道
                outChannel.write(buf);
                //清空缓冲区
                buf.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (outChannel != null) {
                try {
                    outChannel.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                }
            }

            if (inChannel != null) {
                try {
                    inChannel.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            if (ins != null) {
                try {
                    ins.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        long end = System.nanoTime();
        System.out.println("非直接缓冲耗时：" + (end - start));


    }

    //缓存
    @Test
    public void test02() throws Exception {
        long start = System.currentTimeMillis();

        FileChannel inChannel = FileChannel.open(Paths.get("C:\\Users\\konix\\Desktop\\file.txt"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("C:\\Users\\konix\\Desktop\\file2.txt"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);

        //内存映射文件
        MappedByteBuffer inMapperBuf = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
        MappedByteBuffer outMapperBuf = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

        //直接对缓冲区进行数据操作
        byte[] dst = new byte[inMapperBuf.limit()];
        //获取直接缓冲区的数据
        inMapperBuf.get(dst);
        //将获取到的数据写入内存映射文件中
        outMapperBuf.put(dst);

        outChannel.close();
        inChannel.close();

        long end = System.currentTimeMillis();
        System.out.println("直接缓冲耗时：" + (end - start));
    }

    //分散读取,聚集写入
    @Test
    public void test04() throws IOException {
        RandomAccessFile inRaf = new RandomAccessFile("C:\\temp\\test\\1.zip", "rw");

        //获取通道   51845754   155537264
        FileChannel channel = inRaf.getChannel();
        int l = (int) (channel.size() % 3);
        int len = (int) Math.floor((channel.size() * 1.0) / 3.0);
        ByteBuffer[] bytes = new ByteBuffer[3];
        for (int i = 0; i < bytes.length; i++) {
            if (i == bytes.length + 1)
                len = len + l;
            bytes[i] = ByteBuffer.allocate(len);
        }

        //分散读取
        channel.read(bytes);

        //切换数据读取模式
        for (ByteBuffer byteBuffer : bytes) {
            byteBuffer.flip();
        }

        //聚集写入
        RandomAccessFile outRaf = new RandomAccessFile("C:\\temp\\test\\2.zip", "rw");
        FileChannel outChannel = outRaf.getChannel();
        outChannel.write(bytes);

        outRaf.close();
        inRaf.close();

    }

    //SocketChannel和ServerSocketChannel
    //客户端
    @Test
    public void client() throws Exception {
        //1、获取通道
        SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9898));
        FileChannel inChannel = FileChannel.open(Paths.get("C:\\temp\\test\\1.zip"), StandardOpenOption.READ);
        //2、分配指定大小的缓冲区
        ByteBuffer dst = ByteBuffer.allocate(1024);

        //读取本地文件，并发送服务端
        while (inChannel.read(dst) > -1) {
            dst.flip();   //切换读取模式
            sChannel.write(dst);
            dst.clear();
        }

        //关闭通道
        inChannel.close();
        sChannel.close();
    }


    //服务端
    @Test
    public void server() throws Exception {
        //1、获取通道
        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        FileChannel outChannel = FileChannel.open(Paths.get("C:\\temp\\test\\2.zip"), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        //绑定连接
        ssChannel.bind(new InetSocketAddress(9898));

        //获取客户端连接通道
        SocketChannel sChannel = ssChannel.accept();

        //分配指定的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);

        //接收客户端的数据，并保存到本地
        while (sChannel.read(buf) > -1) {
            buf.flip();
            outChannel.write(buf);
            buf.clear();
        }

        //关闭通道
        sChannel.close();
        ssChannel.close();
        outChannel.close();
    }
}
