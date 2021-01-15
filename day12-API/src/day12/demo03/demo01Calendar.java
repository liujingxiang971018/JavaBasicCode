package day12.demo03;

import java.time.Year;
import java.util.Calendar;

/*
* java.util.Calendar类：日历类
* Calendar类是一个抽象类，不能直接new对象，提供了很多操作日历字段的方法
* 该类无法直接创建对象使用，理由由一个静态方法getInstance()，该方法返回了Calendar类的子类对象
* static Calendar getInstance() 使用默认时区和语言环境获得一个日历
* */
public class demo01Calendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();//多态
        System.out.println(c);
    }
}
