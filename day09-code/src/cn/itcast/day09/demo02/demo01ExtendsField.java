package cn.itcast.day09.demo02;
/*
在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式

直接通过子类对象访问成员变量
    等号左边是谁，就优先用谁，没有则向上找
简介通过成员方法访问成员变量
    该方法属于谁，就优先用谁，没有则向上找
* */
public class demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu=new Fu();
        Zi zi=new Zi();

        //等号左边是谁，就优先用谁
        System.out.println(zi.num);//优先子类
        zi.methodZi();
    }
}
