package day16.IOByte;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 追加写，换行
* 追加写的两个构造方法：
*   FileOutputStream(String name,boolean append)
*   FileOutputStream(File file,boolean append)
*   参数：
*       append：追加写的开关
* */
public class demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\04 IO字节流\\b.txt",true);
        //换行符号:
        // windows:\r\n
        //linux:/n
        //mac:/r
        byte[] b="\r\n".getBytes();
        fos.write(b);
        //换行成功
        byte[] bytes="我是刘景祥".getBytes();
        fos.write(bytes);
        fos.close();
        //追加成功
    }
}
