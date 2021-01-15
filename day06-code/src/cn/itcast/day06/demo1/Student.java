package cn.itcast.day06.demo1;
/*
属性：
    姓名
    年龄
行为：
    吃饭
    睡觉
    学习
成员变量（属性）：
    String name;
    int age;
成员方法（行为）：//不包含static关键字
    public void eat(){};
    public void sleep(){};
    public void study(){};

注意事项：
1、成员变量是直接定义在类当中的，在方法外边
2、成员方法不要写static关键字
* */
public class Student {
    //成员变量
    String name;
    int age;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
