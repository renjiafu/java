package com.rjf.encryptionandsecurity;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class EncodeAndDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String encoded= URLEncoder.encode("中文!", StandardCharsets.UTF_8.toString());
        System.out.println(encoded);

        String decoded= URLDecoder.decode(encoded,StandardCharsets.UTF_8.toString());
        System.out.println(decoded);

        byte[] input = new byte[] { (byte) 0xe4, (byte) 0xb8, (byte) 0xad };
        String b64encoded = Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoded);

        byte[] output = Base64.getDecoder().decode("5Lit");
        System.out.println(Arrays.toString(output)); // [-28, -72, -83]



    }
}
