import java.awt.*;
class DialogExample extends Frame{//Dialog����Frame�಻ͬ���������ܵ�������.
	public static void main(String[] args) {
	DialogExample de = new DialogExample();
	de.setTitle("Working with Dialogs");
	de.setSize(300, 100);
	de.setVisible(true);

	Dialog d = new Dialog(de, "My Dialog");//Dialog����.
	d.setSize(200, 75);
	d.setVisible(true);
}
}