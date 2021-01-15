package day13.demo02;
/*
* 定义含有泛型的方法：泛型定义在方法的修饰符和返回值类型之间
* 格式：
*   修饰符<泛型>返回值类型 方法名(参数列表（使用类型）){
*       方法体;
*   }
*   含有泛型的方法，在调用方法的时候确定泛型的数据类型
*
* */
public class demo03GenericMethod {
    //定义一个含有泛型的方法
    public <M> void method01(M n){
        System.out.println(n);
    }
    //定义含有泛型的静态方法
    public  static <S> void method02(S s){
        System.out.println(s);
    }
}
