import java.applet.Applet;
import java.awt.Graphics;

public class AppletLife extends Applet {
	public void init() {
		System.out.println("��ʼ��..");
	}
	public void start() {
		System.out.println("��ʼ..");
	}
	public void stop() {
		System.out.println("ֹͣ..");
	}
	public void destroy() {
		System.out.println("���..");
	}
	public void paint(Graphics g){
		g.drawString("Test...", 10, 20);
	}
}
