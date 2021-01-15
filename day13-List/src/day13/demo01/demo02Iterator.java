package day13.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator
* Collection集合无法直接遍历集合中的元素，可借助Iterator迭代器
* Iterator接口的常用方法：
*   boolean hasNext();如果任由元素可以迭代，则返回true，否则返回false。
    E next();返回迭代的下一个元素

  Iterator迭代器，是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方法比较特殊
  Collection接口中由一个方法，叫iterator()，这个方法返回的就是迭代器的实现类对象。

  迭代器的使用步骤（重点）：
        1、使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收
        2、使用Iterator接口中的方法hasNext()判断还有没有下一个元素
        3、使用next()方法获取下一个元素

*/
public class demo02Iterator {
    public static void main(String[] args) {
        Collection<String> strings=new ArrayList<>();
        strings.add("java");
        strings.add("11");

        Iterator<String> iterator=strings.iterator();//获取迭代器
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //增强for循环(也成为for each循环)是JDK1.5之后的新特性
        for(String s:strings){
            System.out.println(s);
        }

        int[] arr={1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
    }
}
