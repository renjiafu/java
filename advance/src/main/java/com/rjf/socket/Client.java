package com.rjf.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

   public  static void main(String[] args){

     String serverName="localhost";
     int port=6666;
     try {
         System.out.println("连接主机:" + serverName + "端口号:" + port);
         Socket clientSocket = new Socket(serverName, port);
         System.out.println("主机地址:"+clientSocket.getRemoteSocketAddress());

         OutputStream os=clientSocket.getOutputStream();
         DataOutputStream dos=new DataOutputStream(os);
         Scanner sc=new Scanner(System.in);
         String str = null;
         str=sc.nextLine();
         dos.writeUTF("Hello ,i'm "+str+clientSocket.getLocalSocketAddress());
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
