package day16.demo06Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
* 把硬盘中键值对的文件读取到集合中
* void load(InputStream instream)
* void load(Reader reader)
* 参数：
*   InputStream instream:字节输入流，不能读取含有中文的键值对
*   Reader reader:字符输入流，能读取含有中文的键值对
* 使用步骤：
*   1、创建Properties集合对象
*   2、使用Properties集合对象中的方法load读取保存键值对的文件
*   3、遍历Properties集合
* */
public class demo02PropertiesLoad {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        Reader fw=new FileReader("day16-File_IO\\a.txt");
        prop.load(fw);
        Set<String> set=prop.stringPropertyNames();
        for (String key:set){
            String value=prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
