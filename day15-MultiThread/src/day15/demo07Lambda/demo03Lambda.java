package day15.demo07Lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
* 有参数有返回值
 * 需求：
 *   使用数组存储多个Person对象
 *   对数组中的Person对象使用Arrays的sort方法通过年龄进行升序
* */
public class demo03Lambda {
    public static void main(String[] args) {
        demo03Person[] arr={
                new demo03Person("liu",11),
                new demo03Person("jing",12),
                new demo03Person("xiang",10)
        };
        /*Arrays.sort(arr,new Comparator<demo03Person>(){
            @Override
            public int compare(demo03Person demo03Person, demo03Person t1) {
                return demo03Person.getAge()-t1.getAge();
            }
        });*/

        //使用Lambda表达式
        Arrays.sort(arr,(demo03Person o1,demo03Person o2)->{
            return o1.getAge()-o2.getAge();
        });//也能成功排序

        for (demo03Person p:arr) {
            System.out.println(p);
        }
    }
}
