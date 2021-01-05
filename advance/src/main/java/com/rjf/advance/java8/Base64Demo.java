package com.rjf.advance.java8;

import java.util.Base64;

public class Base64Demo {

    public static void main(String[] args) {

        try {
            /*编码*/
            String encode = Base64.getEncoder().encodeToString("Rene".getBytes("utf-8"));
            System.out.println("encode : "+encode);

            /*解码*/
            byte[] decode = Base64.getDecoder().decode(encode);
            System.out.println("decode : "+new String(decode,"utf-8"));


            /*编码*/
            String encodeUrl = Base64.getUrlEncoder().encodeToString("Rene".getBytes("utf-8"));
            System.out.println("encodeUrl : "+encodeUrl);

            /*解码*/
            byte[] decodeUrl = Base64.getUrlDecoder().decode(encodeUrl);
            System.out.println("decodeUrl : "+new String(decodeUrl,"utf-8"));


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
