//ʵ��15.2��ʹ��InetAddress������ʾ������ַ
import java.net.*;
public class Application1 {
	public static void main(String args[]) {
		try {
			InetAddress ia=InetAddress.getLocalHost();
			//InetAddress ia = InetAddress.getByName("sist.sysu.edu.cn");
			System.out.println(ia.getHostAddress());
			System.out.println(ia.toString());
		} catch (UnknownHostException uhe) {
		}
	 }
}
