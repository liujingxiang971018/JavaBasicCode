package day12.demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        //空参构造
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());//转成毫秒值
        //有参构造,毫秒值
        Date date=new Date(3000L);
        System.out.println(date);

        //创建日期格式化对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format=sdf.format(d);
        System.out.println(format);

        //解析字符串
        String str="2099年01月01日 00:00:00";
        Date parse=sdf.parse(str);
        System.out.println(parse);

        //获取对象
        Calendar c=Calendar.getInstance();
        c.set(2019,11,11);
        c.add(Calendar.YEAR,-2);
        int year=c.get(Calendar.YEAR);
        System.out.println(year);
    }
}
