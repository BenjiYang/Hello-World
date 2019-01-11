import java.awt.*;
class CanvasExample1 extends Canvas {
		public CanvasExample1() {
		setBackground(Color.orange);//ÉèÖÃCanvasµÄ±³¾°ÑÕÉ«
	}
	public void paint(Graphics g) {
		g.drawString("Welcome to IBM Displayed Using " + "Canvas", 50, 100);
	}
}
public class CanvasExample extends Frame{
CanvasExample Cans1;
Label message=new Label("Welcome to IBM Displayed Using ");
	CanvasExample() {
		CanvasExample1 Cans1=new CanvasExample1();
		setLayout(new FlowLayout());
		setTitle("Canvas Example");
		setBackground(Color.orange);
  		add(Cans1);
  		add(message);
		setSize(300,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		CanvasExample testCAV= new CanvasExample();
			}
	}
	