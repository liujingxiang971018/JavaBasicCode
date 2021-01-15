package day18.function;

public class demo02Runnable {
    //定义一个方法startThread，参数使用函数式接口Runnable
    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"启动");
            }
        });
    }
}
