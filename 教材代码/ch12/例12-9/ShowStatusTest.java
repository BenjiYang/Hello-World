//��12��9
import java.awt.*;
import java.applet.*;
public class ShowStatusTest extends Applet {
	Image image;
	public void start() {//ָ�����ص�Image ����λ��  
		image = getImage(getCodeBase(), "playground.gif");
	}
	public void paint(Graphics g) {//��������ַ�����ʾ��״̬�� ��
		showStatus("Success in loading image...");
		g.drawImage(image, 0, 0, this); 	//����ָ������ͼ��
	}
}
