package cn.itcast.day10.demo01;
/*
从java8开始，接口当中允许定义静态方法

格式：
public static 返回值类型 方法名称(参数列表){
     方法体
}
提示：就是将abstract或者default换成static，带上方法体
* */
public interface Static {
    public static void methodstatic(){
        System.out.println("静态方法");
    }
}
