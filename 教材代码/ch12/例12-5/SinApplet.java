//��12-5 �����������ߵĳ���ʾ��
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
public class SinApplet extends Applet {
	double x0, y0, x, y;
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawLine(100, 200, 500, 200);//����X��
		g.drawLine(100, 30, 100, 370);//����Y��
		g.setColor(Color.green);
		//������������
		for (x = 100; x < 500; x += 0.001) {
			y = (int) (200 - 150 * Math.sin(8 * Math.PI * (x - 100) / 600)+0.5 );
			if(x!=100)
			g.drawLine((int) x0, (int) y0, (int) x, (int) y);
			x0 = x;
			y0 = y;
		}
	}
}
