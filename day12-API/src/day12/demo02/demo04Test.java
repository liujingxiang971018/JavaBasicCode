package day12.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 练习：计算出一个人已经出生了多少天
* 分析：
*
* */
public class demo04Test {
    public static void main(String[] args) throws ParseException {
        //1、使用Scanner类中的方法next，获取出生日期
        Scanner scanner=new Scanner(System.in);

        String birthday=scanner.next();//获取日期
        //2、使用DateFormat类中的方法parse，把字符串解析为Date格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(birthday);
        //3、把Date格式的出生日期转换为毫秒值
        long birthdayDateTime=date.getTime();
        //4、获取当前日期的毫秒值
        long todayTime=new Date().getTime();
        //5、当前-出生
        long time=todayTime-birthdayDateTime;
        //6、将毫秒值转成天
        long day=time/86400000;
        System.out.println(day);
    }
}
