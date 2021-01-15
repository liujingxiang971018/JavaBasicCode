package cn.itcast.day09.demo05;

public class cat extends animal {
    @Override//重写抽象方法
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
