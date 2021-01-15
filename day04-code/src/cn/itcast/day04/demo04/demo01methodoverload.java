package cn.itcast.day04.demo04;
//java区分大小写
//重载(overload):多个方法的名称一样，但是参数列表不一样
/*
方法重载与下列因素有关
1、参数个数不同
2、参数类型不同
3、参数的多类型顺序不同
方法重载与下列因素无关
1、与参数的名称无关
2、与参数的返回类型无关
* */
public class demo01methodoverload {
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(3,4,5));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(double a,double b){
        return (int)(a+b);
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

}
