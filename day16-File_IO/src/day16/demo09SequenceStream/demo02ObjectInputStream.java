package day16.demo09SequenceStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
* java.io.ObjectInputStream extends InputStream
* 对象的反序列化流
* 作用：把文件中的对象读出来
*
* 特有的成员方法
*   Object readObject();
*
* readObject方法申明抛出ClassNotFoundException异常（class文件找不到异常）
* 反序列化的前提：
*   1、类必须实现Serializable接口
*   2、必须存在类对应的class文件
* */
public class demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day16-File_IO\\a.txt"));
        Object p=ois.readObject();
        ois.close();
        System.out.println(p.toString());
    }
}
