package com.rjf.reflect;

public class GetExtendsAndInterfacesDemo {
    public static  void  main(String[] args){

        //获取父类
        Class cls=Integer.class.getSuperclass();
        System.out.println(cls);

        Class cls1=cls.getSuperclass();
        System.out.println(cls1);

        //获取interface
        Class[] cls2=Integer.class.getInterfaces();
        for (Class c: cls2) {
            System.out.println(c);
        }

        /*

                通过Class对象可以获取继承关系：

                Class getSuperclass()：获取父类类型；
                Class[] getInterfaces()：获取当前类实现的所有接口。
                通过Class对象的isAssignableFrom()方法可以判断一个向上转型是否可以实现。

        */

    }
}
