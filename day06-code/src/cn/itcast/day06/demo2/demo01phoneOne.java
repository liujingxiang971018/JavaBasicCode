package cn.itcast.day06.demo2;

public class demo01phoneOne {
    public static void main(String[] args) {
        phone one=new phone();
        one.brand="SamSung";
        one.price=3099;
        one.color="blue";
        System.out.println(one.brand+one.price+one.color);
        one.call("liujingxiang");
    }
}
