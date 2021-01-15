package day16.demo01File;

import java.io.File;

/*
* 路径：
*   绝对路径：是一个完整的路径
*       以盘符开始
*   相对路径：是一个简化的路径
* 注意：
*   1、路径不区分大小写
*   2、路径中的文件名称分隔符windows使用反斜杠进行转义
*
* */
public class demo02File {
    public static void main(String[] args) {
        /*
        * File类的构造方法
        * */
        show01();
        show02("C:\\","1.txt");
        show03();
    }
    /*
    * File(String pathname) 通过将给定路径名字字符串转换为抽象路径名来创建一个新FIle实例
    * 参数：
    *   字符串的路径名称
    * 创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
    * */
    private static void show01() {
        File f1=new File("D:\\1.txt");
        File f2=new File("D:\\1\\");//并不会去创建
    }

    /*
    * File(String parent,String child)根据parent路径名字符串和child路径名字符串创建一个新File实例
    * 参数：父路径和子路径
    * 好处：父路径和子路径可以单独书写
    * */
    private static void show02(String parent,String child){
        File file=new File(parent,child);
        System.out.println(file);
    }

    /*
    * File(File parent,String child)
    * 参数：父路径和子路径
    * */
    private static void show03(){
        File f1=new File("C:\\");
        File f2=new File(f1,"a.txt");
        System.out.println(f2);
    }
}
