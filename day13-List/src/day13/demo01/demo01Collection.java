package day13.demo01;
/*
* 集合：java中提供的一种容器，可以用来存储多个数据
* 数组的长度是固定的，集合的长度是可变的
* 数组中存储的是同一类型的元素，可以存储基本数据类型值，集合存储的都是对象，而且对象的类型可以不一致。
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
* 集合框架：
* Vector集合（了解）
* ArrayList集合（重点）：底层是数组实现的，查询快，增删慢
* LinkedList集合（次之）：底层是链表实现的，查询慢，增删快
* TreeSet集合（了解）：底层是二叉树实现的，一般用于排序
* HashSet集合（重点）：底层是哈希表+（红黑树）实现的，无索引，不可以存储重复元素，存取无序
* LinkedHashSet集合（次之）：底层是哈希表+链表实现的，无索引，不可以存储重复元素，可以保证存取顺序
*
* List接口：（单列集合）
* 1、有序的集合（存储和取出元素顺序相同）
* 2、允许存储重复的元素
* 3、有索引
*
* Set接口：（单列集合）
* 1、不允许存储重复元素
* 2、没有索引
* 3、TreeSet和HashSet是无序的集合
*
* Collection接口（供List接口和Set接口继承）：
* 定义的是所有单列集合中共性的方法
* 所有的单列集合都可以使用共性的方法
* 没有带索引的方法
*
* 学习集合的目标：
* 1、会使用集合存储数据
* 2、会遍历集合，把数据取出来
* 3、掌握每种集合的特性
*
*
*Collection集合的方法：
* boolean add(E e);
* boolean remove(E e);  删除集合中的某个元素
* void clear();
* boolean contains(E e);    判断集合中是否包含某个元素
* boolean isEmpty();
* int size();
* Object[] toArray();   将集合转成一个数组
*
* */
public class demo01Collection {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("hello");
        collection.add("world");
        collection.remove("hello");

        //Collection集合无法直接遍历集合中的元素，可借助Iterator迭代器
        System.out.println(collection);//[world]
        collection.clear();
        System.out.println(collection);//[]
        collection.add("java");
        boolean b=collection.contains("java");
        System.out.println(b);//true

        Object[] array=collection.toArray();//转成数组
        System.out.println(array.length);
    }
}
