//实例14.8, 动态文字．
import java.applet.*;
import java.awt.*;

public class MovingCharacter extends Applet implements Runnable {
	int x = 400;// x坐标
	int y = 100;// y坐标
	Thread my_thread; // 主方法中要定义一个线程变量my_thread
	Font f = new Font("Dialog", Font.BOLD, 30);// 定义一种字体对象	
	public void start() {// Applet程序需要在start()方法中启动线程
		my_thread = new Thread(this);
		my_thread.start();// 从现在开始程序由两个线程在执行，一个是	 //MovingCharacter对象，一个是my_thread对象
	}
	public void run() {// 将让线程要做的事放run()中
		while (true) {
			repaint();// 调用paint()方法
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
	public void stop() {	}
	public void paint(Graphics g) {
		g.setColor(Color.blue);// 设置图形对象g的颜色为兰色
		g.setFont(f);// 设置图形对象g的字体为f
		g.drawString("Hello, Java!", x, y);// 在坐标(x,y)处绘制文字
		x -= 10;
		if (x < 0)
			x = 400;
	}
}
