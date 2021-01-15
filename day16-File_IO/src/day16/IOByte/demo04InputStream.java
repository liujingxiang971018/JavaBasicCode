package day16.IOByte;

import java.io.FileInputStream;
import java.io.IOException;

/*
* java.io.InputStream:字节输入流
* 作用：从硬盘读取到内存中
* 定义了所有子类共性的方法：
*   public int read()读取下一个字节
*   public int read(byte[] b):读取一定数量的字节
*   public void close()
*
* java.io.FileInputStream extends InputStream
* 构造方法：
*   FileInputStream(String name)
*   FileInputStream(File file)
*   作用：
*       1、创建一个对象
*       2、会把对象指定的构造方法中要读取的文件
*
* */
public class demo04InputStream {
    public static void main(String[] args) throws IOException {
        //1、创建对象
        FileInputStream fis=new FileInputStream("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\04 IO字节流\\a.txt");
        //2、使用read方法读取
        int len = fis.read();//读取一个字节,读取到文件的末尾返回-1
        System.out.println(len);//97
        System.out.println((char)len);//a

        int len2 = fis.read();//读取一个字节,读取到文件的末尾返回-1
        System.out.println(len2);//-1
        //3、释放资源
        fis.close();

    }
}
