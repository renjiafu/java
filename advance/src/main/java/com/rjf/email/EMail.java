package com.rjf.email;


import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

public class EMail {
    public static void main(String[] args) throws GeneralSecurityException {
        String to="2050838872@qq.com";
        String from="1546500177@qq.com";
        String host="smtp.qq.com";

        Properties properties=System.getProperties();
        properties.setProperty("mail.smtp.host",host);
        properties.put("mail.smtp.auth","true");
        MailSSLSocketFactory msf=new MailSSLSocketFactory();
        msf.setTrustAllHosts(true);
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.ssl.socketFactory",msf);

        Session session=Session.getDefaultInstance(properties,new Authenticator(){
            public PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("1546500177@qq.com","bospsihkzupagecb");
            }
        });
        try{
            MimeMessage message=new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(RecipientType.TO, new InternetAddress(to));
            message.setSubject("This is ths Subject line!");
            message.setText("This is message");

            Transport.send(message);
            System.out.println("发送成功!");
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }
}
