import java.awt.*;
import java.awt.event.*;

public class KeyEventTest extends Frame {
	Button man;

	public KeyEventTest() {
		super("活用Key事件");
		setLayout(null);
		setSize(300, 150);
		man = new Button("按下键盘的箭头键移动试试");
		man.setBounds(20, 50, 150, 40);
		man.setBackground(Color.BLUE);
		man.setForeground(Color.WHITE);
		add(man);
		man.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				String direction = e.getKeyText(e.getKeyCode());
				int x = man.getX();
				int y = man.getY();
				if (direction.equals("Right"))
					x += 10;
				else if (direction.equals("Left"))
					x -= 10;
				else if (direction.equals("Down"))
					y += 10;
				else if (direction.equals("Up"))
					y -= 10;
				man.setLocation(x, y);
			}
		});
	}

	public static void main(String[] args) {
		final KeyEventTest obj = new KeyEventTest();
		obj.setVisible(true);
		obj.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				obj.dispose();
			}
		});
	}
}
