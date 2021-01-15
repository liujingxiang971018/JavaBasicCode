package day16.demo03Filter;

import java.io.File;

/*
* 过滤器：FileFilter filter
* FIle[] listfiles(FileFilter filter)
* java.io.FileFilter接口
*   作用：用来过滤文件（File对象）
*   抽象方法：boolean accept(File pathname)测试指定抽象路径名是否应该包含某个路径名列表汇中
*   参数：
*       File pathname：使用ListFiles方法遍历目录，得到的每一个文件对象
*
* FIle[] listfiles(FilenameFilter filter)
* java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
*   作用：用于过滤文件名称
*   抽象方法：
*       boolean accept(File dir,String name)测试指定文件是否应该包含在某一个文件列表中
*       参数:
*           File dir:构造方法中传递的被遍历的目录
*           String name：使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称
*
* 注意：
*   两个过滤器是抽象方法，需要重写
* */
public class demo01 {
    public static void main(String[] args) {
        File file=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流");
        print(file);
    }

    private static void print(File file) {
        File[] files=file.listFiles(new FileFilterImpl());
        for (File file1:files){
            if(!file1.isDirectory()){
                System.out.println(file1);
            }
            else{
                print(file1);//递归查询打印
            }
        }
    }
}
