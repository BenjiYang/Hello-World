//实例15.3 服务器端程序
import java.net.*;
import java.io.*;

public class ServerClass {
	public static void main(String args[]) {
		int i = 0;
		try {
			ServerSocket ss = new ServerSocket(2345);//开设服务端口号2345
			System.out.println("服务器启动......");
			while (true) {
				Socket sock = ss.accept();//监听端口
				i++;
				System.out.println("接受连接请求" + i);
//在 socket对象上获得输出流
				PrintStream out = new PrintStream(sock.getOutputStream());					out.println("你好");//向客户机发送一个“你好”字符串
				out.close();
				sock.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
