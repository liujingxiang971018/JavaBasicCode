package day17.demo02FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* 明确：
*   数据源和目的地
*
* 实现步骤：
*   1、创建一个本地字节输入流FileInputStream对象
*   2、创建一个客户端Socket对象
*   3、使用Socket中的方法getOutputStream()
*   4、使用本地字节输入流方法read
*   5、使用网络字节输出流的方法write
*   6、使用Socket中的方法getInputStream
*   7、使用网络字节输入流InputStream对象的方法read
* */
public class demo01Client {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("day16-File_IO\\b.txt");

        Socket socket=new Socket("127.0.0.1",8888);

        OutputStream os=socket.getOutputStream();
        byte[] bytes=new byte[1024];
        int len=fis.read(bytes);
        while(len!=-1){
            os.write(bytes,0,len);//往服务器写
            len=fis.read(bytes);
        }

        socket.shutdownOutput();

        InputStream is=socket.getInputStream();
        byte[] b=new byte[1024];
        int lens=is.read(b);
        System.out.println(new String(b,0,lens));

        fis.close();
        socket.close();
    }
}
