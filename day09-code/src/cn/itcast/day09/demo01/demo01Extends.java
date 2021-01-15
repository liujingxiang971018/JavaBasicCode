package cn.itcast.day09.demo01;
/*
在继承的关系中，“子类就是一个父类”，也就是说：子类可以当成父类看待

定义父类的格式（一个普通的类定义）
public  class 父类名称{
    成员变量;
    成员方法;
}

定义子类的格式
public class 子类名称 extends 父类名称{

}
* */
public class demo01Extends {
    public static void main(String[] args) {
        teacher t=new teacher();
        t.method();//直接使用父类的成员方法

        assistant as=new assistant();
        as.method();//调用父类方法
    }
}
