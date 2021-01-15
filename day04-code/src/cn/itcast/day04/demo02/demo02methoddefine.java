package cn.itcast.day04.demo02;
/*
1、方法其实就是若干语句的功能集合
参数
返回值

定义方法的完整格式
修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
    方法体
    return 返回值;
}
方法调用的三种格式：
1、单独调用：方法名称(参数)
2、打印调用
3、赋值调用
* */
public class demo02methoddefine {
    public static void main(String[] args) {
        int a=5,b=6;
        int sum=sum(a,b);
        System.out.println(sum);
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
