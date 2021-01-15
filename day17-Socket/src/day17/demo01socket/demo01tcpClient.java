package day17.demo01socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* TCP通信的客户端，向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
* 表示客户端的类：
*   java.net.Socket:此类实现客户端套接字，套接字是两台机器间通信的端点
*
* 构造方法：
*   Socket(String host,int port)创建一个流套接字并将其连接到指定主机上的指定端口号
*   参数：host：服务器的ip
*   port：端口号
*
* 成员方法：
*   OutputStream getOutputStream() 返回此套接字的输出流
*   InputStream getInputStream() 返回此套接字的输入流
*
* 实现步骤：
*   1、床架一个客户端对象socket
*   2、使用getOutputStream()获取网络字节输出流对象
*   3、使用write，给服务器发送数据
*   4、使用getInputStream()获取网络字节输入流对象
*   5、使用read，读取服务器回写的数据
*   6、释放资源socket
*
* 注意事项：
*   1、客户端和服务器端进行交互，必须使用socket中提供的网络流，不能使用自己创建的流对象
*   2、当我们创建客户端对象socket的时候，就会请求服务器和服务器经过3次握手建立连接
*       此时如果服务器没有启动，则报异常
* */
public class demo01tcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);

        OutputStream os=socket.getOutputStream();
        os.write("你好服务器".getBytes());

        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.close();
    }
}
