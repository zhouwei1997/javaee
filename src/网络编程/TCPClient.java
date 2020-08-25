package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author:hengyu
 * @Date:2020/8/25 16:10
 * @Version:1.0
 * @Discription: TCP通信的客户端，向服务器发送请求，给服务器发送数据，读取服务器回送的请求
 */
public class TCPClient {

    /**
     * 实现步骤
     * 1、创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
     * 2、使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
     * 3、使用网络字节输出流OutputStream对象中的方法write，给服务器发送数据
     * 4、使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
     * 5、使用网络字节输入流InputStream对象中的方法read，读取服务器回写的数据
     * 6、释放资源
     */

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好服务器".getBytes());
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));
        socket.close();
    }
}
