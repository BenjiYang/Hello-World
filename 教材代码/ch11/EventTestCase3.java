import java.awt.*;
import java.awt.event.*;
public class EventTestCase3 extends Frame {
	Label info;
	Label length;
	TextField tf;
	public EventTestCase3() {
		super("文本事件处理");
		setLayout(new GridLayout(3, 1));
		// 创建组件
		info = new Label("字符串 ");
		length = new Label("字符个数:0");
		tf = new TextField();
		add(info);
		add(length);
		add(tf);
		// 注册监听者，内部类。
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
	// 内部类
	class MyBtnHandler implements TextListener {
		public void textValueChanged(TextEvent e) {
			info.setText("字符串 " + tf.getText());
			length.setText("字符个数: " + tf.getText().length());
		}
	}
}
