package day16.demo09SequenceStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;

/*
* 练习:序列化集合
*   当我们想在文件中保存多个对象的时候，可以把多个对象存储到一个集合中，对集合进行序列化和反序列化
* */
public class demo03test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建一个对象集合
        ArrayList<person> list=new ArrayList<>();
        list.add(new person(1,"liu"));
        list.add(new person(2,"jing"));
        list.add(new person(3,"xiang"));

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day16-File_IO\\a.txt"));
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day16-File_IO\\a.txt"));
        oos.writeObject(list);
        oos.close();

        Object plist=ois.readObject();
        //需要将Object类型的集合转换为ArrayList类型
        ArrayList<person> people=(ArrayList<person>)plist;
        for(person p:people){
            System.out.println(p.toString());//成功输出
        }
        ois.close();

    }
}
