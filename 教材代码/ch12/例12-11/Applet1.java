//例12－11  类Applet1
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
		//找到此 applet 上下文所代表的文档中的所有 Applet。
		Enumeration enum1 = getAppletContext().getApplets();
		while (enum1.hasMoreElements()) {//把所有 Applet 的类名显示在文本框上。
			Applet appletTemp = (Applet) enum1.nextElement();
			ta.append(appletTemp.getClass().toString() + "\n");
		}
	}
	public void mouseMoved(MouseEvent me) {
		if (myapplet == null)
			//使用给定的名称找到并返回此 Applet 上下文所代表的文档中的 Applet2。
			myapplet = (Applet2) getAppletContext().getApplet("Applet2");
		//调用Applet2移动按钮的方法，将Applet2的按钮移到新的位置。
		myapplet.moveButton(me.getX(), me.getY());
	}
	public void mouseDragged(MouseEvent me) {
	}
}
