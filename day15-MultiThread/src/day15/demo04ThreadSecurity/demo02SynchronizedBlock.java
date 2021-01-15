package day15.demo04ThreadSecurity;
/*
* 同步代码块
* 解决线程安全问题的一种方案：使用同步代码块
* 格式：
*   synchronized(锁对象){
*       可能会出现线程安全问题的代码（访问了共享数据的代码）
* }
* 注意：
*   1、通过代码块中的对象，可以使用任意的对象
*   2、但是必须保证多个线程使用的锁对象是同一个
*   3、锁对象作用：
*       把同步代码块锁住，只让一个线程在同步代码块中执行
* */
public class demo02SynchronizedBlock {
    public static void main(String[] args) {
        demo02Runnable runnable=new demo02Runnable();
        Thread t0=new Thread(runnable);
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        //输出只有一个线程卖出票
        //原因：同步中的线程，没有执行完毕不会释放锁，同步外的线程没有锁进不去同步
        t0.start();
        t1.start();
        t2.start();
    }
}
