package day17.demo03FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 创建BS版本版本TCP服务器
* */
public class demo03BServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8080);
        Socket socket=serverSocket.accept();

        InputStream is=socket.getInputStream();

        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        //把客户端请求信息的第一行读出来
        String line=br.readLine();
        //把读取的信息进行切割，只要路径
        String[] strings=line.split(" ");
        //把路径前面的/去掉
        String path=strings[1].substring(1);
        //创建一个本地字节输入流
        FileInputStream fis=new FileInputStream(path);

        //使用方法getOutputStream()获取网络字节输出流对象
        OutputStream os=socket.getOutputStream();
        //写入HTTP协议响应头，固定写流
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        //必须写入空行，否则罗兰器不解析
        os.write("\r\n".getBytes());

        //把b.txt文件回写到客户端
        byte[] bytes=new byte[1024];
        int len=fis.read(bytes);
        while(len!=-1){
            os.write(bytes,0,len);
            len=fis.read(bytes);
        }
        //释放资源
        fis.close();
        socket.close();
        serverSocket.close();
        //http://127.0.0.1:8080/day17-Socket/b.txt   成功打印
    }
}
