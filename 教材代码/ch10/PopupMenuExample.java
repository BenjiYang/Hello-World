import java.awt.*;
public class PopupMenuExample{
	public static void main(String args[]){
	Frame fm = new Frame("����ʽ�˵�");

	PopupMenu pEdit = new PopupMenu();// ��������ʽ�˵�
	MenuItem miCut = new MenuItem("����");
	MenuItem miCopy = new MenuItem("����");
	MenuItem miPaste = new MenuItem("ճ��");
	pEdit.add(miCut);//���˵�����ӵ�����ʽ�˵���
	pEdit.add(miCopy);
	pEdit.add(miPaste);

	fm.add(pEdit);//������ʽ�˵���ӵ������
	fm.setSize(300, 200);
	fm.setVisible(true);

	pEdit.show(fm, 50, 50);//��ָ��λ����ʾ����ʽ�˵�
}
}