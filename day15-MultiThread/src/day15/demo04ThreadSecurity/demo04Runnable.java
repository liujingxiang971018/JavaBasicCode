package day15.demo04ThreadSecurity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class demo04Runnable implements Runnable{
    //共享数据
    private int ticket=100;
    //1、创建ReentrantLock对象
    Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true){
            //2、获取锁
            lock.lock();
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在卖票："+ticket);
                ticket--;
            }else{
                return;
            }
            //3、释放锁
            lock.unlock();
        }
    }
}
