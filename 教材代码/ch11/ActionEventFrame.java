//点击按钮设置屏背景颜色的例子
import java.awt.*;
import java.awt.event.*;

class ColorAction implements ActionListener {//事件侦听器类
	private ActionEventFrame frame;//用主类对象作为变量,方便两类之间联系

	private Color backgroundcolor;

	public ColorAction(ActionEventFrame aef, Color c) {//带2个参数的构造方法
		frame = aef;
		backgroundcolor = c;
	}

	public void actionPerformed(ActionEvent e) {//实现接口方法
		frame.setBackground(backgroundcolor);
	}
}
public class ActionEventFrame extends Frame {
	ActionEventFrame() {
		Panel panel = new Panel();
		//创建三个事件源
		Button redbutton = new Button("红色");
		Button greenbutton = new Button("绿色");
		Button bluebutton = new Button("蓝色");
		panel.add(redbutton);
		panel.add(greenbutton);
		panel.add(bluebutton);
		add(panel, "South");
		//注册事件侦听器:同一个类的三个不同对象
		redbutton.addActionListener(new ColorAction(this, Color.red));
		greenbutton.addActionListener(new ColorAction(this, Color.green));
		bluebutton.addActionListener(new ColorAction(this, Color.blue));
	}
	public static void main(String argc[]) {
		ActionEventFrame myframe = new ActionEventFrame();
		myframe.setTitle("ActionEvent事件");
		myframe.setSize(200, 150);
		myframe.setVisible(true);
	}
}
