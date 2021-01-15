package day16.IOByte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 字节输出流
* java.io.OutputStream:此抽象类表示输出字节流的所有超类
* 定义一些子类共性的成员方法：
*   public void closer():关闭此输出流并四方与此相关联的任何系统资源
*   public void flush():刷新此输出流并前置任何缓冲的输出字节被写出
*   public void write(byte[] b):将b.length从指定的字节数组写入此输出流
*   public void write(byte[] b,int off,int len):从指定的字节数组写入len字节，从偏移量off开始
*   public abstract void write(int b):将指定的字节输出流
*
* java.io.FileOutputStream extends OutputStream:文件字节输出流
* 作用：把内存中的数据写入到硬盘中
* 构造方法：FileOutputStream(String name)/FileOutputStream(File file)
* 参数：
*   String name：目的地是一个文件的路径
*   File file：目的地是一个文件
* 作用：
*   1、创建一个FileOutputStream对象
*   2、会根据构造方法中传递的文件创建一个空的文件
*   3、会把FileOutputStream对象指向创建好的文件
*
* 使用步骤：
*   1、创建一个FIleOutputStream对象，构造方法中传递写入数据的目的地
*   2、调用对象中的方法write，把数据写入到文件中
*   3、释放资源（清空内存）
* */
public class demo01OutputStream {
    public static void main(String[] args) throws IOException {
        //1
        FileOutputStream fos=new FileOutputStream("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\04 IO字节流\\a.txt");
        //2
        fos.write(97);
        //3
        fos.close();
        //执行成功
    }
}
