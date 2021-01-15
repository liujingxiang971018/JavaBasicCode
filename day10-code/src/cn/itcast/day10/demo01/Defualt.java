package cn.itcast.day10.demo01;
/*
1、接口的默认方法，可以通过接口实现类对象，直接调用
2、接口的默认方法， 可以被接口实现类进行重写
* */
public class Defualt {
    public static void main(String[] args) {
        MyInterfaceDefault i=new MyInterfaceDefault();
        i.Defaultmethod();//实现默认方法
    }
}
