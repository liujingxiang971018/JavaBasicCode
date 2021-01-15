package day16.demo09SequenceStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* java.io.ObjectOutputStream extends OutputStream
* 对象的序列化流
* 作用：把对象以流的方式写入到文件中保存(二进制形式保存，无法直接查看)
*
* 构造方法：ObjectOutputStream(OutputStream out)
*
* 特有的成员方法：
*   void writeObject(Object obj)将指定的对象写入
*
* 使用步骤：
*   1、创建ObjectOutputStream对象
*   2、使用writeObject方法
*   3、释放资源
* */
public class demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day16-File_IO\\a.txt"));
        oos.writeObject(new person(12,"liujingxiang"));//报错：NotSerializableException，实现了Serializable接口后不会报错
        oos.close();
    }
}
