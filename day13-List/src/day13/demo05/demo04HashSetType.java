package day13.demo05;

import java.util.HashSet;

/*
* HashSet存储自定义类型元素
* set集合按照元素唯一。
*   存储的元素(String,Integer,...Student,Person...),必须重写HashCode方法和equals方法
*
* 要求：
*   同名同年龄的人，视为同一个人，只能存储一次
* */
public class demo04HashSetType {
    public static void main(String[] args) {
        HashSet<demo04Person> set=new HashSet<>();
        demo04Person p1=new demo04Person("liu",11);
        demo04Person p2=new demo04Person("liu",11);
        demo04Person p3=new demo04Person("jingxiang",12);
        //必须重写hashCode方法和equals方法，实现去重
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);//[Person[name=jingxiang,age=12], Person[name=liu,age=11]]
    }
}
