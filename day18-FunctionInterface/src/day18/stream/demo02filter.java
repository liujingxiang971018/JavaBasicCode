package day18.stream;

import java.util.stream.Stream;

/*
* Stream<T> filter(Predicate<? super T> predicate);
* */
public class demo02filter {
    public static void main(String[] args) {
        //创建stream流
        Stream<String> stream=Stream.of("刘景祥","孙悦颖","帅剑波");
        //Lambda表达式
        stream.filter((String name)->{
            return name.startsWith("刘");}).filter((String name)->{
                return name.length()==3;}).forEach((String s)->{
            System.out.println(s);
        });

        /*
        * Stream流属于管道流，只能被消费（使用）一次
        * 第一个Stream流调用完毕方法，数据就会流转到下一个Stream上
        * 而这时第一个Stream流已经使用完毕，就会关闭了
        * 所以第一个Stream流就不能再使用方法了
        * */
    }
}
