package day15.demo05WaitWakeup;
/*
* 等待唤醒案例：线程之间通信
*   创建一个顾客线程（消费者）：告知老板，调用wait方法，放弃cpu的执行，进入无限等待WAITING的状态
*   创建一个老板线程（生产者）：进行生产，完毕后调用notify方法，唤醒顾客
*
* 注意：
*   顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
*   同步使用的锁对象必须保证唯一
*   只有锁对象才能调用wait和notify方法
* */
public class demo01WaitAndNotify {
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
                           obj.wait();
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

        //创建一个老板线程
        new Thread(){

            @Override
            public void run() {
                while(true){
                    //做一个延迟5s
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //保证等待和唤醒的线程只能有一个执行，使用同步技术
                    synchronized (obj){
                        System.out.println("告知顾客");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
