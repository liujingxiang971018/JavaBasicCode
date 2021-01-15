package day16.demo01File;

import java.io.File;

/*
* 遍历：
*   public String[] list(): 返回一个String数组，表示该File目录中所有子文件或目录
*   public File[] listFiles():返回一个File数组，表示该File目录中所有的子文件或目录
* 注意：
*   list方法和listFiles方法遍历的是构造方法中给出的目录
*   如果构造方法给出的目录的路径不存在，会抛出空指针异常
*   如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
* */
public class demo06List {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        File file=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流");
        String[] arr=file.list();
        for (String s:arr){
            System.out.println(s);//01 File类
        }
        File[] files=file.listFiles();
        for(File file0:files){
            System.out.println(file0);//E:\Java视频\阶段01.javase基础+高级\08.File类与IO流\01 File类
        }
    }
}
