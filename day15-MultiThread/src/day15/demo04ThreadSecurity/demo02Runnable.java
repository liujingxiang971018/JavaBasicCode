package day15.demo04ThreadSecurity;

import java.util.Objects;

/*
 * 实现卖票案例
 * */
public class demo02Runnable implements Runnable{
    //共享数据
    private int ticket=100;
    //创建一个锁对象
    final Object obj=new Object();

    @Override
    public void run() {
        while (true){
            //同步代码块
            synchronized (obj){
                System.out.println(Thread.currentThread().getName()+"开始卖票");
                if (ticket>0){
                    /*try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println(Thread.currentThread().getName()+"正在卖票："+ticket);
                    ticket--;
                }else{
                    return;
                }
            }
        }
    }
}

