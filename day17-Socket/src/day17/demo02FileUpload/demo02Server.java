package day17.demo02FileUpload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
* 读取客户端上传的文件，给客户端回写“上传成功”
* */
/*
* 文件上传成功，但是程序并不会停止
* 原因：阻塞
* 客户端不会上传文件的结束符，而服务器端就没有结束符，将在while循环中一直循环
* 解决方案：上传完文件后，给服务器写一个结束标记。需要在客户端上传完后加上socket.shutdownOutput方法
* */
public class demo02Server {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("day17-Socket\\b.txt");

        ServerSocket server=new ServerSocket(8888);

        Socket socket=server.accept();

        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        while(len!=-1){
            fos.write(bytes,0,len);
            len=is.read(bytes);
        }

        OutputStream os=socket.getOutputStream();
        os.write("上传成功".getBytes());

        fos.close();
        socket.close();
        server.close();

    }
}
