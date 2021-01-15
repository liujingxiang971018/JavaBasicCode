package cn.itcast.day10.demo05;

/*
访问成员变量的两种方式：

1、直接通过对象名称访问成员变量，【看等号左边是谁，优先用谁，没有则向上找】
2、间接通过成员方法访问，【看该方法属于谁，优先用谁，没有则向上找】

口诀：
成员方法：编译看左边，运行看右边
成员变量：编译看左边，运行还看左边

使用多态的好处：
无论右边new的时候换成哪个子类对象，等号左边调用方法都不会变化

1、对象的向上转型，其实就是多态写法
格式：父类名称 对象名=new 子类名称()；
含义：右侧创建一个子类对象，把它当做父类来看待使用。
注意事项：
向上转型一定是安全的。从小范围转向了大范围。
一旦向上转型为父类，那么久无法调用子类原本特有的方法。


2、对象的向下转型，其实是一个【还原】的动作。
格式：子类名称 对象名=（子类名称）父类对象。
含义：将父类对象，【还原】成为本来的子类对象。
例子：
Animal animal=new Cat();//向上转型
Cat cat=(Cat)animal;//向下转型。
注意事项：
必须保证对象本来创建的时候，就是猫，才能向下转型成为猫。
如果对象创建的时候本来不是猫，现在非要向下转型成为猫，就会报错。ClassCastException。

* */
public class demo01Polymorphism {
    public static void main(String[] args) {
        Fu obj=new Zi();//obj对象属于Zi类，但是使用成员变量优先使用左边的类
        System.out.println(obj.num);//输出父类中的num值
        //父类有，子类重写:输出子类结果
        obj.method();
        //父类有，子类没有：输出父类结果
        obj.methodFu();
        //父类没有，子类有：调用报错
//        obj.methodZi();
    }
}
