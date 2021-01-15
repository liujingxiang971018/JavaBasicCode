package cn.itcast.day11.demo01;
/*
final关键字代表最终、不可改变的

常见的四种使用方法
1、可以用来修饰一个类,
2、可以用来修饰一个方法
3、还可以用来修饰一个局部变量
4、还可以用来修饰一个成员变量

* */
public class demo01Final {
    static final int k=1;//静态全局变量

    public static void main(String[] args) {
        //一旦使用final关键字用来修饰局部变量，那么这个变量不能进行更改。
        final int num=10;
//    num=20;//错误写法

        //对于基本类型来说，不可变说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是引用名称对应的地址不可改变，但内容可以改变
        final Student stu=new Student("liujingxiang");
//        stu=new Student("sun");//错误写法
        stu.setName("sun");
        System.out.println(stu.getName());
    }

}
