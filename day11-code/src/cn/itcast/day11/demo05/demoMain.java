package cn.itcast.day11.demo05;
/*
* 如果接口的实现类（或者是父类的子类）只需要使用【唯一的一次】。
* 那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】
*
* 匿名内部类的定义格式：
* 接口名称 对象名=new 接口名称(){
*   //覆盖重写所有抽象方法
* };
*
* 注意事项：
* 对格式进行解析“new 接口名称(){...};”
* 1、new代表创建对象的动作
* 2、接口名称就是匿名内部类需要实现哪个接口
* 3、{。。。}这才是匿名内部类的内容
*
* 此外：
* 1、匿名内部类，在创建对象的时候，只能使用唯一一次。
* 如果希望多次创建对象，而且类的内容一样的话，就需要创建一个类来重写。
* 2、匿名对象，在【调用方法】的时候，只能调用唯一一次。
* 如果希望同一个对象，调用多次方法，那么必须给对象起个名字
* 3、匿名内部类省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
* 强调：匿名内部类和匿名对象不是一回事！！！
* */
public class demoMain {
    public static void main(String[] args) {
/*        MyinterfaceRealize obj=new MyinterfaceRealize();
        obj.method();*/

    //使用匿名内部类
        MyInterface obj=new MyInterface(){
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
         obj.method();
    }

}
