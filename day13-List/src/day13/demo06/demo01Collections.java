package day13.demo06;

import java.util.ArrayList;
import java.util.Collections;

/*
* java.utils.Collections是集合工具类，用来对集合进行操作
*   public static <T> boolean addAll(Collection<T> c,T...elements);往集合中添加一些元素
*   public static void shuffle(List<?> list);打乱顺序.针对List集合
*
*   public static void sort(List<?> list);升序排序，针对List集合.加上Collections.reverseOrder()则降序
* */
public class demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        //直接向集合中添加一些元素
        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);//[a, b, c, d]
        //打乱顺序
        Collections.shuffle(list);
        System.out.println(list);//[d, b, a, c]
        //排序
        Collections.sort(list,Collections.reverseOrder());//降序
        Collections.sort(list);//升序
        System.out.println(list);
    }
}
