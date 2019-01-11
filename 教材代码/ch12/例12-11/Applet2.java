// 例12－11 类Applet2
import java.awt.*;
import java.applet.*;
public class Applet2 extends Applet {
	private Button mybutton;
	public void init() {
		setBackground(Color.lightGray);
		mybutton = new Button("你动我就跟着动!");
		add(mybutton);
	}
	public void moveButton(int x, int y) {//将组件移到新位置
		mybutton.setLocation(x, y);
	}
}
