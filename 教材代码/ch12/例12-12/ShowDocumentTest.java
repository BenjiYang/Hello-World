//����ʾ��12��12
import java.applet.*;
import java.net.URL;
import java.net.MalformedURLException;
public class ShowDocumentTest extends Applet {
	public void init() {
		String us = "http://www.sise.com.cn"; // www.sise.com.cnΪ���ݴ�ѧ����ѧԺ��ҳ��ַ
		URL u = null;
		AppletContext ac = getAppletContext(); // ����AppletContext��Ķ���ac
		try {
			u = new URL(us);
		} catch (MalformedURLException e) {
			System.err.println("Malformed URL:" + us);
		}
		if (u != null) {
			ac.showDocument(u); // �ڵ�ǰ�����������ʾ���ݴ�ѧ����ѧԺ��ҳ
		}
	}
}
