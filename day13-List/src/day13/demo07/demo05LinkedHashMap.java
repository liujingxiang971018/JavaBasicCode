package day13.demo07;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
* java.util.LinkedHashMap<K,V> extends HashMap<K,V>
* 有序，存入顺序和取出顺序一致
* 底层原理：
*   哈希表+链表（记录元素的顺序）
* */
public class demo05LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> map=new LinkedHashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");

        System.out.println(map);//{a=a, b=b, c=c}
    }
}
