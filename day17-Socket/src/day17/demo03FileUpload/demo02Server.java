package day17.demo03FileUpload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

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
        ServerSocket server=new ServerSocket(8888);

        /*
        * 保证一直保存文件
        * */
        while(true){
            /*
            * 使用多线程技术，提高程序的效率
            * 有一个客户端上传文件，就开始一个线程，完成文件的上传
            * */
            Socket socket=server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        /*
                         * 自定义一个文件的命名规则：防止同名的文件被覆盖
                         * 规则：域名+毫秒值+随机数
                         * */
                        String filename="day17-Socket\\"+System.currentTimeMillis()+new Random().nextInt(1000)+".txt";

                        FileOutputStream fos=new FileOutputStream(filename);

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

                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
            server.close();
        }

    }
}
