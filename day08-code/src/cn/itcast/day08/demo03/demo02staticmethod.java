package cn.itcast.day08.demo03;
/*
一旦使用static修饰成员方法，那么久成为了静态方法，静态方法不属于对象，只属于类

如果没有static关键字，那么必须首先创建对象，然后通过对象使用它
如果有static关键字，直接使用类名称来使用它
静态变量：类名称.静态变量
静态方法：类名称.静态方法();

注意：
1、类中静态方法只能访问静态变量，不能直接访问非静态变量
原因：在内存当中先有静态内容，后有的非静态内容
2、静态方法中不能用this关键字
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。
* */
public class demo02staticmethod {
    public static void main(String[] args) {
        MyClass one=new MyClass();
        one.method();//才能调用没有static关键字的方法

        //对于静态方法，直接通过类名称调用
        MyClass.methodStatic();

        //对于本来当中的静态方法，可以省略类名称
        method();
    }
    public static void method(){
        System.out.println("本类静态方法");
    }
}
