package cn.itcast.day07.demo01;

import java.util.Scanner;//导包

/*
Scanner类的功能，可以实现键盘输入数据到程序当中

1.导包
import 包路径.类名称
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
只有java.lang包下的内容不需要导包，其他的包都需要import语句

* */
public class demo01Scanner {
    public static void main(String[] args) {
        //System.in代表从键盘输入
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();//获取键盘输入的一个int数字
        System.out.println(num);
        String str=scanner.next();//获取键盘输入的一个字符串
        System.out.println(str);
        double dou=scanner.nextDouble();//获取键盘输入的一个double数字
        System.out.println(dou);
    }

}
