package day16.demo01File;

import java.io.File;
import java.io.IOException;

/*
*File类创建和删除功能的方法
*   public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
*   public boolean delete():删除由此File表示的文件或目录
*   public boolean mkdir():创建File表示的目录
*   public boolean mkdirs():创建File表示的目录，包括任何必须但不存在的父目录
* */
public class demo05DeleteMethod {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        //创建文件的路径和名称在构造方法中给出
        //返回值：true：文件不存在，创建文件；false：文件存在，不会创建
        File f1=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\01 File类\\1.txt");
        boolean b1=f1.createNewFile();
        System.out.println(b1);//true

        File f2=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\01 File类\\1.txt");
        boolean b2=f2.createNewFile();
        System.out.println(b2);//false

        File f3=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\01 File类\\1.txt");
        boolean b3=f3.delete();
        System.out.println(b3);//true

        //创建单级文件夹
        File f4=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\01 File类\\1");
        boolean b4=f4.mkdir();
        System.out.println(b4);
        //既可以创建单级文件夹，也可以创建多级文件夹
        File f5=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\01 File类\\1\\2");
        boolean b5=f5.mkdirs();
        System.out.println(b5);
        //删除目录时只能删除一级，
        File f6=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\01 File类\\1\\2");
        boolean b6=f6.delete();
        System.out.println(b6);//true

    }
}
