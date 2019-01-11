import java.awt.*;
class DialogExample extends Frame{//Dialog类与Frame类不同的是它不能单独存在.
	public static void main(String[] args) {
	DialogExample de = new DialogExample();
	de.setTitle("Working with Dialogs");
	de.setSize(300, 100);
	de.setVisible(true);

	Dialog d = new Dialog(de, "My Dialog");//Dialog对象.
	d.setSize(200, 75);
	d.setVisible(true);
}
}