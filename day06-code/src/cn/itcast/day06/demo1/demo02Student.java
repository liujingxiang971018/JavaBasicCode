package cn.itcast.day06.demo1;
/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用
1、导包：指出需要使用的类，在什么位置
import 包名称.类名称
import cn.itcast.data06.demo01.Student
对于和当前类属于同一个包的情况，可以省略导包语句不写
2、创建
类名称 对象名=new 类名称();
Student stu =new student();
3、使用:分为两种情况
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名（参数）
* */
public class demo02Student {
    public static void main(String[] args) {
        //使用Student类，和该文件在同一个包下，所以省略导包语句不写
        //创建
        Student stu=new Student();
        //使用
        System.out.println(stu.name);//默认值为null
        stu.eat();

        stu.name="赵丽颖";
        System.out.println(stu.name);
    }
}
