package cn.itcast.day04.demo03;
/*
定义一个方法：用来求出1-100之间所有数字的和值
*/
public class demo02methodsum {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum(){
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
