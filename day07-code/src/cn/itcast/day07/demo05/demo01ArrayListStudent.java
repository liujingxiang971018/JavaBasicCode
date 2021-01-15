package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
自定义4个学生对象，添加到集合并遍历

1、自定义Student学生类
2、创建一个集合，用来存储学生对象，泛型：<Student>
3、根据类，创建4个学生对象
4、add
5、遍历
* */
public class demo01ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student[] students=new Student[4];
        for (int i = 0; i < 4; i++) {
            students[i]=new Student("nihao",18);
            list.add(students[i]);
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));//返回的是对象地址
        }
        method(list);
    }
    //使用集合对象作为参数
    public static void method(ArrayList<Student> list){
        System.out.println(list.get(0).getName());
    }
    //同样可以返回集合对象
}
