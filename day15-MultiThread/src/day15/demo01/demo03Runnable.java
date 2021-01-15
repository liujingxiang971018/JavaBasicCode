package day15.demo01;
/*
* 创建Runnable捷库的实现类
* */
public class demo03Runnable implements Runnable {//继承的是接口interface，可以继承多个接口
    //重写run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
    }
}
