package day13.demo07;

import java.util.HashMap;
import java.util.Set;

/*
* HashMap存储自定义类型键值
* Map集合保证key是唯一的
*   自定义类型作为key的元素，必须重写hashCode方法和equals方法,以保证key唯一
*   基本元素作为key元素，需要保证key唯一
* */
public class demo04HashMap {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {

    }

    private static void show01() {
        HashMap<String,demo04Person> map=new HashMap<>();
        map.put("北京",new demo04Person("liu",10));
        map.put("上海",new demo04Person("liu",11));
        map.put("成都",new demo04Person("liu",12));
        //遍历
        Set<String> set=map.keySet();
        for(String s:set){
            demo04Person value=map.get(s);
            System.out.println(value);
        }
    }
}
