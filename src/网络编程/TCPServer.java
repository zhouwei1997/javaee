package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:hengyu
 * @Date:2020/8/25 16:24
 * @Version:1.0
 * @Discription: TCP通信的服务器端，接受客户端的请求，读取客户端发送的数据，给客户端回写数据
 */
public class TCPServer {

    /**
     * 实现步骤
     * 1、创建服务器ServerSocket对象和系统要指定的端口号
     * 2、使用ServerSocket对象中的方法accept，获取到请求的客户端对象socket
     * 3、使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
     * 4、使用网络字节输入流InputStream对象中的方法read，读取客户端发送的数据
     * 5、使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
     * 6、使用网络字节输出流OutputStream对象中的方法write给客户端回写数据
     * 7、释放资源
     */

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket socket=serverSocket.accept();
        InputStream inputStream=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("收到，谢谢".getBytes());
        socket.close();
        serverSocket.close();
    }
}
