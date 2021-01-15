package day16.demo02Recursion;

import java.io.File;

/*
* 递归遍历目录
* */
public class demo01 {
    public static void main(String[] args) {
        File file=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流");
        print(file);
    }

    private static void print(File file) {
        File[] files=file.listFiles();
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
