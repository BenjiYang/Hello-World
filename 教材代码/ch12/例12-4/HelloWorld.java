import java.applet.Applet;
import java.awt.Graphics;
public class HelloWorld extends Applet {
	private String message = "Hello World";
	private int x;
	private int y;

	public void init() {
		message = getParameter("MESSAGE");
		x = Integer.parseInt(getParameter("X"));
		y = Integer.parseInt(getParameter("Y"));
	}

	public void paint(Graphics g) {
		g.drawString(message, x, y);
	}
}
