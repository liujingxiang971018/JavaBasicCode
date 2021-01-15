package day14.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
* try...catch：异常的第二种方式，自己处理异常
* 格式：
*   try{
*   可能产生的异常
* }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
*   异常的处理逻辑
* }
* ...
* catch(异常类名 变量名){}
* 注意：
*   1、try中可能抛出多个异常对象，那么就可以使用多个catch来处理
*   2、如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中处理逻辑，继续执行这之后的代码
*       如果没有产生异常，就不执行catch代码，继续执行之后的代码
* */
public class demo05trycatch {
    public static void main(String[] args)  {
        try {
            readfile("c:\\a.txt");
        }catch (IOException e){//后缀有错
            System.out.println("后缀有错");
            /*
            * Throwable类定义了三个异常处理的方法
            *   String getMessage()返回此throwable的简短描述
            *   String toString()返回throwable的详细信息字符串
            *   void printStackTrace() JVM打印异常对象，默认此方法
            * */
            System.out.println(e.getMessage());//后缀名错误
            System.out.println(e.toString());//java.io.IOException: 后缀名错误
            e.printStackTrace();
            //java.io.IOException: 后缀名错误
            //at day14.demo01.demo05trycatch.readfile(demo05trycatch.java:45)
            //at day14.demo01.demo05trycatch.main(demo05trycatch.java:24)
        }

    }
    //readfile方法抛出异常，在main方法中选择执行try catch
    private static void readfile(String s) throws IOException {
        if(!s.equals("c:\\a.txt")){
            throw new FileNotFoundException("文件找不到");//Exception in thread "main" java.io.FileNotFoundException: 文件找不到
        }
        if(!s.endsWith(".txtx")){
            throw new IOException("后缀名错误");//Exception in thread "main" java.io.IOException: 后缀名错误
        }
    }
}
