import java.awt.*;
public class ScrollBarExample extends Frame{
Scrollbar verticalSB, horizontalSB;
	Label vertical, horizontal;
	ScrollBarExample() {
		setTitle("Scrollbar Example");
		vertical = new Label("This is vertical scroll bar");
		horizontal = new Label("This is horizontal scroll" + " bar");
		setLayout(new FlowLayout());
		int width = 300, height = 200;
		verticalSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, height);
		horizontalSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, width);
		add(vertical);
		add(verticalSB);
		add(horizontal);
		add(horizontalSB);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		ScrollBarExample txtF= new ScrollBarExample();
		}
	}