package cn.itcast.day11.demo03;

public class demo02InnerClass {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer().new Inner();
        obj.methodInner();
    }
}
