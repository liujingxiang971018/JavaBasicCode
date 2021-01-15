package day14.demo01;

import java.util.Objects;

/*
* throw关键字：
* 作用：
*   可以使用throw关键字在指定的方法中抛出指定的异常
* 使用方式：
*   throw new xxxException();
* 注意：
*   1、throw关键字必须写在方法的内部
*   2、throw关键字后边new对象必须Exception或者Exception的子类对象
*   3、throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
*       throw关键字后边创建的是RuntimeException或者是其子类对象，可以不处理(在方法名上不用写throws)
*       throw关键字后边创建的是编译异常（写代码的时候报错），要么throws，要么try...catch
* NullPointerException是运行期异常,ArrayIndexOutBoundException也是运行期异常
* */
/*
* Objects的非空判断方法：
* public static <T> requireNonNull(T obj):查看指定引用对象不是null
* */
public class demo03throw {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object obj) {
       /* if(obj==null){
            throw new NullPointerException("空指针异常");//Exception in thread "main" java.lang.NullPointerException: 空指针异常
        }*/
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象是null");//Exception in thread "main" java.lang.NullPointerException: 传递的对象是null
    }
}
