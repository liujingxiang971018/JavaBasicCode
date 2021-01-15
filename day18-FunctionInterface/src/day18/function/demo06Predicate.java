package day18.function;

import java.util.function.Predicate;

/*
* java.util.function.Predicate<T>接口
* 作用：对某种数据类型的数据进行判断，结果返回一个boolean值
* 抽象方法：boolean test(T t):用来对指定的数据类型进行判断的方法
*
* 默认方法：andThen
* */
public class demo06Predicate {
    //定义一个方法
    public  static boolean checkstring(String s, Predicate<String> predicate){
        return predicate.test(s);
    }

    public static void main(String[] args) {
        String s="A,B,C,D";
        boolean b=checkstring(s, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //判断字符串中是否都是大写字母
                String[] strings=s.split(",");
                boolean b0=true;
                for(String s1:strings){
                    if(s1.charAt(0)<'A'||s1.charAt(0)>'Z')
                        b0=false;
                }
                return b0;
            }
        });
        System.out.println(b);
    }
}
