package day16.demo03Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class demo02 {
    public static void main(String[] args) {
        File file=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流");
        print(file);
    }

    private static void print(File file) {
/*        File[] files=file.listFiles(new FileFilter(){
            //传递过滤器对象，匿名内部类
            @Override
            public boolean accept(File file) {
                //过滤规则
                return file.isDirectory()||file.getName().toLowerCase().endsWith(".flv");
            }
        });*/
        File[] files=file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                //过滤规则，file是目录，s是文件名
                return new File(file,s).isDirectory()||s.toLowerCase().endsWith(".flv");
            }
        });
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
