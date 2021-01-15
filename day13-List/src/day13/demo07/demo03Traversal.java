package day13.demo07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* 遍历Map集合
* 第一种遍历方式：通过键找值的方式Set<K> KeySet()
* 实现：
*   1、使用Map集合中的方法KeySet()，把Map集合所有的key取出来，存储到Set中
*   2、遍历set集合，获取Map集合的每一个key
*   3、找对应的value
*
* 第二种遍历方式：Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的Set视图
* Map.Entry<>K,V>在Map中由一个内部接口Entry。
* Map<String,String>->Set<Map.Entry<K,V>>->Map.Entry<String,String>
* 实现：
*   1、使用Map集合中的方法entrySet()，把Map集合中每个Entry对象取出来，存储到一个Set集合中
*   2、遍历Set集合，获取每一个Entry对象
*   3、使用Entry对象中的方法getKey()和getValue获取键和值
* */
public class demo03Traversal {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("liu","1");
        map.put("jing","2");
        map.put("xiang","3");

        Set<String> set=map.keySet();
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s+"="+map.get(s));
        }

        Map<String,String> map2=new HashMap<>();
        map2.put("liu","1");
        map2.put("jing","2");
        map2.put("xiang","3");
        Set<Map.Entry<String,String>> set2 =map2.entrySet();
        Iterator<Map.Entry<String,String>> iterator2=set2.iterator();
        while (iterator2.hasNext()){
            Map.Entry<String,String> entry=iterator2.next();

            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
