package day13.demo04;

import java.util.LinkedList;

/*
* List接口的链表实现
* java.util.LinkedList集合 implements List接口
* 特点：
*   1、底层是一个链表结构
*   2、里面包含了大量操作首尾元素的方法
*
* 注意：使用LinkedList集合特有的方法，不能使用多态
*
* public void addFirst(E,e):将指定元素插入到列表开头
* public void addLast(E e):将指定元素添加到此列表的结尾
* public void push(E e):将元素插入此列表所对应的堆栈  ->等效于addFirst()
*
* public E getFirst():返回列表中的第一个元素
* public E getLast():返回此列表的最后一个元素
*
* public E removeFirst():删除并返回列表的第一个元素
* public E removeLast():删除并返回列表的最后一个元素
* public E pop():从此列表所表示的堆栈退出一个元素  ->等效于removeFirst() 等效于remove();
*
* public boolean isEmpty():如果列表不包含元素，则返回true
*
* */
public class demo03LinkedList {
    public static void main(String[] args) {
        show01();
    }
    //add
    private static void show01() {
        LinkedList<String> list=new LinkedList<>();//未使用多态
        list.add("a");
        list.add("b");
        list.add("c");

        list.addFirst("www");
        System.out.println(list);

        list.push("http://");
        System.out.println(list);

        list.addLast(".com");
        System.out.println(list);

        //get
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //remove
        list.removeFirst();//删除第一个元素
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.pop();//删除第一个元素
        System.out.println(list);
        list.remove();//删除第一个元素
        System.out.println(list);

        list.clear();
        System.out.println(list.isEmpty());
    }
}
