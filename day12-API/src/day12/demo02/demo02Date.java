package day12.demo02;

import java.util.Date;

public class demo02Date {
    public static void main(String[] args) {
        demo02();
        demo03();
    }

    /*
    * Date类的空参数构造方法
    * Date()获取当前系统的日期和时间
    * */
    private static void demo02() {
        Date date=new Date();
        System.out.println(date);//Wed Sep 25 20:39:25 CST 2019
    }

    /*
    * Date类的有参构造方法
    * Date(long date)：传递毫秒值，把毫秒值转换成日期
    * */
    private static void demo03() {
        Date data1=new Date();
        System.out.println(data1);
        //getTime()将日期转成毫秒
        Date date2=new Date(data1.getTime());//把毫秒值转成日期
        System.out.println(date2);
    }
}
