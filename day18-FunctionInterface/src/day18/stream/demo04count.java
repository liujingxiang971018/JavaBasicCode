package day18.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
* long count()：用于统计Stream流中元素的个数
* 是一个终结方法，返回值是一个long类型的整数
*
* Stream<T> limit(long size):延迟方法，截取流中的元素进行截取
*
* Stream<T> skip(long n):如果流的当前长度为n,则跳过前n个，否则将会得到一个长度为0的空流
*
* static <T> Stream<T> concat(Stream<T> a,Stream<? extends T> b):将连个流合并起来
* */
public class demo04count {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Stream<Integer> stream=list.stream();
        Stream<Integer> stream0=list.stream();

/*        long count=stream.count();
        System.out.println(count);*/
        //截取流中前两个元素
        /*
        * 注意：需要将上两行注释，否则下面两行将第二次使用stream流，导致异常
        * */
/*        Stream<Integer> stream1=stream.limit(2);
        System.out.println(stream1.count());*/
        //跳过前两个，还剩一个
/*        Stream<Integer> stream2=stream.skip(2);
        System.out.println(stream2.count());*/
        //组合
        Stream<Integer> stream3=Stream.concat(stream,stream0);
        System.out.println(stream3.count());//6
    }
}
