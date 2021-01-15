package day17.demo03FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* 优化上传文件后保存的格式
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
