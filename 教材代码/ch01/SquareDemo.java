import javax.swing.JOptionPane; //��������Ҫ����

public class SquareDemo {
	public static void main(String args[]) {
		// ��������Ի�������������(�ַ���)
		String s = JOptionPane.showInputDialog("������һ����: ");
		double d = Double.parseDouble(s); // ������(�ַ���)ת��Ϊ��ֵ��
		double result = d * d;//������
		// ������Ϣ�Ի�����������
		JOptionPane.showMessageDialog(null, s + "��ƽ���ǣ�" + result);
	}
}
