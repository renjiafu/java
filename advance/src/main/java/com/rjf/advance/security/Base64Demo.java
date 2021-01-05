package com.rjf.advance.security;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String encoded= URLEncoder.encode("中文!", StandardCharsets.UTF_8.toString());
        System.out.println("Url en : "+encoded);

        String decoded= URLDecoder.decode(encoded,StandardCharsets.UTF_8.toString());
        System.out.println("Url de : "+decoded);

        byte[] input = "Rene".getBytes();
        String en = Base64.getEncoder().encodeToString(input);
        System.out.println("Base64 en: "+en);

        byte[] output = Base64.getDecoder().decode(en);
        System.out.println("Base64 de: "+new String(output));



    }
}
