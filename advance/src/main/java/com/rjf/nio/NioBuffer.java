package com.rjf.nio;

import org.junit.Test;

import java.nio.ByteBuffer;

public class NioBuffer {
    @Test
    public void test(){
        String str="abcd";
        ByteBuffer buf=ByteBuffer.allocate(1024);
        print(buf);

        buf.put(str.getBytes());
        print(buf);

        buf.flip();
        print(buf);

        byte[] b=new byte[buf.limit()];
        buf.get(b,0,2);
        System.out.println(new String(b,0,2));
        print(buf);

        buf.mark();
        buf.get(b,2,2);
        System.out.println(new String(b,2,2));
        print(buf);
        buf.reset();
        print(buf);


    }
      void print(ByteBuffer buf){
        System.out.println("缓冲区容量:"+buf.capacity());
        System.out.println("缓冲区界限:"+buf.limit());
        System.out.println("缓冲区操作数据位置:"+buf.position()+"\n");
    }


}
