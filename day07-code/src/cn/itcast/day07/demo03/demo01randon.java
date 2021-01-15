package cn.itcast.day07.demo03;

import java.util.Random;

/*
Randon类用来生成随机数字

* */
public class demo01randon {
    public static void main(String[] args) {
        Random random=new Random();
        int num=random.nextInt();//获取一个随机的int数字（范围是int的所有范围，有正负两种）
        System.out.println(num);
        int num2=random.nextInt(3);//获取一个随机的int数字（参数代表范围，左毕右开区间,非负数）
        System.out.println(num2);
    }
}
