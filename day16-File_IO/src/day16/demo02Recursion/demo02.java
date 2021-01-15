package day16.demo02Recursion;

import java.io.File;

/*
* 遍历目录，只要flv文件
*   1、把file对象转成字符串对象getName()/getPath()/toString()
*   2、调用String类中的方法endsWith判断字符串是否以.flv结尾
*   3、如果是则输出
* */
public class demo02 {
    public static void main(String[] args) {
        File file=new File("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流");
        print(file);
    }

    private static void print(File file) {
        File[] files=file.listFiles();
        for (File file1:files){
            if(!file1.isDirectory()){
                String s=file1.toString();

                s=s.toLowerCase();//转成小写字母

                boolean b=s.endsWith(".flv");
                if(b)
                    System.out.println(file1);
            }
            else{
                print(file1);//递归查询打印
            }
        }
    }
}
