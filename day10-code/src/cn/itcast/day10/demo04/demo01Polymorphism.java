package cn.itcast.day10.demo04;
/*
代码中体现多态性，其实就是一句话：【父类引用指向子类对象】左父右子
格式：
父类名称 对象名=new 子类名称（）；
或者：
接口名称 对象名=new 实现类名称（）；
* */
public class demo01Polymorphism {
    public static void main(String[] args) {
        Fu obj=new Zi();
        obj.method();//子类

        obj.methodFu();//父类
    }
}
