import java.awt.*;
public class ColorExample extends Frame {
	public ColorExample() {
		setLayout(new FlowLayout());
		setFont(new Font("Arial", Font.PLAIN, 18));//设置字体和大小
		//setBackground(new Color(0x5f,0x4f,0x6f)); //设置背景色
		setBackground(new Color(100,200,150)); //设置背景色
        setForeground(new Color(200,20,30)); //设置按键前景色
		add(new Button("按键1"));
		add(new Button("按键2"));
		add(new Button("按键3"));
		add(new Button("按键4"));
		add(new Button("按键5"));
	
	}
	public static void main(String argc[]) {
		ColorExample f = new ColorExample();
		f.pack();
		f.setTitle("ColorExample test");
		f.setSize(250, 150);
		f.setVisible(true);
	}
}
