package day18.function;

import java.util.function.Function;

/*
* java.util.function.Function<T,R>接口
* 作用：根据一个类型的数据得到另一个类型的数据，前者称为前置条件，后者称为后置条件
*
* 抽象方法：
*   R apply(T t)
*
* 默认方法：andThen.用来进行组合操作。
* 例：字符串先转成整型，再转成字符串
* */
public class demo07Function {
    //定义一个方法
    public static String transfer(Integer i, Function<Integer,String> function){
        return function.apply(i);
    }

    public static void main(String[] args) {
        Integer integer=123;
        //调用方法
        String s=transfer(integer, new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer.toString();
            }
        });
        System.out.println(s);
    }
}
