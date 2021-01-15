package cn.itcast.day11.demo04;

public class demoMain {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.methodOuter();

        MyOuter myOuter=new MyOuter();
        myOuter.methodOuter();
    }
}
