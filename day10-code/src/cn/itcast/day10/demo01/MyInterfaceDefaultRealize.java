package cn.itcast.day10.demo01;
/*
从java8开始，接口里允许定义默认方法
格式：
public default 返回值类型 方法名称(参数列表){
    方法体
}

备注：接口当中的默认方法，解决接口升级的问题
* */
public interface MyInterfaceDefaultRealize {
    public abstract void methodA();

    public abstract void methodB();

    //新添加的方法，改成默认方法
    public default void Defaultmethod(){
        System.out.println("默认方法");
    }
}
