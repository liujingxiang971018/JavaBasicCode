package day16.demo07BufferStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
* java.io.BufferedReader extends Reader
* 字符缓冲输入流
*
* 特有的成员方法：
*   String readLine(); 读取一个一个文本行，读取一行数据
*       返回值：包含改行内容的字符串，不包含任何行终止符，如果已到达末尾，则返回null
* */
public class demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("day16-File_IO\\a.txt"));
        String line=br.readLine();
        while(line!=null)
        {
            //读取一行字符串
            System.out.println(line);
            line=br.readLine();
        }
    }
}
