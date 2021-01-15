package day14.demo02;

import java.util.List;

/*
* 异常的注意事项
* */
public class demo01Exception {
    public static void main(String[] args) {
        /*
        * 多个异常使用捕获如何处理
        *   1、多个异常分别处理
        *   2、多个异常一次捕获，多次处理
        *   3、多个异常一次捕获，一次处理
        * */

        //1、多个异常分别处理
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }
        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }

        //2、多个异常一次捕获，多次处理
        //由于是相同的异常，所以只会输出一个
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutBoundsException
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch (IndexOutOfBoundsException o){
            System.out.println(o);
        }
        /*
        * 一个try多个catch注意事项：
        *   catch里面定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则就会报错
        * */

        //3、多个异常一次捕获一次处理
        try{
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutBoundsException
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        /*
        只要异常都能够接收
        ArrayIndexOutBoundsException extends IndexOutBoundsException
        * */
    }
}
