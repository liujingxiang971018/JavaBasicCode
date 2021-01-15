package cn.itcast.day08.demo04;
/*
java.util.Math类似数学相关的工具类，提供了大量的静态方法，完成与数学运算相关的操作

public static double abs(double num) 获取绝对值
public static double ceil(double num) 向上取整
public static double floor(double num) 向下取整
public static long round(double num) 四舍五入

Math.PI:表示圆周率
* */
public class demo02Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2));
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.floor(5.4));
        System.out.println(Math.round(5.6));
    }
}
