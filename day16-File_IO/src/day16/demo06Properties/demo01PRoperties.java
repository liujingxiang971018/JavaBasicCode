package day16.demo06Properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
* java.util.Properties集合，extends Hashtable<K,V> implements Map<K,V>
  Properties类表示一个持久的属性集，可保存在流中或从流中加载
  * Properties集合是一个唯一和IO流相结合的集合
  *     可以使用方法store把集合中的临时数据持久化写入到硬盘中存储
  *     可以使用方法load把硬盘中保存的文件（键值对）读取到集合中使用
  * 属性列表中每个键及其对应值都是一个字符串
  *    Properties集合是一个双列集合，key和value默认字符串
* */
public class demo01PRoperties {
    public static void main(String[] args) throws IOException {
        /*Object setProperty(String key,String value)
        Object getProperty(String key)
        Set<String> stringPropertyNames()返回此属性列表中的键集*/

        //创建Properties集合对象
        Properties prop=new Properties();
        prop.setProperty("liu","111");
        prop.setProperty("jing","123");
        prop.setProperty("xiang","234");

        //使用StringPropertyNames把Properties集合中的键取出，存储到一个Set集合中
        Set<String> set=prop.stringPropertyNames();
        for (String key:set) {
            String value=prop.getProperty(key);
            System.out.println(value);
        }

        /*
        * 可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到银盘中存储
        * void store(OutputStream out,String comments)
        * void store(Writer writer,String comments)
        * 参数：
        *   OutputStream out:字节输出流，不能写入中文
        *   Writer writer:字符输出流，可以写中文
        *   String comments：注释，用来解释说明保存的文件是像什么用的，不能使用中文，会产生乱码，默认unicode编码
        * 使用步骤：
        *   1、创建Properties集合对象，添加数据
        *   2、创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
        *   3、使用Properties集合中的方法store，把集合中的临时数据，写入到硬盘中
        *   4、释放资源
        * */
        FileOutputStream fw=new FileOutputStream("day16-File_IO\\b.txt");
//        FileWriter fw=new FileWriter("day16-File_IO\\a.txt");

        prop.store(fw,"save data");

        fw.close();
    }
}
