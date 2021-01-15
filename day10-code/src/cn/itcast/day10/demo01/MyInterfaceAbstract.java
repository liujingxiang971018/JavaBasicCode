package cn.itcast.day10.demo01;
/*
在任何java版本中，接口都能定义抽象方法
格式：
public abstract 返回值类型 方法名称（参数列表）；

注意：
1、接口当中的抽象方法，修饰符必须是连个固定的关键字：public abstract
2、这两个关键字修饰符，可以选择性省略


* */
public interface MyInterfaceAbstract {
    public abstract void method1();

    abstract void method2();

    public void method3();

    void method4();
}
