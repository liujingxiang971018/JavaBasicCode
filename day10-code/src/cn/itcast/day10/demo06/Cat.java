package cn.itcast.day10.demo06;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void catchmouse(){
        System.out.println("猫捉老鼠");
    }
}
