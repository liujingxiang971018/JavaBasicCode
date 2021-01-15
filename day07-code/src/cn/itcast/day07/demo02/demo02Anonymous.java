package cn.itcast.day07.demo02;

import java.util.Scanner;

public class demo02Anonymous {
    public static void main(String[] args) {
//        普通使用方式
//        Scanner scn=new Scanner(System.in);
//        int num=scn.nextInt();

        //使用匿名的方式
        int num=new Scanner(System.in).nextInt();
        System.out.println(num);

        //使用匿名对象进行传参
        method(new Scanner(System.in));
    }
    public static void method(Scanner sc){
        int num=sc.nextInt();
        System.out.println(num);
    }
    //返回类对象
    public static Scanner method(){
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        return scn;
    }

}
