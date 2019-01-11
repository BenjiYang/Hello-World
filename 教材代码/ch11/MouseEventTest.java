import java.awt.*;
import java.awt.event.*;
public class MouseEventTest extends Frame {
	Label mouseInfo1, mouseInfo2;

	public MouseEventTest() {
		super("Mouse“∆∂Ø¥¶¿Ì");
		mouseInfo1 = new Label("");
		mouseInfo1.setBackground(Color.YELLOW);
		mouseInfo2 = new Label("");
		mouseInfo2.setBackground(Color.YELLOW);
		add(mouseInfo1, "North");
		add(mouseInfo2, "South");
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				mouseInfo1.setText(e.getX() + " " + e.getY());
			}
		});
		addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				mouseInfo2.setText("Enter");
			}
			public void mouseExited(MouseEvent e) {
				mouseInfo2.setText("Exit");
			}
			public void mousePressed(MouseEvent e) {
				if (e.getButton() == e.BUTTON1)
					mouseInfo2.setText("Left Button");
				else if (e.getButton() == e.BUTTON2)
					mouseInfo2.setText("Middle Button");
				else if (e.getButton() == e.BUTTON3)
					mouseInfo2.setText("Right Button");
			}
		});
	}
	public static void main(String[] args) {
		final MouseEventTest obj = new MouseEventTest();
		obj.setSize(300, 200);
		obj.setVisible(true);
		obj.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				obj.dispose();
			}
		});
	}
}
