package com.rjf.net.udp;

/*
 *
 *   Rene
 *   2020/5/24 22:29
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class UdpServiceDemo {

    public static void main(String[] args) throws Exception {

        // 初始化udp服务器
        DatagramSocket ds = new DatagramSocket(6666);

        for(;;){
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
            ds.receive(packet);

            // 接收 utf-8 转化为 字符串 String
            String str = new String(packet.getData(),packet.getOffset(),packet.getLength(), StandardCharsets.UTF_8);
            System.out.println(str);

            // 发送
            byte[] data = ("ACK "+str).getBytes(StandardCharsets.UTF_8);
            packet.setData(data);
            ds.send(packet);
        }
    }
}
