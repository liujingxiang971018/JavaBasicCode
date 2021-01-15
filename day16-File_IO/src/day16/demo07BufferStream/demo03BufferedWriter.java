package day16.demo07BufferStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
* java.io.BufferedWriter extends Writer
* 字符缓冲输出流
*
* 构造方法：
* 默认缓冲区大小：
* 指定缓冲区大小：
*
* 特有的成员方法：
*   void newLine() 写入一个行分隔符，会根据不同的操作系统，获取不同的行分隔符
*   换行：换行符号
*       windows：\r\n
*       linux:/n
*       mac:/r
* 使用步骤：
*   1、创建字符缓冲输出流对象，构造方法中传递字符输出流
*   2、调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
*   3、调用flush
*   4、释放资源
* */
public class demo03BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("day16-File_IO\\a.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write(i+": liu+"+i);
            bw.write("\r\n");//=bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
