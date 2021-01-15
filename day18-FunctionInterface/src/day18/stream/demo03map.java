package day18.stream;

import java.util.stream.Stream;

/*
* <R> Stream<R> map(Function<? super T, ? extends R> mapper);
* R apply(T t)
* */
public class demo03map {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("1","2","3");
        Stream<Integer> stream1=stream.map((String s)->{
            return Integer.parseInt(s);
        });
        //遍历
        stream1.forEach((integer -> System.out.println(integer)));//1,2,3
    }
}
