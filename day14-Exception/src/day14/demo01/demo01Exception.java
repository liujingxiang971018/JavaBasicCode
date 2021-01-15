package day14.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.long.Throwable:类是java中所有错误或异常的超类
*   Exception:编译期异常，进行编译java程序时出现的问题
*       RuntimeException：运行期异常，java程序运行过程中出现的问题
*   Error：错误
*       需要修改源代码进行改错
* */
/*
* 异常的第一种处理方式 throws Exception;
* 异常的第二种处理方式 try{}catch{}
* */
public class demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date date= null;
        try {
            date = sdf.parse("1991年1111日");
        } catch (ParseException e) {
            System.out.println("异常处理");
            e.printStackTrace();
        }
        System.out.println(date);
    }
}
