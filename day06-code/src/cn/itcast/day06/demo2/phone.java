package cn.itcast.day06.demo2;
/*
定义一个类，用来模拟“手机”事务
属性：品牌，价格，颜色
行为：打电话，发短信

成员变量：
    String brand;//品牌
    double price;//价格
    String color;//颜色
成员方法:
    public void call(String who){};
    public void sendmessage(){};//群发短信
* */
public class phone {
    String brand;
    double price;
    String color;
    public void call(String who){
        System.out.println("call"+who);
    }
    public void sendmessage(){
        System.out.println("群发短信");
    }
}
