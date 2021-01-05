package com.rjf.advance.generic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GenericDemo {
    public static void main(String[] args){

        Result result1 =new Result<>();
        result1.setData(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(result1.getData());

        Result result2 =new Result<>();
        result2.setData(123);
        System.out.println(result2.getData());

        /*

                部分反射API是泛型，例如：Class<T>，Constructor<T>；

                可以声明带泛型的数组，但不能直接创建带泛型的数组，必须强制转型；

                可以通过Array.newInstance(Class<T>, int)创建T[]数组，需要强制转型；

                同时使用泛型和可变参数时需要特别小心。

        */

    }
}
