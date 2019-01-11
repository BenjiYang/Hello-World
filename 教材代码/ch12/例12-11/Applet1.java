//��12��11  ��Applet1
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Enumeration;
public class Applet1 extends Applet implements MouseMotionListener {
	Applet2 myapplet;
	private TextArea ta;
	public void init() {
		addMouseMotionListener(this);
		setBackground(Color.lightGray);
		ta = new TextArea(5, 20);
		add(ta);
		//�ҵ��� applet ��������������ĵ��е����� Applet��
		Enumeration enum1 = getAppletContext().getApplets();
		while (enum1.hasMoreElements()) {//������ Applet ��������ʾ���ı����ϡ�
			Applet appletTemp = (Applet) enum1.nextElement();
			ta.append(appletTemp.getClass().toString() + "\n");
		}
	}
	public void mouseMoved(MouseEvent me) {
		if (myapplet == null)
			//ʹ�ø����������ҵ������ش� Applet ��������������ĵ��е� Applet2��
			myapplet = (Applet2) getAppletContext().getApplet("Applet2");
		//����Applet2�ƶ���ť�ķ�������Applet2�İ�ť�Ƶ��µ�λ�á�
		myapplet.moveButton(me.getX(), me.getY());
	}
	public void mouseDragged(MouseEvent me) {
	}
}
