package day12.demo06;
/*
* String类：
*   字符串是常量，它们的值在创建之后不能更该。其底层是被final修饰的数组。（效率低下）
*
* java.long.StringBuilder
* StringBuilder类：即字符串缓冲区
* 字符串缓冲区，可以提高字符串的操作效率（看成一个可以变化的字符串）
* 底层也是一个数组，但是没有被final修饰，可以改变长度
*
* 构造方法：
*   public StringBuilder();
*   public StringBuilder(String str);
*
* 成员方法：
*   public StringBuilder append(...);添加任意类型数据的字符串形式，并返回当前对象自身。
*   public StringBuilder reverse(...);将字符串进行反转，返回当前对象自身。
*
* */
public class demo01StringBuilder {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }
    /*
    * StringBuilder和String可以相互转换
    * String->StringBuilder:可以使用StringBuilder的构造方法
    *   StringBuilder(String str);
    * StringBuilder->String:可以使用StringBuilder中的toString方法
    *   public String toString();将当前StringBuilder对象转换为String对象.
    * */
    private static void demo03() {
        String str="hello java";
        StringBuilder bu=new StringBuilder(str);
        System.out.println(bu);
        bu.append(" hi");
        String str2=bu.toString();
        System.out.println(str2);
    }

    private static void demo02() {
        StringBuilder bu1=new StringBuilder();
        StringBuilder bu2=bu1.append("abc");
        System.out.println(bu1);//abc
        System.out.println(bu2);//abc
        System.out.println(bu1==bu2);//true 两个对象是同一个对象

        //使用append方法无需接受返回值
        bu1.append(1);
        bu1.append('a');
        System.out.println(bu1);

        //链式编程：方法的返回值是一个对象，可以使用对象对叙调用方法
        bu1.append(2).append('b').append(1.1);
        System.out.println(bu1);
    }

    private static void demo01() {
        StringBuilder bu1=new StringBuilder();
        System.out.println("bu1:"+bu1);

        StringBuilder bu2=new StringBuilder("abc");
        System.out.println("bu2:"+bu2);
    }
}
