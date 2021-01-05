package com.rjf.advance.security;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class RSADemo {
    public static void main(String[] args) throws Exception{

        // 明文:
        String str = "Rene is a boy  ";

        // 创建公钥／私钥对:
        KeyPairGenerator rsa = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = rsa.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        byte[] encrypt = encrypt(str.getBytes(), publicKey);
        System.out.println("en : "+ Base64.getEncoder().encodeToString(encrypt));

        byte[] decrypt = decrypt(encrypt, privateKey);
        System.out.println("de :"+new String(decrypt));


    }

    // 用公钥加密:
    public static byte[] encrypt(byte[] message, PublicKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(message);
    }

    // 用私钥解密:
    public static byte[] decrypt(byte[] input, PrivateKey key ) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, key);
        return cipher.doFinal(input);
    }
}

