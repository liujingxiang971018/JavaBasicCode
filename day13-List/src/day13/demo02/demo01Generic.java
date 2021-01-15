package day13.demo02;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 泛型：是一种未知的数据类型，当我们不知道使用什么数据类型，可以使用泛型
* 泛型也可以看成是一个变量，用来接收数据类型
* E->Element元素
* T->Type类型
*
* 创建集合对象的时候，就会确定泛型的数据类型
* */
public class demo01Generic {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
    * 创建集合对象，使用泛型
    * 好处：
    *   1、避免类型转换的麻烦，存储是什么类型，取出就是什么类型。
    *   2、把运行期异常（代码运行之后会抛出的异常），提升到了编译器（写代码的时候会报错）
    * 坏处：
    *   只能存储一种类型
    * */
    private static void demo02() {
        ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("11");
        //增强for循环
        for(String s:list){
            System.out.println(s.length());
        }
    }

    /*
    * 创建集合对象，不适用泛型。
    * 好处：集合不适用泛型，默认的类型就是object类型，可以存储任意类型的数据
    * 坏处：不安全，会引发异常(例如类型转换异常)。
    * */
    private static void demo01() {
        //不适用泛型
        ArrayList list=new ArrayList();
        list.add("abc");
        list.add(1);
        list.add(1.1);
        //使用迭代器遍历
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //使用for循环
        for (Iterator it = iterator; it.hasNext(); ) {
            Object s = it.next();
            System.out.println(s);
        }


    }
}
