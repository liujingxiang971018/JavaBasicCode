package day16.demo07BufferStream;

import java.io.*;
import java.util.HashMap;

/*
* 文本排序
*   对文本的内容进行排序，按照1,2,3,4...顺序
*
* 分析：
*   1、创建一个HashMap集合对象，存储每行文本的序号（1,2,3）；value：存储每行的文本
*   2、创建字符缓冲输入流对象
*   3、创建字符缓冲输出流对象
*   4、使用字符缓冲输入流中的方法readLine，逐行读取文本
*   5、对读取到的文本进行切割，获取序号和内容
*   6、对序号和内容存储到HashMap集合中，序号会自动有序
*   7、遍历集合
*   8、write
* */
public class demo05sort {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map=new HashMap<>();
        BufferedReader br=new BufferedReader(new FileReader("day16-File_IO\\a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("day16-File_IO\\b.txt"));

        String line=br.readLine();
        while(line!=null){
            String[] split=line.split(":");
            map.put(split[0],split[1]);//向hashmap中添加元素
            line=br.readLine();
        }
        for(String key:map.keySet()){
            String value=map.get(key);
            bw.write(key+": "+value+"\r\n");
        }
        br.close();
        bw.close();
    }
}
