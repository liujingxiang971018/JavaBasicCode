package day13.demo07;

import java.util.HashMap;
import java.util.Map;

public class demo02MapMethod {
    public static void main(String[] args)  {
        show01();
    }
    /*
    * public V put(K key,V value);把指定的键值对添加到Map集合中,
    *   返回值V：
    *       存储键值对的时候，key不重复，返回是null
    *       存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value
    * public V remove(Object key);删除指定键对应的值，返回被删除的值
    * public boolean containsKey(Object key);判断是否存在键，有返回true
    * */
    private static void show01() {
        Map<String,String> map=new HashMap<>();
        String v1=map.put("刘晨","范冰冰");//如果用int来接收null，会报空指针异常
        System.out.println("v1="+v1);//NULL
        System.out.println(map.get("刘晨"));//范冰冰

        boolean k=map.containsKey("刘晨");
        System.out.println(k);//true

        String value=map.remove("刘晨");
        System.out.println(value);//范冰冰
        System.out.println(map.get("刘晨"));//null


    }
}
