import java.awt.*;
import java.awt.event.*;
//����MenuExample�࣬�̳���WindowAdapter���ӿ�ActionListener
public class MenuExample extends WindowAdapter implements ActionListener {
	Frame f = new Frame("JAVA��ҵ��1.0.0 Writer:ZhangYunFeng"); // ʵ������� f
	TextArea a = new TextArea(); // ʵ�����ı�������
	// ����������
	public static void main(String args[]) {
		MenuExample book = new MenuExample();
		book.go();
	}
	// ����go����
	public void go() {
		f.addWindowListener(this); // ע�������
		f.setBounds(100, 100, 300, 200); // ����λ�úʹ�С
		f.setBackground(new Color(0x9f, 0x8f, 0x7f)); // ���ñ���ɫ
		f.setVisible(true); // ����Ϊ�ɼ�
		f.add(a, "Center"); // ���ı���������ӵ���ܵ�Centerλ��
		MenuBar mb = new MenuBar(); // ʵ����MenuBar���mb
		f.setMenuBar(mb); // �����ܣ���setMenuBar
		Menu m1 = new Menu("�ļ�"); // ʵ����Menu���m1��m2��m3��m4��m5
		Menu m2 = new Menu("�༭");
		Menu m3 = new Menu("��ʽ");
		Menu m4 = new Menu("����");
		Menu m5 = new Menu("����");
		mb.add(m1); // �ӵ�mb
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.setHelpMenu(m5);
		MenuItem m101 = new MenuItem("�½�"); // ʵ����MenuItem���m101��m102��m103��m104��m105
		MenuItem m102 = new MenuItem("��");
		MenuItem m103 = new MenuItem("����");
		MenuItem m104 = new MenuItem("���Ϊ");
		MenuItem m105 = new MenuItem("�˳�");
		m105.addActionListener(new ActionListener() { // ע������� �����࿪ʼ
					public void actionPerformed(ActionEvent e) {
						System.exit(1);
					}
				}); // ���������
		m103.addActionListener(this);
		m1.add(m101); // �ӵ�m1��
		m1.add(m102);
		m1.add(m103);
		m1.add(m104);
		m1.addSeparator();
		m1.add(m105);
		MenuItem m201 = new MenuItem("����"); // ʵ����MenuItem���m201��m202��m203��m204��m205
		MenuItem m202 = new MenuItem("����");
		MenuItem m203 = new MenuItem("ճ��");
		MenuItem m204 = new MenuItem("ȫѡ");
		MenuItem m205 = new MenuItem("����");
		m2.add(m201); // �ӵ�m2��
		m2.add(m202);
		m2.add(m203);
		m2.addSeparator();
		m2.add(m204);
		m2.add(m205);
		MenuItem m301 = new MenuItem("����"); // ʵ����MenuItem���m301��m302
		MenuItem m302 = new MenuItem("����");
		m3.add(m301); // �ӵ�m3��
		m3.add(m302);
		MenuItem m401 = new MenuItem("״̬��"); // ʵ����MenuItem���m401
		m4.add(m401); // �ӵ�m4��
		MenuItem m501 = new MenuItem("��������"); // ʵ����MenuItem���m501��m502
		MenuItem m502 = new MenuItem("������ҵ��");
		m502.addActionListener(new ActionListener() { // ע�������
					public void actionPerformed(ActionEvent e) {
						pin();
					}
				});
		m5.add(m501); // �ӵ�m5��
		m5.add(m502);
	}
	// �ض�windowClosing����
	public void windowClosing(WindowEvent e) {
		System.exit(1);
	}
	// ��дactionPerformed����
	public void actionPerformed(ActionEvent e) {
		FileDialog d = new FileDialog(f, "FileDialog"); // f���ڲ�����Ҫ����Ϊfinal����
		d.setVisible(true);
		String filename = d.getFile();
	}
	public void pin() {
		final Dialog dl = new Dialog(f, "����JAVA��ҵ��1.0.0");
		dl.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dl.setVisible(false);
			}
		});
		dl.setBounds(200, 200, 400, 100);
		dl.setBackground(Color.yellow);
		Label l1 = new Label("JAVA��ҵ��1.0.0�棬����:ZHANG XIAO MING, 2004-06-05",
				Label.CENTER);
		dl.setLayout(new BorderLayout());
		dl.add(l1, "Center");
		dl.setVisible(true);
	}
}
