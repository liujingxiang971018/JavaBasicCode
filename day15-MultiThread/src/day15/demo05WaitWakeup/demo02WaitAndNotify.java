package day15.demo05WaitWakeup;
/*
* 进入到TimeWaiting（计时等待）有有两种方式
* 1、使用sleep(long m)方法，线程睡醒进入到Runnable/Blocked状态
* 2、使用wait(long m)方法，wait方法如果结束之后，还没有被notify唤醒，就会自动醒来
*
* 唤醒方法：
*   void notify()  如果有多个等待线程，随机唤醒一个
*   void notifyAll() 如果有多个等待线程，都唤醒
* */
public class demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建一个锁对象，保证唯一
        Object obj=new Object();
        //创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，使用同步技术
                while (true){
                    synchronized (obj){
                        System.out.println("告知老板");
                        try {
                            obj.wait(5000);//延迟5s，自动唤醒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("收到老板通知,吃东西");
                        System.out.println("--------------");
                    }
                }
            }
        }.start();
    }
}
