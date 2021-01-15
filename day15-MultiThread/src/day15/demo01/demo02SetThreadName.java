package day15.demo01;

public class demo02SetThreadName {
    public static void main(String[] args) throws InterruptedException {
        demo01MyThread myThread=new demo01MyThread();
        myThread.setName("liu");
        Thread.sleep(1000);//sleep(毫秒值)是静态方法，需要类.sleep
        myThread.start();//liu

        new demo01MyThread().start();//Thread-1
        new demo01MyThread("jingxiang").start();//jingxiang

    }
}
