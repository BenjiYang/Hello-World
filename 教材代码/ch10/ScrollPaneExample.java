import java.awt.*;
class ScrollPaneExample extends Frame{
	public static void main(String[] args) {
	ScrollPaneExample spe = new ScrollPaneExample();
	spe.setTitle("Working with Scroll Panes");
	spe.setSize(300, 100);
	spe.setVisible(true);
	spe.setLayout(new FlowLayout());

	ScrollPane sp1 = new ScrollPane();
	sp1.setSize(100, 45);
	TextArea ta1 = new TextArea();
	ta1.setSize(125, 50);
	sp1.add(ta1);//�ı���ȹ��������,���ֹ�����
	spe.add(sp1);

	ScrollPane sp2 = new ScrollPane();
	sp2.setSize(100, 45);
	spe.add(sp2);
}
}