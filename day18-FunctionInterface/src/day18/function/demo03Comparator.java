package day18.function;

import java.util.Arrays;
import java.util.Comparator;

/*
* 使用函数接口作为返回值
* */
public class demo03Comparator {
    //定义一个方法，方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getcomp(){
        return new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                //按照字符串的降序排序
                return t1.length()-s.length();
            }
        };
    }

    public static void main(String[] args) {
        String[] strings={"a","bb","cccc"};
        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings,getcomp());

        System.out.println(Arrays.toString(strings));
    }
}
