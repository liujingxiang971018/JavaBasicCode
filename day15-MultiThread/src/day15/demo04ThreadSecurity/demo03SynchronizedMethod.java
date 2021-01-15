package day15.demo04ThreadSecurity;
/*
* 同步方法
* 使用步骤：
*   1、把访问了共享数据的代码抽取出来，放到一个方法中
*   2、在方法上添加synchronized修饰符
*
* 格式：
*   修饰符 synchronized 返回值类型 方法名(参数列表){
*       可能会出现线程安全问题的代码
* }
* */
public class demo03SynchronizedMethod {
    public static void main(String[] args) {
        demo03Runnable runnable=new demo03Runnable();
        Thread t0=new Thread(runnable);
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        //启动多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
