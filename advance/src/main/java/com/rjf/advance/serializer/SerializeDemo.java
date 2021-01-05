package com.rjf.advance.serializer;

/*
 *
 *   Rene
 *   2020/6/27 11:23
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.TimeUnit;

public class SerializeDemo {

    public static void main(String[] args) throws Exception {

        Person person = new Person();
        person.name = "xiaoming";
        person.age = 24;

        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.ser"));
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
            System.out.println("序列化 完毕!");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("等待 2 秒...");
        TimeUnit.SECONDS.sleep(2);

        Person p = null;
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.ser"));
            p = (Person) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("反序列化 : "+p);
    }
}
