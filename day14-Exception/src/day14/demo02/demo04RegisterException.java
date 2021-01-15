package day14.demo02;
/*
* 自定义异常类：
*   java提供的异常类，不够我们使用，需要自己定义一些异常类
* 格式：
*   public class XXXException extends Exception（或extends RuntimeException）
*       添加一个空参数的构造方法
*       添加一个带异常信息的构造方法
* 注意：
*   1、自定义异常类一般都是以Exception结尾，说明此类是一个异常类
*   2、自定义异常类，必须继承Exception或RuntimeException
*       继承Exception：那么自定义的异常类是一个编译期异常，必须处理这个异常
*       继承RuntimeException：那么是一个运行期异常，无需处理。
* */
public class demo04RegisterException extends Exception {
    //添加一个空参数构造方法
    public demo04RegisterException(){
    }
    //添加一个带异常信息的构造方法
    public demo04RegisterException(String message){
        super(message);
    }
}
