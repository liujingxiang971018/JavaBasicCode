package day15.demo04ThreadSecurity;
/*
* Lock锁
* java.util.concurrent.Locks.Lock接口
* Lock接口中的方法：
*   void lock() 获得锁
*   void unlock() 释放锁
*
* java.util.concurrent.Locks.ReentrantLock implements Lock接口
* 使用步骤：
*   1、在成员位置创建一个ReentrantLock对象
*   2、在可能会出现安全问题的代码前调用Lock接口中的lock方法获得锁
*   3、在可能会出现安全问题的代码后调用unlock方法释放锁
* */
public class demo04Lock {
    public static void main(String[] args) {
        demo04Runnable runnable=new demo04Runnable();
        Thread t0=new Thread(runnable);
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        //启动多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
