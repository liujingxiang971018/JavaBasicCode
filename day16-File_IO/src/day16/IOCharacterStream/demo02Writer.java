package day16.IOCharacterStream;

import java.io.FileWriter;
import java.io.IOException;

/*
* Writer字符输出流
* java.io.FileWriter extends OutputStreamWriter extends Writer
* 作用：把内存中字符数据写入硬盘中
*
* 步骤：
*   1、定义对象
*   2、使用write方法
*   3、释放资源
*
* flush方法和close方法的区别
*   -flush：刷新缓冲区，流对象可以继续使用
*   -close：先刷新缓冲区，然后通知系统释放资源，流对象不可以再被使用
* */
public class demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\05 IO字符流\\a.txt");
        char[] cs={'a','b','c'};
        fw.write(cs);
        String s="abcde";
        fw.write(s);
        fw.close();//abcabcde
        //如果是一个字符一个字符写入，则会先覆盖之前的，如果只直接写入string，则在尾部添加。
    }
}
