package cn.itcast.day04.demo02;
/*
有参数：小括号中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数
无参数：小括号中留空，一个方法不需要任何数据条件，自己就能独立完成
* */
public class demo03methodparam {
    public static void main(String[] args) {
        method1(5,6);//有参数
        method2();//无参数
    }
    public static int method1(int a,int b){
        return a*b;
    }
    public static void method2(){
        System.out.println("hello");
    }
}
