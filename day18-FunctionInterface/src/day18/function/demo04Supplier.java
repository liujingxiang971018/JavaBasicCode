package day18.function;

import java.util.function.Supplier;

/*
* 常用的函数式接口
* java.util.function.Supplier<T>接口仅包含一个无参的方法： T get():用来获取一个泛型参数的指定类型的对象数组
*
* Supplier<T>接口被称为生产型接口，指定接口的泛型是什么类型，那么接口中get方法就会生产什么类型的数据
* */
public class demo04Supplier {
    //定义一个方法
    public static String getstring(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String s=getstring(new Supplier<String>() {
            @Override
            public String get() {
                return "nihao";
            }
        });
        System.out.println(s);
    }
}
