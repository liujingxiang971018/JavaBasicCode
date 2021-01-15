package day16.IOByte;

import java.io.FileInputStream;
import java.io.IOException;

/*
* 通过字节流读取中文会遇到的问题
* 1个中文：
*   GBK：占用两个字节
*   UTF-8：占用3个字节
* 解决方案：使用字符流
* */
public class demo07 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\04 IO字节流\\b.txt");
        int len=fis.read();
        while(len!=-1){
            System.out.println(len);
            len=fis.read();
        }
        fis.close();
    }
}
