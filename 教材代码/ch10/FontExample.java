import java.awt.*;
public class FontExample extends Frame {
	public FontExample() {
		setLayout(new FlowLayout());
		setFont(new Font("Arial", Font.ITALIC, 18));//设置字体和大小
		setBackground(new Color(0x4f,0x1f,0x2f)); //设置背景色
		add(new Button("按键1"));
		add(new Button("按键2"));
		add(new Button("按键3"));
		add(new Button("按键4"));
		add(new Button("按键5"));
	}
	public static void main(String argc[]) {
		FontExample f = new FontExample();
		f.pack();
		f.setTitle("FontExample test");
		f.setSize(250, 150);
		f.setVisible(true);
	}
}
