package day14.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
* throws关键字：异常处理的第一种方式
* 作用：
*   当方法内部抛出异常的时候，那么我们就必须处理好这个异常对象
* 使用格式：在方法申明时使用
*   修饰符 返回值类型 方法名(参数列表) throws XXXException,yyyException...{
*   throw new XXXException("产生原因");
*   throw new yyyException("产生原因");
* }
* 注意：
*   1、throws关键字必须写在方法申明处
*   2、throws关键字后边声明的异常必须是Exception或者Exception子类
*   3、方法内部如果抛出多个异常，那么throws后边必须声明多个异常
*       如果抛出的多个异常对象有子父类关系，那么直接声明父类即可
*   4、调用一个声明抛出异常的方法，我们就必须处理申明的异常
*       要么继续使用throws声明抛出，交给JVM
*       要么try..catch自己处理异常
*
* */
public class demo04throws {
    /*
    * FileNotFoundException是IOException的子类
    * */
    public static void main(String[] args) throws IOException {
        readfile("c:\\a.txt");
    }

    private static void readfile(String s) throws IOException {
        if(!s.equals("c:\\a.txt")){
            throw new FileNotFoundException("文件找不到");//Exception in thread "main" java.io.FileNotFoundException: 文件找不到
        }
        if(!s.endsWith(".txtx")){
            throw new IOException("后缀名错误");//Exception in thread "main" java.io.IOException: 后缀名错误
        }
    }
}
