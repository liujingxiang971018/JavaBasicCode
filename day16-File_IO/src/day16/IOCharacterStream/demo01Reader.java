package day16.IOCharacterStream;

import java.io.FileReader;
import java.io.IOException;

/*
* java.io.Reader:字符输入流
* 共性方法：
*   int read()
*   int read(char[] char)
*   void close()
*
* java.io.FileReader extends InputStreamReader extends Reader
* FileReader:文件字符输入流
*   构造方法：
*       FileReader(String filename)
*       FileReader(File file)
* 步骤：
*   1、创建对象
*   2、read
*   3、释放资源
* */
public class demo01Reader {
    public static void main(String[] args) throws IOException {
    /*    FileReader fr=new FileReader("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\05 IO字符流\\a.txt");
        int len=fr.read();//转成了int型
        while(len!=-1){
            System.out.println((char)len);//a
            len=fr.read();
            fr.close();
        }*/

        //一次读取多个字符
        FileReader fr=new FileReader("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\05 IO字符流\\b.txt");
        char[] chars=new char[1024];
        int len=fr.read(chars);
        while(len!=-1){
            /*
            * String类的构造方法
            *   String(char[] value) 把字符数组转换为字符串
            *   String(char[] value,int offset,int count)
            * */
            String string=new String(chars,0,len);
            System.out.println(string);
            //﻿output:
            //你好,我是刘景祥
            //我是刘景祥
            len=fr.read(chars);
        }
        fr.close();
    }
}
