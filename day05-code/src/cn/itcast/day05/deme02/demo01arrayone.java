package cn.itcast.day05.deme02;

public class demo01arrayone {
    public static void main(String[] args) {
        int[] array=new int[3];
        System.out.println(array);//输出地址
        int[] arrayb=array;//直接引用
        System.out.println(arrayb);

    }
}
