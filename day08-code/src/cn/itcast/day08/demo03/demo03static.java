package cn.itcast.day08.demo03;
/*

* */
public class demo03static {
    public static void main(String[] args) {
        Person one=new Person();//先执行静态代码块，在执行构造函数
        Person two=new Person();
    }
}
