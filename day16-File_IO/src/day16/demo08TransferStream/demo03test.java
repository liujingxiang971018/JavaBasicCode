package day16.demo08TransferStream;

import java.io.*;

/*
* 练习：将gbk编码的文件，转换为utf-8的文本文件
*
* 分析：
*   1、创建InputStreamReader对象
*   2、创建OutputStreamWriter对象
*   3、使用read
*   4、使用write
*   5、释放资源
* */
public class demo03test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("day16-File_IO\\gbk.txt"),"gbk");
        OutputStreamWriter osr=new OutputStreamWriter(new FileOutputStream("day16-File_IO\\utf-8.txt"));
        int len=isr.read();
        while(len!=-1){
            osr.write(len);
            len=isr.read();
        }
        isr.close();
        osr.close();
    }
}
