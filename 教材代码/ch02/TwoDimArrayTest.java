//�� 2.13 �����ά����Ԫ�ص����˻�(��ά�����Ӧ��)
public class TwoDimArrayTest {
	public static void main(String args[]) {
		int a[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };// ��ά�����ʼ��
		long p = 1L;// p����������˻�.��ֵΪ1
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				p = p * a[i][j];// �������˻�
			}
		}
		System.out.println("��ά����Ԫ�ص����˻�: " + p);
	}
}