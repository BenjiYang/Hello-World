import java.awt.*;
import java.awt.event.*;
public class EventTestCase3 extends Frame {
	Label info;
	Label length;
	TextField tf;
	public EventTestCase3() {
		super("�ı��¼�����");
		setLayout(new GridLayout(3, 1));
		// �������
		info = new Label("�ַ��� ");
		length = new Label("�ַ�����:0");
		tf = new TextField();
		add(info);
		add(length);
		add(tf);
		// ע������ߣ��ڲ��ࡣ
		tf.addTextListener(new MyBtnHandler());
	}
	public static void main(String[] args) {
		final EventTestCase3 f = new EventTestCase3();
		f.setSize(200, 150);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
	// �ڲ���
	class MyBtnHandler implements TextListener {
		public void textValueChanged(TextEvent e) {
			info.setText("�ַ��� " + tf.getText());
			length.setText("�ַ�����: " + tf.getText().length());
		}
	}
}
