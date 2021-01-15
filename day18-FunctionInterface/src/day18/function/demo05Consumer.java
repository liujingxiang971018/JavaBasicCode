package day18.function;

import java.util.function.Consumer;

/*
* java.util.function.Consumer<T>接口则正好与Supplier接口相反
*   它不是生产一个数据，而是消费一个数据
*   抽象方法：void accept(T t)
*
*
* Consumer接口的默认方法andThen
* 作用：需要两个Consumer接口，可以吧两个Consumer接口组合到一起，再对数据进行消费
* 例：Consumer<String> c1;
* Consumer<String> c2;
* String s="hello";
* c1.accept(s);
* c2.accept(s);
* 连接两个Consumer接口，再进行消费
* c1.andThen(c2).accept(s);谁写前边谁先消费
*
* Consumer接口是一个消费型接口
* */
public class demo05Consumer {
    //定义个方法
    public static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }

    public static void main(String[] args) {
        method("liujingxiang", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
