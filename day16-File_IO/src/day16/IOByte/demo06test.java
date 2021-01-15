package day16.IOByte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 文件的复制粘贴
* 步骤：
*   1、创建一个字节输入流对象，构造方法中绑定要读取的数据流
*   2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
*   3、read
*   4、write
*   5、释放资源
* */
public class demo06test {
    public static void main(String[] args) throws IOException {
        /*FileInputStream fis=new FileInputStream("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\04 IO字节流\\a.txt");
        FileOutputStream fos=new FileOutputStream("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\a.txt",true);
        int len=fis.read();
        while(len!=-1){
            fos.write(len);
            len=fis.read();
        }

        //先关闭读的，在关闭写的
        fis.close();
        fos.close();
        //复制成功*/

        FileInputStream fis=new FileInputStream("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\04 IO字节流\\a.txt");
        FileOutputStream fos=new FileOutputStream("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\a.txt");
        //一次读写多个字节
        byte[] bytes=new byte[1024];
        int len=fis.read(bytes);
        while(len!=-1){
            fos.write(bytes,0,len);
            len=fis.read(bytes);
        }
        fis.close();
        fos.close();
        //成功
    }
}
