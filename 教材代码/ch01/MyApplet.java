import java.applet.Applet;//����java.applet.Applet��
import java.awt.*;//����java.awt���е���,��:Font��Image��Graphics��

public class MyApplet extends Applet {// �̳�Applet��
	Image pic;// ����ͼ�����

	public void init() {// ��ʼ������
		setFont(new Font("����", Font.BOLD, 30));// ��������
		pic = getImage(getDocumentBase(), "�Ϻ�������.jpg");// ��ȡͼ�����ͼ���ļ�Ӧ��html�ļ���ͬһĿ¼��
	}

	public void paint(Graphics g) {// ��ͼ����
		g.drawImage(pic, 0, 0, 500, 340, this);// ��ָ������λ�á���С��ʾͼ��
		g.drawString("�����ҵĵ�һ��Applet����", 50, 370);// ��ָ��λ���������
	}
}
