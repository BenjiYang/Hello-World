import java.awt.*;
public class FontExample extends Frame {
	public FontExample() {
		setLayout(new FlowLayout());
		setFont(new Font("Arial", Font.ITALIC, 18));//��������ʹ�С
		setBackground(new Color(0x4f,0x1f,0x2f)); //���ñ���ɫ
		add(new Button("����1"));
		add(new Button("����2"));
		add(new Button("����3"));
		add(new Button("����4"));
		add(new Button("����5"));
	}
	public static void main(String argc[]) {
		FontExample f = new FontExample();
		f.pack();
		f.setTitle("FontExample test");
		f.setSize(250, 150);
		f.setVisible(true);
	}
}
