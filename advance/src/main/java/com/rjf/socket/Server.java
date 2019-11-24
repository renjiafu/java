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
                Socket server = ss.accept();
                System.out.println("服务器地址" + server.getRemoteSocketAddress());

                DataInputStream dis=new DataInputStream(server.getInputStream());
                System.out.println(dis.readUTF());

                DataOutputStream dos=new DataOutputStream(server.getOutputStream());
                dos.writeUTF("您已连接server"+server.getLocalSocketAddress());
                Scanner sc = new Scanner(System.in);
                dos.writeUTF("服务器回复"+sc.nextLine());
                server.close();


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
            Thread t=new Server(port);
            t.run();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
