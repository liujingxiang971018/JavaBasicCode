package day13.demo04;

import java.util.ArrayList;
import java.util.List;

/*
* java.util.list接口，extends Collection接口
* list接口的特点：
*   1、有序的集合，存储元素和取出元素的顺序是一致的（存储1,2,3，取出1,2,3）
*   2、有索引，包含了一些带索引的方法
*   3、允许存储重复的元素
*
* list接口中带索引的方法（特有）
*   public void add(int index,E element):将指定的元素添加到集合中的指定位置
*   public E get(int index):返回集合中指定位置的元素
*   public E remove(int index):移除集合中指定位置的元素，返回的是被移除的元素
*   public E set(int index,E element):用指定元素替换集合中指定位置的元素，返回更新前的元素
*
* 注意：操作索引的时候，一定要防止索引越界
* */
public class demo01List {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        System.out.println(list);//[a,b,a]

        list.add(0,"a");
        System.out.println(list);//[a,a,b,a]

        System.out.println(list.get(0));//a

        list.remove(0);
        System.out.println(list);//[a,b,a]

        list.set(0,"b");
        System.out.println(list);//[b,b,a]

    }
}
