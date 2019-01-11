//实例15.3 客户端程序
import java.io.*;
import java.net.*;

public class AClient {
	public static void main(String args[]) {
		try {
			// 根据服务器IP 和端口号，创建socket连接
			Socket sock = new Socket("127.0.0.1", 2345);
			// 在socket连接上获得输入流
			BufferedReader in = new BufferedReader(new InputStreamReader(sock
					.getInputStream()));
			// 在输入流in上 读取一行服信息
			String s = in.readLine();
			// 在屏幕上输出信息
			System.out.println(s);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
