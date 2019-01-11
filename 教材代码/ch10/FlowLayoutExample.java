import java.awt.*;
public class FlowLayoutExample extends Frame {
	public FlowLayoutExample() {
		setLayout(new FlowLayout());
		setFont(new Font("Arial", Font.BOLD, 12));
		add(new Button("Button1"));
		add(new Button("Button2"));
		add(new Button("Button3"));
		add(new Button("Button4"));
		add(new Button("Button5"));
	}
	public static void main(String argc[]) {
		FlowLayoutExample f = new FlowLayoutExample();
		f.pack();
		f.setTitle("FlowLayoutExample");
		f.setSize(250, 150);
		f.setVisible(true);
	}
}
