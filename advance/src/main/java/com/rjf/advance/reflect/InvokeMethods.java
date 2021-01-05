package com.rjf.advance.reflect;

import java.lang.reflect.Method;

public class InvokeMethods {
    public static void main(String[] args) throws Exception {

        // 获取Person的hello方法:
        Method method = Person.class.getMethod("hello");

        // 对Person实例调用hello方法:
        method.invoke(new Person());

        /*
            一个Method对象包含一个方法的所有信息：

            getName()：返回方法名称，例如："getScore"；
            getReturnType()：返回方法返回值类型，也是一个Class实例，例如：String.class；
            getParameterTypes()：返回方法的参数类型，是一个Class数组，例如：{String.class, int.class}；
            getModifiers()：返回方法的修饰符，它是一个int，不同的bit表示不同的含义。
        */

        String s="Hello";
        Method method1=String.class.getMethod("substring", int.class,int.class);
        System.out.println(method1.invoke(s,2,4));

        //调用静态方法
        Method method2=Integer.class.getMethod("parseInt", String.class);
        System.out.println(method2.invoke(null,"12345"));


        /*
            调用非public方法
            和Field类似，对于非public方法，我们虽然可以通过Class.getDeclaredMethod()获取该方法实例，但直接对其调用将得到一个IllegalAccessException。
            为了调用非public方法，我们通过Method.setAccessible(true)允许其调用：
        */


        //以下两种方式效果等价
        Method m=Person.class.getMethod("hello");
        m.invoke(new Person());

        Person p=new Person();
        p.hello();

        /*
            Java的反射API提供的Method对象封装了方法的所有信息：

            通过Class实例的方法可以获取Method实例：getMethod()，getMethods()，getDeclaredMethod()，getDeclaredMethods()；

            通过Method实例可以获取方法信息：getName()，getReturnType()，getParameterTypes()，getModifiers()；

            通过Method实例可以调用某个对象的方法：Object invoke(Object instance, Object... parameters)；

            通过设置setAccessible(true)来访问非public方法；

            通过反射调用方法时，仍然遵循多态原则。
        */

    }
}


