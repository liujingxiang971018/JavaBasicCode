package day15.demo04ThreadSecurity;

public class demo03Runnable implements Runnable{
    //共享数据
    private /*static*/ int ticket=100;
    /*
    * 同步方法会把方法内部的代码锁住
    * 只让一个线程执行
    * 同步方法的锁对象：new demo03Runnable()
    * */
    @Override
    public /*static*/ synchronized void run() {
        while (true){
            //同步代码块
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
