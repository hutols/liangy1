package easyExcel;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MainActivity {
    public static void main(String[] args) throws IOException {
        //1.创建客户端Socket，指定服务器地址和端口
        Socket socket = new Socket("***.***.**.*",8080);
        //2.获取输出流，向服务器端发送信息
        OutputStream os = socket.getOutputStream();//字节输出流
        PrintWriter pw = new PrintWriter(os);//将输出流包装为打印流
        //获取客户端的IP地址
        InetAddress address = InetAddress.getLocalHost();
        String ip = address.getHostAddress();
        System.out.println("本地ip：" + ip);
        System.out.println("本地端口:" + socket.getLocalPort());
        System.out.println("连接服务端ip:"+socket.getInetAddress());
        System.out.println("打印服务器端口:"+socket.getPort());
        System.out.println("本地地址:"+socket.getLocalAddress());
        System.out.println("本地端口:" + socket.getLocalPort());
        pw.write("客户端：~" + ip + "~ 接入服务器！！");
        pw.flush();
        System.out.println();
        socket.shutdownOutput();//关闭输出流
        socket.close();
    }
}