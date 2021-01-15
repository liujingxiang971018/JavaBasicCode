package cn.itcast.day08.demo01;
/*
java.lang.String类代表字符串
程序当中所有的双引号字符串，都是String类的对象

特点：
1、字符串的内容永不可变[重点]
2、正是因为字符串不可改变，所以字符串是可以共享使用的
3、字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组

创建字符串的3+1种方式
三种构造方式
public String();创建一个空字符串，不含有任何内容
public String(char[] array);根据字符数组的内容来创建对应的字符串
public String(byte[] array);根据字节数组的内容来创建对应的字符串
一种直接创建
String str="hello";

字符串常量池，程序当中直接写上的双引号字符串，就在字符串常量池中
对于基本类型来说，==是进行数值的比较
对于引用类型来说，==是进行地址的比较

* */
public class demo01String {
    public static void main(String[] args) {
        String str1=new String();
        char[] chararray={'1','2','3'};
        String str2=new String(chararray);
        byte[] bytearray={97,98,99};//通过ascii码编码
        String str3=new String(bytearray);
        System.out.println(str2+str3);

    }
}
