package day12.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.text.DateFormat:是日期/时间格式化子类的抽象类
* 作用：
* 格式化（也就是日期->文本）、解析（文本->日期）
* 成员方法：
*   String format(Date date)按照指定的模式，把Date日期格式化为符合模式的字符串
*   Date parse(String source)把符合模式的字符串，解析为Date日期
* DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类
*
* java.text.SimpleDateFormat extends DateFormat
*
* 构造方法：
*   SimpleDataFormat(String pattern)用给定的模式和默认语言环境的日期格式符号构造
*   参数：
*       String pattern:传递指定的模式
*   模式：区分大小写的
*       y   年
*       M   月
*       d   日
*       H   时
*       m   分
*       s   秒
*   写对应的模式，会把模式替换为对应的日期和时间
*       “yyyy-MM-dd HH:mm:ss”
*       "yyyy年MM月dd日 HH时mm分ss秒"
*注意：
*   模式中的字母不能更改，连接模式的符号可以更改
* */
public class demo03DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /*
    * 使用DateFormat类中的方法format，把日期格式化为文本
    * String format(Date date) 按照指定的模式，把Date日期，格式化为符合模式的字符串
    * 使用步骤：
    *   1、创建SimpleDateFormat对象，构造方法传递指定的模式
    *   2、调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）
    * */
    private static void demo01() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date=new Date();
        String text=sdf.format(date);
        System.out.println(text);//2019-09-25 21:03:43
    }

    /*
    * 使用DateFormat类中的方法parse，把文本解析为日期
    * Date parse(String source)把符合模式的字符串，解析为Date日期
    * 使用步骤：
    *   1、创建SimpleDateFormat对象，构造方法传递指定的模式
    *   2、调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为Date日期
    * */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date text=new Date();

        //需要导入异常检查ParseException
        Date date=sdf.parse(sdf.format(text));//创造一个日期文本，再传承日期
        System.out.println(date);
    }
}
