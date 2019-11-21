package com.rjf.reflect;

import java.lang.reflect.Field;

public class GetField {

        public static void main (String[]args) throws Exception {
           Object o=new Person("Xiao Ming");
           Class c=o.getClass();
            Field field=c.getDeclaredField("name");
            Object value=field.get(o);
            System.out.println(value);

            Person person=new Person("xiao ming");
            Class c2=person.getClass();
            Field field1=c.getDeclaredField("name");
            field1.setAccessible(true);
            field1.set(o,"xiao hong");
            System.out.println(person.getName());

        }
}



