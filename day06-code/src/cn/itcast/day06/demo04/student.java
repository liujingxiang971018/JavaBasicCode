package cn.itcast.day06.demo04;
/*
构造方法：专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构建方法。
格式：
public 类名称（参数类型 参数名称）{
    方法体
}
1、构造方法不用写返回值类型,连void都不写
2、构造方法不能return一个具体的返回值
3、如果没有编写构造方法，那么编译器就会默认赠送一个构造方法，没有参数，方法体什么都不做
4、一旦编写了至少一个构造方法，那么编译器将不再赠送
5、构造方法也可以重载
* */
public class student {
    private String name;
    private int age;
    public student(){
        System.out.println("执行构造函数");
    }
    public student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(this.name+" "+this.age);
    }
}
