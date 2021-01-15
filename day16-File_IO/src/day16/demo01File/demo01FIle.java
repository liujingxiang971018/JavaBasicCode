package day16.demo01File;

import java.io.File;

/*
* java.io.File类
* 文件和目录路径名的抽象表示形式
* java把电脑中的文件和文件夹（目录）封装为了一个FIle类，我们可以使用FIle类对文件和文件夹进行操作
* 我们可以使用File类的方法
*   创建一个文件/文件夹
*   删除文件/文件夹
*   获取文件/文件夹
*   判断文件/文件夹是否存在
*   对文件夹进行遍历
*   获取文件的大小
* 重点：
*   file：文件
*   directory：目录
*   path：路径
* */
public class demo01FIle {
    public static void main(String[] args) {
        String pathSeparator= File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符 windows：分号，linux：冒号

        String separator=File.separator;
        System.out.println(separator);//文件名称分隔符，windows：反斜杠\，linxu：正斜杠/


    }
}
