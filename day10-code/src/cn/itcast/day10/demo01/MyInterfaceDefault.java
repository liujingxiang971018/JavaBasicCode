package cn.itcast.day10.demo01;

public class MyInterfaceDefault implements MyInterfaceDefaultRealize{
    @Override
    public void methodA() {
        System.out.println("A");
    }

    @Override
    public void methodB() {
        System.out.println("B");
    }
    //默认方法会被实现类继承

}
