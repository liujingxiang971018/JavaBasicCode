package cn.itcast.day06.demo2;

public class demo04phoneParam {
    public static void main(String[] args) {
        phone one=new phone();
        one.brand="iphone";
        method(one);//传递对象的地址

        phone two=getphone();
        System.out.println(two.brand);
    }
    //使用类对象作为类型，定义参数
    public static void method(phone param){
        System.out.println(param.brand);
    }
    //可以使用类对象作为返回值
    public static phone getphone(){
        phone one=new phone();
        one.brand="iphone11";
        one.price=1234.1;
        one.color="green";
        return one;
    }
}
