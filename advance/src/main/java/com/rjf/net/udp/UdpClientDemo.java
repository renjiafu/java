package com.rjf.net.udp;

/*
 *
 *   Rene
 *   2020/5/24 22:36
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClientDemo {

    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();
        ds.setSoTimeout(1000);
        ds.connect(InetAddress.getByName("localhost"), 6666);

        for (int i = 0; i < 100; i++) {
            // 发送
            byte[] send = ("Hello"+i).getBytes();
            DatagramPacket packet = new DatagramPacket(send, send.length);
            ds.send(packet);

            // 接收
            byte[] accept = new byte[1024];
            packet = new DatagramPacket(accept, accept.length);
            ds.receive(packet);
            String resp = new String(packet.getData(), packet.getOffset(), packet.getLength());
            System.out.println(resp);
        }
        ds.disconnect();


    }
}
