package com.rjf.annotation;

public class UseAnnotation {

    @Check()
    public int score;

    public static void main(String[] args) throws Exception{
      UseAnnotation useAnnotation=new UseAnnotation();
      useAnnotation.score=-1;
      System.out.println(useAnnotation.score);
      AnnoLogi.check(useAnnotation);

    }



    /*
        注解（Annotation）是Java语言用于工具处理的标注：

        注解可以配置参数，没有指定配置的参数使用默认值；

        如果参数名称是value，且只有一个参数，那么可以省略参数名称。
      */
    /*
    可以在运行期通过反射读取RUNTIME类型的注解，注意千万不要漏写@Retention(RetentionPolicy.RUNTIME)，否则运行期无法读取到该注解。

    可以通过程序处理注解来实现相应的功能：

    对JavaBean的属性值按规则进行检查；
    JUnit会自动运行@Test标记的测试方法。
    */
}
