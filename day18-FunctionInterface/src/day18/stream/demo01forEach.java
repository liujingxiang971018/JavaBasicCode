package day18.stream;

import java.util.stream.Stream;

/*
* void forEach(Consumer<? super T> action);
* */
public class demo01forEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream=Stream.of("张三","李四","王五");
        stream.forEach((String name)->{
            System.out.println(name);
        });
    }
}
