package com.rjf.net.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

   public  static void main(String[] args){

     String serverName="localhost";
     int port=8080;

     try {
         System.out.println("连接主机:" + serverName + "端口号:" + port);
         Socket clientSocket = new Socket(serverName, port);
         System.out.println("客户端启动! 主机地址:"+clientSocket.getRemoteSocketAddress());

         OutputStream os=clientSocket.getOutputStream();
         DataOutputStream dos=new DataOutputStream(os);

         System.out.println("请输入消息 : ");
         Scanner sc=new Scanner(System.in);
         String str = sc.nextLine();

         dos.writeUTF("Hello ,i'm "+str+" 客户端 主机地址:"+clientSocket.getLocalSocketAddress());
         InputStream is=clientSocket.getInputStream();
         DataInputStream dis=new DataInputStream(is);
         System.out.println("服务器响应:"+dis.readUTF());
         System.out.println("服务器响应:"+dis.readUTF());

         clientSocket.close();
     }catch(IOException e){
         e.printStackTrace();
     }

    }
}
