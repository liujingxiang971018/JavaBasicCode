package day16.demo01File;

import java.io.File;

/*
* File类获取功能的方法
*   public String getAbsolutePath():返回File的绝对路径名字符串
*   public String getPath():将此File转换为路径名字符串
*   public String getName():返回由此File表示的文件或目录的名称
*   public long length():返回文件的长度
* */
public class demo03FileGetMethod {
    public static void main(String[] args) {
        show01();
    }
    /*
    *
    * */
    private static void show01() {
        File f1=new File("C:\\a.txt");
        String absolutepath=f1.getAbsolutePath();
        System.out.println(absolutepath);//返回的都是绝对路径

        File f2=new File("a.txt");
        String path=f2.getPath();
        System.out.println(path);//是什么路径就返回什么路径

        File f3=new File("C:\\1\\1.txt");
        String name=f3.getName();
        System.out.println(name);//返回路径最后的文件名或者目录名

        File f4=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\01 File类\\05_File类获取功能的方法.flv");
        long size=f4.length();
        System.out.println(size);//返回指定文件的大小，若文件路径不存在则返回0，文件夹没有大小
    }
}
