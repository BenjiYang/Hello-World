// ��12��11 ��Applet2
import java.awt.*;
import java.applet.*;
public class Applet2 extends Applet {
	private Button mybutton;
	public void init() {
		setBackground(Color.lightGray);
		mybutton = new Button("�㶯�Ҿ͸��Ŷ�!");
		add(mybutton);
	}
	public void moveButton(int x, int y) {//������Ƶ���λ��
		mybutton.setLocation(x, y);
	}
}
