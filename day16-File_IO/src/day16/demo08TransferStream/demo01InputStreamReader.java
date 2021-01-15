package day16.demo08TransferStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* java.io.InputStreamReader extends Reader
* 字节流通向字符流的桥梁，使用指定的charset读取字节并将其解码为字符
*
* 两种构造方法
* 注意：构造方法中指定的编码表名称要和文件的编码相同，否则会发生乱码
* */
public class demo01InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("day16-File_IO\\gbk.txt"),"gbk");//默认使用utf-8
        int len=isr.read();
        while(len!=-1){
            System.out.println((char)len);
            len=isr.read();
        }
        isr.close();
    }
}
