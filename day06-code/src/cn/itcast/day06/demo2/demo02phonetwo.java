package cn.itcast.day06.demo2;

public class demo02phonetwo {
    public static void main(String[] args) {
        phone one=new phone();
        one.brand="SamSung";
        one.price=3099;
        one.color="blue";
        System.out.println(one.brand+one.price+one.color);
        one.call("liujingxiang");

        phone two=one;//将one当中保存的对象地址赋值给two
        System.out.println(two.brand+two.price+two.color);
    }
}
