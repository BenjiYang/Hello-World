import java.awt.*;
class PanelExample extends Panel {
	public static void main(String[] args) {
		Frame f = new Frame("Panel Example");
		PanelExample pe = new PanelExample();// �������
		f.add(pe);// �������ӵ����
		Label message = new Label("��ӭ�����JAVA GUIѧϰ��");
		f.add(message, BorderLayout.SOUTH);// ����ǩ���õ���ܵײ�
		f.setSize(200, 200);
		f.setVisible(true);
	}
}
