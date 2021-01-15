package day12.demo03;

import java.util.Calendar;
import java.util.Date;

/*
* 成员方法：
* public int get(int field):返回给定日历字段的值
* public void set(int field,int value):将给定的日历字段设置为给定值
* public abstract void add(int field,int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
* public Date getTime();返回一个表示Calendar时间值
* 成员方法的参数：
*   int field:日历类的字段，可以使用Calendar类的静态成员变量获取
*       public static final int YEAR=1;年
*       public static final int MONTH=2;月
*       public static final int DATE=5;日
*       public static final int HOUR=10;时
 *      public static final int MINUTE=12;分
 *      public static final int SECOND=13;秒
 * */
public class demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }
    //使用getTime()方法
    private static void demo04() {
        Calendar c=Calendar.getInstance();
        Date date=c.getTime();
        System.out.println(date);
    }

    //使用add方法:把指定的字段增加/减少指定的值
    private static void demo03() {
        Calendar c=Calendar.getInstance();
        //把年增加两年
        //若改为减少，则为负
        c.add(Calendar.YEAR,2);

        int year=c.get(Calendar.YEAR);
        System.out.println(year);
    }

    //使用set方法
    private static void demo02() {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,2019);
        c.set(Calendar.MONTH,10);
        c.set(Calendar.DATE,15);
        //可以重载
        c.set(2019,11,11);

        int year=c.get(Calendar.YEAR);
        System.out.println(year);

        int month=c.get(Calendar.MONTH);
        System.out.println(month);

        int date=c.get(Calendar.DATE);
        System.out.println(date);


    }
    //使用get方法
    private static void demo01() {
        //使用getInstance获取Calendar对象
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        System.out.println(year);

        int month=c.get(Calendar.MONTH);
        System.out.println(month);

        int date=c.get(Calendar.DATE);
        System.out.println(date);
    }
}
