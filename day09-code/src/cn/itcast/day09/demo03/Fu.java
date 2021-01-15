package cn.itcast.day09.demo03;

public class Fu{
    public void method(){
        System.out.println("父类执行");
    }
    //返回值权限
    public Object methodA(){
        System.out.println("父类A执行");
        return null;
    }
    //方法权限
    protected void methodB(){
        System.out.println("父类B执行");
    }
}
