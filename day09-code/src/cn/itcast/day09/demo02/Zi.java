package cn.itcast.day09.demo02;

public class Zi extends Fu{
//    int num=20;
    public void methodZi(){
        System.out.println(num);//优先使用子类，没有再往上找
    }
}
