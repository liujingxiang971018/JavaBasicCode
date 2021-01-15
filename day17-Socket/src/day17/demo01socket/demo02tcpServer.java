package day17.demo01socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 表示服务器的类：
*   java.net.ServerSocket:此类实现服务器套接字
*
* 构造方法：
*   ServerSocket(int port)
*
* 成员方法：
*   Socket accept() 侦听并接受到此套接字的连接
*
* 服务器的实现步骤：
*   1、创建服务器ServerSocket对象和系统要指定的端口号
*   2、使用ServerSocket对象的方法accept，获取到请求的客户端的socket
*   3、使用getInputStream()获取网络字节输入流对象
*   4、使用read，读取客户端发送的数据
*   5、使用getOutputStream()获取网络字节输出流对象
*   6、使用write，给客户端回写数据
*   7、释放资源
* */
public class demo02tcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);

        Socket socket=server.accept();

        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));

        OutputStream os=socket.getOutputStream();
        os.write("收到请求".getBytes());

        socket.close();
        server.close();
    }
}
