package cn.itcast.day06.demo1;

import java.util.Arrays;

/*

 * */
public class demo01printarray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        //要求打印格式为：[1,2,3,4,5,6]
        //使用面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");//+后面必须是字符串格式
            }
            else{
                System.out.print(array[i]+",");
            }
        }
        System.out.println("++++++++++");
        //面向对象，使用JDK提供好的Arrays类，使用toString方法
        System.out.println(Arrays.toString(array));
    }
}
