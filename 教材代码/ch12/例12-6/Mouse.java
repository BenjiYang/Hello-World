//��12��6  ����¼�
import java.awt.*;
import java.applet.*;
public class Mouse extends Applet {
	String text = "";
	public void paint(Graphics g) {
		g.drawString(text, 20, 20);
	}
	public boolean mouseDown(Event evt, int x, int y)
// ��갴��ʱ��Ӧ�Ĳ���
	{
		text = "��걻����";
		repaint();
		return true;
	}
	public boolean mouseUp(Event evt, int x, int y)
// ����ɿ�ʱ��Ӧ�Ĳ���
	{
		text = "����Ѿ��ɿ�";
		repaint();
		return true;
	}
}
