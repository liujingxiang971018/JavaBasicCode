package day16.IOByte;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
* 一次读取多个字节的方法
* 注意：
*   1、一般字节数组的长度定义为1024，即1kb。或者1024的整数倍
*   2、返回的int值表示字节长度
* */
public class demo05InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\04 IO字节流\\b.txt");
        byte[] b=new byte[3];//确定长度大小
        int len=fis.read(b);//读取到字节数组b中
        System.out.println(len);//字节个数为3
//        System.out.println(Arrays.toString(b));//[49, 48, 48]
        System.out.println(new String(b));//100
        fis.close();
    }
}
