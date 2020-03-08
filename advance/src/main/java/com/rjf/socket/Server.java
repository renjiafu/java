package com.rjf.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Server extends Thread{

    private ServerSocket ss;
    public Server(int port)throws IOException{
        ss=new ServerSocket(port);
        ss.setSoTimeout(10000);
    }
    public void run(){
        while (true){
            try {
                System.out.println("等待远程连接,端口为:" + ss.getLocalPort() + "...");
                Socket serverSocket = ss.accept();
                System.out.println("服务器地址" + serverSocket.getRemoteSocketAddress());

                DataInputStream dis=new DataInputStream(serverSocket.getInputStream());
                System.out.println(dis.readUTF());

                DataOutputStream dos=new DataOutputStream(serverSocket.getOutputStream());
                dos.writeUTF("您已连接server"+serverSocket.getLocalSocketAddress());
                Scanner sc = new Scanner(System.in);
                dos.writeUTF("服务器回复"+sc.nextLine());
                serverSocket.close();

            }catch(SocketException s){
                System.out.println("连接超时!");
            }catch(IOException e){
              e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        int port=6666;
        try{
            new Server(port).start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
