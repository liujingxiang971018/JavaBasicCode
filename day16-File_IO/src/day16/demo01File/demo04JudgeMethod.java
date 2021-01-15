package day16.demo01File;

import java.io.File;

/*
* File类判断功能的方法
*   public boolean exist():此File表示的文件互目录是否时机存在
*   public boolean isDirectory():此File类表示的是否为目录
*   public boolean isFile():此File类表示的是否为文件
* */
public class demo04JudgeMethod {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        File f1=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\01 File类\\05_File类获取功能的方法.flv");
        System.out.println(f1.exists());//存在则返回true

        File f2=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\01 File类\\05_File类获取功能的方法.flv");
        System.out.println(f2.isDirectory());//存在则返回true

        File f3=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\01 File类\\05_File类获取功能的方法.flv");
        System.out.println(f1.isFile());//存在则返回true

    }
}
