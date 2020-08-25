package ������;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author:hengyu
 * @Date:2020/8/25 16:10
 * @Version:1.0
 * @Discription: TCPͨ�ŵĿͻ��ˣ���������������󣬸��������������ݣ���ȡ���������͵�����
 */
public class TCPClient {

    /**
     * ʵ�ֲ���
     * 1������һ���ͻ��˶���Socket�����췽���󶨷�������IP��ַ�Ͷ˿ں�
     * 2��ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
     * 3��ʹ�������ֽ������OutputStream�����еķ���write������������������
     * 4��ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
     * 5��ʹ�������ֽ�������InputStream�����еķ���read����ȡ��������д������
     * 6���ͷ���Դ
     */

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("��÷�����".getBytes());
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));
        socket.close();
    }
}
