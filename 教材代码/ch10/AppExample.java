import java.applet.*;
import java.awt.*;
class AppExample extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(30, 30, 60, 60);
	}
}
public class GraphicsExample extends Frame {
	public GraphicsExample() {
		setTitle("绘制图形");// 设置窗体的标题
		setSize(200, 150);// 设置窗体的大小
		AppExample panel = new AppExample();
		add(panel);
	}
	public static void main(String[] args) {
		GraphicsExample frame = new GraphicsExample();
		frame.setVisible(true);
	}
}
