package day15.demo01;

public class demo01GetThreadName {
    public static void main(String[] args) {
        demo01MyThread myThread=new demo01MyThread();
        myThread.start();//Thread-0

        new demo01MyThread().start();//Thread-1

    }
}
