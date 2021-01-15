package day13.demo02;
/*
* 接口的实现类
* 第一种使用方式，定义接口的实现类，实现接口，指定接口的泛型
* 第二种使用方式：接口是什么类型，实现类就使用什么类型，最后在类创建对象的时候定义类型。
* */
public class demo04GenericRealize implements demo04GenericInterface<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
