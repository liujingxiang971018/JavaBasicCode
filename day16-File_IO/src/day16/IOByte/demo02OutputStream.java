package day16.IOByte;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 一次写多个字符
* */
public class demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\04 IO字节流\\b.txt");
        //在b.txt文件中写入100,1的ascii码是49
        byte[] b={49,48,48};
        fos.write(b);
        //把字节数组的一部分写入
        fos.write(b,1,2);//在写入字节数组b，从第二个开始，写两个字节
        //写入中文
        byte[] bytes=",你好".getBytes();
        fos.write(bytes);
        fos.close();
        //最终写入10000，你好

    }
}
