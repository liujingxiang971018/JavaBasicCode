package day15.demo02;
/*
* 匿名内部类方式实现线程的创建
*
* 匿名：没有名字
* 内部类：写在其他类内部的类
*
* 匿名内部类作用：简化代码
*   把子类继承父类，重写父类的方法，创建子类对象合成一步完成
*   把实现类实现类接口，重写接口中的方法，创建实现类对象合成一步完成
* 输出：子类/实现类对象，而这个类没有名字
*
* 格式：
*   new 父类/接口(){
*   重写父类/接口中的方法
* }
* */
public class demo01InnerClassThread {
    public static void main(String[] args) {
        new Thread(){
            //重写run方法
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-》"+i);
                }
            }
        }.start();//可以输出结果

        //线程的接口Runnable
        Runnable r= new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                }
            }
        };
        Thread t=new Thread(r);
        t.start();

        //简化接口
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-@-"+i);
                }
            }
        }).start();
    }
}
