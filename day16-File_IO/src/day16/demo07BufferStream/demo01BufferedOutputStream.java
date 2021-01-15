package day16.demo07BufferStream;

import java.io.*;

/*
* java.io.BufferedOutputStream extends OutputStream
* 继承父类的共性方法
* 构造方法：
*   BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，已将数据写入指定的底层输出流
*   BufferedOutputStream(OutputStream out,int size) 创建一个新的缓冲输出流，已将数据写入指定的底层输出流,指定大小
*
* 使用步骤：
*   1、创建FileOutputStream对象，构造方法中绑定要输出的目的地
*   2、创建BufferedOutputStream对象
*   3、使用方法write，把数据写入到内部缓冲区中,加快速度
*   4、使用方法flush，把内部缓冲区中的数据，刷新到文件中
*   5、释放资源（会先调用flush方法刷新数据，第四步可省略）
* */
public class demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("day16-File_IO\\a.txt");

        BufferedOutputStream bos=new BufferedOutputStream(fos);

        bos.write("把数据写入字节缓冲区".getBytes());

        bos.flush();

        bos.close();
    }
}
