package day16.demo03Filter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    //执行的过滤要求，满足则返回true
    public boolean accept(File file) {
        /*
        * 接收FIle文件，判断是否已flv结尾
        * */
        //如果file是文件夹，则返回true
        if(file.isDirectory())
            return true;
        String s=file.toString();

        s=s.toLowerCase();//转成小写字母

        boolean b=s.endsWith(".flv");
        return b;
    }
}
