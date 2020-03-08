package com.rjf.java8;

import java.util.Base64;

public class Base64Demo {

    public static void main(String[] args) {

        try {
            /*编码*/
            String encode = Base64.getEncoder().encodeToString("Rene".getBytes("utf-8"));
            System.out.println("encode : "+encode);

            /*解码*/
            byte[] decode = Base64.getDecoder().decode(encode);

            StringBuffer sb = new StringBuffer();
            for(byte b:decode){
                sb.append((char)b);
            }
            System.out.println("decode : "+sb);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
