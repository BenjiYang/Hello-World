//��12��7 
import java.awt.*;
import java.applet.*;
public class KeyboardTest extends Applet {
	String text = "";
	public void paint(Graphics g) {
		g.drawString(text, 20, 20);
	}
	public boolean keyDown(Event evt, int x)// ���̱�����ʱ��Ӧ�Ĳ���
	{
		text = "���̱�����";
		repaint();
		return true;
	}
	public boolean keyUp(Event evt, int x)// ���̱��ɿ�ʱ��Ӧ�Ĳ���
	{
		text = "�����Ѿ��ɿ�";
		repaint();
		return true;
	}
}����
