//�� 2.11 �ɼ�����ͳ�ƣ���ͼ�ν�������ɼ���������
import javax.swing.*;

public class ScoreCount {
	public static void main(String args[]) {
		int n0, n30, n40, n50, n60, n70, n80, n90;
		n0 = n30 = n40 = n50 = n60 = n70 = n80 = n90 = 0;// �������δ���"��0"
		String str;
		float score;

		while (true) {
			str = JOptionPane.showInputDialog("������ѧ���ɼ�:(������ʾ�������)");
			score = Float.parseFloat(str);
			if (score < 0)
				break;

			// ����ͳ��
			if (score >= 90) {
				n90++;
			} else if (score >= 80) {
				n80++;
			} else if (score >= 70) {
				n70++;
			} else if (score >= 60) {
				n60++;
			} else if (score >= 50) {
				n50++;
			} else if (score >= 40) {
				n40++;
			} else if (score >= 30) {
				n30++;
			} else {
				n0++;
			}
		}

		String str90 = "90~100   �ֵ�������" + n90 + "\n";
		String str80 = "80~89.99 �ֵ�������" + n80 + "\n";
		String str70 = "70~79.99 �ֵ�������" + n70 + "\n";
		String str60 = "60~69.99 �ֵ�������" + n60 + "\n";
		String str50 = "50~59.99 �ֵ�������" + n50 + "\n";
		String str40 = "40~49.99 �ֵ�������" + n40 + "\n";
		String str30 = "30~39.99 �ֵ�������" + n30 + "\n";
		String str0 = "00~29.99 �ֵ�������" + n0 + "\n";

		JOptionPane.showMessageDialog(null, "�������ε��������£�\n" + str90 + str80
				+ str70 + str60 + str50 + str40 + str30 + str0);
	}
}