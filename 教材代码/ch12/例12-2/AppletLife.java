import java.applet.Applet;
import java.awt.Graphics;

public class AppletLife extends Applet {
	public void init() {
		System.out.println("初始化..");
	}
	public void start() {
		System.out.println("开始..");
	}
	public void stop() {
		System.out.println("停止..");
	}
	public void destroy() {
		System.out.println("清除..");
	}
	public void paint(Graphics g){
		g.drawString("Test...", 10, 20);
	}
}
