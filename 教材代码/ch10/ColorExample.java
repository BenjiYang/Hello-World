import java.awt.*;
public class ColorExample extends Frame {
	public ColorExample() {
		setLayout(new FlowLayout());
		setFont(new Font("Arial", Font.PLAIN, 18));//��������ʹ�С
		//setBackground(new Color(0x5f,0x4f,0x6f)); //���ñ���ɫ
		setBackground(new Color(100,200,150)); //���ñ���ɫ
        setForeground(new Color(200,20,30)); //���ð���ǰ��ɫ
		add(new Button("����1"));
		add(new Button("����2"));
		add(new Button("����3"));
		add(new Button("����4"));
		add(new Button("����5"));
	
	}
	public static void main(String argc[]) {
		ColorExample f = new ColorExample();
		f.pack();
		f.setTitle("ColorExample test");
		f.setSize(250, 150);
		f.setVisible(true);
	}
}
