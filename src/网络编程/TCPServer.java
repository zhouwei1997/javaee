package ������;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:hengyu
 * @Date:2020/8/25 16:24
 * @Version:1.0
 * @Discription: TCPͨ�ŵķ������ˣ����ܿͻ��˵����󣬶�ȡ�ͻ��˷��͵����ݣ����ͻ��˻�д����
 */
public class TCPServer {

    /**
     * ʵ�ֲ���
     * 1������������ServerSocket�����ϵͳҪָ���Ķ˿ں�
     * 2��ʹ��ServerSocket�����еķ���accept����ȡ������Ŀͻ��˶���socket
     * 3��ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
     * 4��ʹ�������ֽ�������InputStream�����еķ���read����ȡ�ͻ��˷��͵�����
     * 5��ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
     * 6��ʹ�������ֽ������OutputStream�����еķ���write���ͻ��˻�д����
     * 7���ͷ���Դ
     */

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket socket=serverSocket.accept();
        InputStream inputStream=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("�յ���лл".getBytes());
        socket.close();
        serverSocket.close();
    }
}
