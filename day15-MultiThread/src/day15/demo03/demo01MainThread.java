package day15.demo03;
/*
* 主线程：执行主（main）方法的线程
*
* 单线程程序：java程序中只有一个线程
* 执行从main方法开始，从上到下依次执行
* */
public class demo01MainThread {
    public static void main(String[] args) {
        demo01Person p=new demo01Person("xiaoqiang");
        p.run();

        demo01Person p2=new demo01Person("liu");
        p2.run();
    }
}
