package com.rjf.advance.reflect;

import java.lang.reflect.Constructor;

public class InvokeConstruct {
    public static void main(String[] args) throws Exception {

        //等价操作
        /*
            调用Class.newInstance()的局限是，它只能调用该类的public无参数构造方法。
            如果构造方法带有参数，或者不是public，就无法直接通过Class.newInstance()来调用。
        */
        Person person=new Person();
        Person person1=Person.class.newInstance();


        // 获取构造方法Integer(int):
        Constructor cons1 = Integer.class.getConstructor(int.class);
        // 调用构造方法:
        Integer n1 = (Integer) cons1.newInstance(123);
        System.out.println(n1);

        // 获取构造方法Integer(String)
        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);

        /*
            Constructor对象封装了构造方法的所有信息；

            通过Class实例的方法可以获取Constructor实例：getConstructor()，getConstructors()，getDeclaredConstructor()，getDeclaredConstructors()；

            通过Constructor实例可以创建一个实例对象：newInstance(Object... parameters)；
            通过设置setAccessible(true)来访问非public构造方法。
        */

    }
}
