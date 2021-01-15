package day16.demo08TransferStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
* java.io.OutputStreamWriter extends Writer
* 是字节流通向字节流的桥梁，可食用指定的charset将要写入流中的字符编码成字节
*
* 构造方法：
*   1、OutputStreamWriter(OutputStream out)创建默认字符编码的OutputStreamWriter
*   2、OutputStreamWriter(OutputStream out,String charsetName) 创建使用指定字符集的OutputStreamWriter
*
* 使用步骤：
*   1、创建OutputStreamWriter对象
*   2、使用write方法，把字符转换为字节存储到缓冲区中
*   3、使用flush。
*   4、释放资源
* */
public class demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
       /* OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("day16-File_IO\\uft-8.txt"),"utf-8");//默认也是使用utf-8编码
        osw.write("你好");
        osw.flush();
        osw.close();*/
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("day16-File_IO\\gbk.txt"),"gbk");//默认使用utf-8编码
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
