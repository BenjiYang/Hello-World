//程序示例12－12
import java.applet.*;
import java.net.URL;
import java.net.MalformedURLException;
public class ShowDocumentTest extends Applet {
	public void init() {
		String us = "http://www.sise.com.cn"; // www.sise.com.cn为广州大学华软学院主页地址
		URL u = null;
		AppletContext ac = getAppletContext(); // 定义AppletContext类的对象ac
		try {
			u = new URL(us);
		} catch (MalformedURLException e) {
			System.err.println("Malformed URL:" + us);
		}
		if (u != null) {
			ac.showDocument(u); // 在当前浏览器窗口显示广州大学华软学院主页
		}
	}
}
