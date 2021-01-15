package day16.IOCharacterStream;

import java.io.FileWriter;
import java.io.IOException;

/*
* 追加写和换行：和字节流方式一样，在构造方法添加参数append：true
* 换行符号：
* windows：\r\n
* linux:/n
* mac:/r
* */

/*
* 在JDK9之后，在try后面加上一个括号try(对象名)，执行完try..catch之后不用使用finally释放资源，会自动释放
* */
public class demo03Writer {
    public static void main(String[] args) {
        //提高变量fw的作用域，让finally可以使用
        FileWriter fw = null;
        try{
            fw=new FileWriter("E:\\Java视频\\阶段01.javase基础+高级\\08.File类与IO流\\05 IO字符流\\a.txt",true);
            char[] cs={'a','b','c'};
            fw.write(cs);
            String s="abcde";
            fw.write(s);
        }catch (IOException e){
            System.out.println(e);
        } finally {
            //一定会指定的代码：
            if(fw!=null){
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }}
    }
}
