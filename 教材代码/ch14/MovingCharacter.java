//ʵ��14.8, ��̬���֣�
import java.applet.*;
import java.awt.*;

public class MovingCharacter extends Applet implements Runnable {
	int x = 400;// x����
	int y = 100;// y����
	Thread my_thread; // ��������Ҫ����һ���̱߳���my_thread
	Font f = new Font("Dialog", Font.BOLD, 30);// ����һ���������	
	public void start() {// Applet������Ҫ��start()�����������߳�
		my_thread = new Thread(this);
		my_thread.start();// �����ڿ�ʼ�����������߳���ִ�У�һ����	 //MovingCharacter����һ����my_thread����
	}
	public void run() {// �����߳�Ҫ�����·�run()��
		while (true) {
			repaint();// ����paint()����
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
	public void stop() {	}
	public void paint(Graphics g) {
		g.setColor(Color.blue);// ����ͼ�ζ���g����ɫΪ��ɫ
		g.setFont(f);// ����ͼ�ζ���g������Ϊf
		g.drawString("Hello, Java!", x, y);// ������(x,y)����������
		x -= 10;
		if (x < 0)
			x = 400;
	}
}
