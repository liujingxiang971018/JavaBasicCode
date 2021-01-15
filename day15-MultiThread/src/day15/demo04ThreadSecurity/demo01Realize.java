package day15.demo04ThreadSecurity;
/*
* 模拟卖票案例
* 创建3个线程，同时开始
* */
public class demo01Realize {
    public static void main(String[] args) {
        demo01Runnable runnable=new demo01Runnable();
        Thread t0=new Thread(runnable);
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        //会产生线程安全问题
        t0.start();
        t1.start();
        t2.start();
    }
}
