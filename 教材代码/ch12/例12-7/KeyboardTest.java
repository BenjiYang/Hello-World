//例12－7 
import java.awt.*;
import java.applet.*;
public class KeyboardTest extends Applet {
	String text = "";
	public void paint(Graphics g) {
		g.drawString(text, 20, 20);
	}
	public boolean keyDown(Event evt, int x)// 键盘被按下时相应的操作
	{
		text = "键盘被按下";
		repaint();
		return true;
	}
	public boolean keyUp(Event evt, int x)// 键盘被松开时相应的操作
	{
		text = "键盘已经松开";
		repaint();
		return true;
	}
}　　
