import java.awt.*;
import java.awt.Frame;
public class GridLayoutExample {
	public static void main(String[] args) {
		Frame f = new Frame("Test GridLayout");
		f.setLayout(new GridLayout(3, 3));// 设置Frame布局为GridLayout
		// 添加按钮
		f.add(new Button("[1,1]"));
		f.add(new Button("[1,2]"));
		f.add(new Button("[2,1]"));
		f.add(new Button("[2,2]"));
		f.add(new Button("[3,1]"));
		f.add(new Button("[3,2]"));
		f.setSize(200, 160);
		f.setVisible(true);
	}
}
