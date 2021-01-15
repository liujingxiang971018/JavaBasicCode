package day15.demo01;
/*
* 获取线程的名称：
*   1、使用Thread类中的方法getName();
*       String getName() 返回该线程的名称;
*   2、可以先获取当前正在执行的线程，使用线程中的方法getName()获取线程的名称
*       static Thread currentThread() 返回当前正在执行的线程对象的引用
* */

/*
* 设置线程名称：
*   1、使用Thread类中的setName(name)
*       void setName(String name)
*   2、创建一个带参数的构造方法，参数传递线程的名称：调用父类的带参构造方法，把线程名称传递给父类，让父类（Thread）给子线程起名字
*       Thread(String name) 分配新的Thread对象
* */
public class demo01MyThread extends Thread{
    public demo01MyThread(){
        super();
    }
    public demo01MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        //获取线程名称
//        String string=getName();
//        System.out.println(string);

        Thread t=Thread.currentThread();
        System.out.println(t.getName());
    }
}
