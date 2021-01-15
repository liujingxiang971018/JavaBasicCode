package day13.demo06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* 自定义类型排序
* 注意事项：
*   sort(List<T> list)使用前提：被排序的集合里面存储的元素，必须实现Comparable，重写接口中的方法compareTo定义排序的规则
* */
public class demo02Sort {
    public static void main(String[] args) {
        ArrayList<demo02Person> list=new ArrayList<>();
        Collections.addAll(list,new demo02Person("张三",11),new demo02Person("李四",12));
        System.out.println(list);
        //降序
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        //不用再类中去重写，直接在这里利用Comparator重写
        Collections.sort(list, new Comparator<demo02Person>() {
            @Override
            public int compare(demo02Person demo02Person, demo02Person t1) {
                return demo02Person.getAge()-t1.getAge();
            }
        });
        System.out.println(list);
    }
}
