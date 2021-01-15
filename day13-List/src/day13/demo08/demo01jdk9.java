package day13.demo08;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
* jdk9的新特性：of方法
* List接口、Set接口、Map接口里面增加了一个静态的新方法of，可以给集合一次添加多个元素，然后不再改变。
* 注意：
*   1、of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
*   2、of方法的返回值是一个不能改变的集合，不能在使用add、put方法
*   3、Set接口和Map接口在调用of方法的时候，不能有重复的元素，否则抛出异常
* */
public class demo01jdk9 {
    public static void main(String[] args) {
        List<String> list=List.of("a","b","c");
        System.out.println(list);
//        list.add("w");//UnsupportedOperationException

//        Set<String> set= Set.of("a","b","c","a");//IllegalArgumentException
//        Map<String,Integer> map= Map.of("张三",1,"李四",2,"张三",22);//键重复
    }
}
