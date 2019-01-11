//实例15.2，使用InetAddress对象，显示本机地址
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
