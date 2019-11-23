package com.rjf.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetField {

        public static void main (String[]args) throws Exception {

            Class stdClass=Student.class;
            //获取public字段"score"&"name"
            Field field=stdClass.getField("score");
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getModifiers());

            Field field1=MyString.class.getField("value");
            int m=field1.getModifiers();
            System.out.println(Modifier.isFinal(m)); // false
            System.out.println(Modifier.isPublic(m)); // true
            System.out.println(Modifier.isProtected(m)); // false
            System.out.println(Modifier.isPrivate(m)); // false
            System.out.println(Modifier.isStatic(m)); // false

            /*
            一个Field对象包含了一个字段的所有信息：

            getName()：返回字段名称，例如，"name"；
            getType()：返回字段类型，也是一个Class实例，例如，String.class；
            getModifiers()：返回字段的修饰符，它是一个int，不同的bit表示不同的含义。
             */




           Object o=new Person("Xiao Ming");
           Object value=o.getClass().getField("name").get(o);
           System.out.println(value);

            Person person=new Person("xiao ming");
            Field field2=person.getClass().getDeclaredField("name");
            field2.setAccessible(true);
            field2.set(person,"xiao hong");
            System.out.println(person.getName());

        }
    /*
    Java的反射API提供的Field类封装了字段的所有信息：

    通过Class实例的方法可以获取Field实例：getField()，getFields()，getDeclaredField()，getDeclaredFields()；

    通过Field实例可以获取字段信息：getName()，getType()，getModifiers()；

    通过Field实例可以读取或设置某个对象的字段，如果存在访问限制，要首先调用setAccessible(true)来访问非public字段。

    通过反射读写字段是一种非常规方法，它会破坏对象的封装。
    */
}





