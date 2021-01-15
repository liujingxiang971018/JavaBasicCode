package cn.itcast.day09.demo04;

public class Zi extends Fu {
    public Zi(){
//        super();//在调用父类时无参数构造方法
        super(10);//调用父类的有参构造方法，构造函数只能调用一次
        System.out.println("子类构造方法");
    }
    public Zi(int m){
        this();//调用本类的无参构造
        System.out.println("子类有参构造");
    }

}
