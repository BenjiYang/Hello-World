public class CardLayoutExample extends Frame implements ActionListener {
	Button b1 = new Button("��һ�ſ�Ƭ");
		��..
	Button b5 = new Button("�����ſ�Ƭ");
	CardLayoutExample card = new CardLayoutExample();
	CardLayoutDemo(String title) {
		setLayout(card);
		add(b1, "b1");
		����
		add(b5, "b5");
		b1.addActionListener(this);
		��..
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		card.next(this);// ����һ�ſ�Ƭ
	}
	����
}
