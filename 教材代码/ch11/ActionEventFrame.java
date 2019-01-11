//�����ť������������ɫ������
import java.awt.*;
import java.awt.event.*;

class ColorAction implements ActionListener {//�¼���������
	private ActionEventFrame frame;//�����������Ϊ����,��������֮����ϵ

	private Color backgroundcolor;

	public ColorAction(ActionEventFrame aef, Color c) {//��2�������Ĺ��췽��
		frame = aef;
		backgroundcolor = c;
	}

	public void actionPerformed(ActionEvent e) {//ʵ�ֽӿڷ���
		frame.setBackground(backgroundcolor);
	}
}
public class ActionEventFrame extends Frame {
	ActionEventFrame() {
		Panel panel = new Panel();
		//���������¼�Դ
		Button redbutton = new Button("��ɫ");
		Button greenbutton = new Button("��ɫ");
		Button bluebutton = new Button("��ɫ");
		panel.add(redbutton);
		panel.add(greenbutton);
		panel.add(bluebutton);
		add(panel, "South");
		//ע���¼�������:ͬһ�����������ͬ����
		redbutton.addActionListener(new ColorAction(this, Color.red));
		greenbutton.addActionListener(new ColorAction(this, Color.green));
		bluebutton.addActionListener(new ColorAction(this, Color.blue));
	}
	public static void main(String argc[]) {
		ActionEventFrame myframe = new ActionEventFrame();
		myframe.setTitle("ActionEvent�¼�");
		myframe.setSize(200, 150);
		myframe.setVisible(true);
	}
}
