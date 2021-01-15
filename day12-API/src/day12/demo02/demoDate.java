package day12.demo02;
/*
* 日期类
* java.util.Date：表示提起和时间的类
* 类Date表示特定的瞬间，精确到毫秒
* 1000毫秒=1秒
* 毫秒值的作用：可以对时间和日期进行计算。可以日期转成毫秒进行计算，计算完成后再转成日期
*
* 把日期转换为毫秒：
* 时间原点（0毫秒）：1970年1月1日00:00:00
* 就是计算当前日期到时间原点之间一共经历了多少毫秒
*
* 把毫秒转换成日期
* 1天=86400*1000毫秒
*
* */
public class demoDate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前时间的毫秒
    }
}
