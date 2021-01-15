package day15.demo04ThreadSecurity;
/*
* 实现卖票案例
* */
public class demo01Runnable implements Runnable{
    //共享数据
    private int ticket=100;

    @Override
    public void run() {
        while (true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在卖票："+ticket);
                ticket--;
            }
        }
    }
}
