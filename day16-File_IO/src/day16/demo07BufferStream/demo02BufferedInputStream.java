package day16.demo07BufferStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
* java.io.BufferedInputStream extends InputStream
*
* 构造方法：
* 默认缓冲区大小：BufferedInputStream(InputStream in)
* 指定缓冲区大小：BufferedInputStream(InputStream in,int size)
*
* 使用步骤:
*   1、创建FileInputStream对象
*   2、创建BufferedInputStream对象
*   3、使用方法read，读取文件
*   4、释放资源
* */
public class demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("day16-File_IO\\a.txt");

        BufferedInputStream bis=new BufferedInputStream(fis);

        //int read()从输入流中读取数据的下一个字节
        int len=bis.read();;//记录读取到的字节
        while(len!=-1){
            System.out.println(len);
            len=bis.read();
        }

        bis.close();
    }
}
