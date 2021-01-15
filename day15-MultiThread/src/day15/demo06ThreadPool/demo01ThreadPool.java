package day15.demo06ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* 线程池实现
* java.util.concurrent.Executor:线程池的工厂类，用来生成线程池
* Executors类中的静态方法：
*   static ExecutorService newFixedThreadPool(int nThreads) 创建一个可重用固定线程数的线程池
*   返回值：
*       ExecutorService接口，返回的是ExecutorService接口的实现类对象
*
* java.util.concurrent.ExecutorService:线程池接口
*   用来从线程池中获取线程，调用start方法，执行线程任务
*       submit(Runnable task)提交一个Runnable任务用于执行
*   关闭/销毁线程池方法
*       void shutdown()
*
* 线程池的使用步骤：
*   1、生成线程池
*   2、创建一个类，实现Runnable接口，重写run方法。设置线程任务
*   3、调用submit传递线程任务
*   4、调用shutdown
*
* */
public class demo01ThreadPool {
    public static void main(String[] args) {
        //1
        ExecutorService es= Executors.newFixedThreadPool(2);
        //2
        Thread t= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"的任务");
            }
        });
        //3  线程池会一直开启，使用完了线程，会自动把线程归还给线程池，线程可以继续使用
        es.submit(t);
        es.submit(t);
        es.submit(t);
        //4
        es.shutdown();//结束

    }
}
