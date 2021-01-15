package day13.demo05;

import java.util.HashSet;

/*
* Set集合不允许存储重复元素的原理
* */
public class demo03HashSet {
    public static void main(String[] args) {
        //创建集合
        HashSet<String> set=new HashSet<>();
        String s1=new String("abc");
        String s2=new String("abc");
        //Set集合调用add方法的时候， 会调用元素的hashCode方法和equals方法，先判断元素哈希值，若相同则判断equals，若为true则重复
        set.add(s1);//无效
        set.add(s2);//无效
        //“重地”和“通话”的哈希值相同。（特殊例子）
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }
}
