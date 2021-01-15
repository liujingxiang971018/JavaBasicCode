package day13.demo07;

import java.util.HashMap;

/*
*
* java.util.Hashtable<K,V>集合 implements Map<K,V>接口
* 实现哈希表，是一个线程安全的集合，单线程，速度慢
* HashMap是线程不安全的集合，多线程，快
*
* HashMap可以存储null值，null键
* Hashtable不能存储null键，null值
*
* Hashtable和Vector集合一样，在JDK1.2之后被取代
* Hashtable的子类Properties可用
* */
public class demo06Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put("c","c");
        System.out.println(map);//{null=a, b=null, c=c}

    }
}
