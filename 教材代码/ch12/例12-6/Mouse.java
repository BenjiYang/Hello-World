//例12－6  鼠标事件
import java.awt.*;
import java.applet.*;
public class Mouse extends Applet {
	String text = "";
	public void paint(Graphics g) {
		g.drawString(text, 20, 20);
	}
	public boolean mouseDown(Event evt, int x, int y)
// 鼠标按下时相应的操作
	{
		text = "鼠标被按下";
		repaint();
		return true;
	}
	public boolean mouseUp(Event evt, int x, int y)
// 鼠标松开时相应的操作
	{
		text = "鼠标已经松开";
		repaint();
		return true;
	}
}
