//�� 2.12 ���������������,�����е����ֵ����Сֵ��������ƽ����(һά�����Ӧ��)
public class ArrayTest {
	public static void main(String[] args) {
		int a[] = new int[10];// ���������������
		for (int i = 0; i < a.length; i++)
			// ��������ĳ�����������������
			a[i] = (int) (Math.random() * 100);// ����0~99�������������ŵ�������

		int max, min, sum;
		float average;
		max = min = sum = a[0];
		for (int i = 1; i < a.length; i++) {
			sum = sum + a[i];// ������Ԫ��֮��
			if (a[i] > max)
				max = a[i];// �����ֵ
			if (a[i] < min)
				min = a[i]; // ����Сֵ
		}
		average = sum / 10.0f;
		System.out.print("����Ԫ�أ�");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("\n���ֵ��" + max + ", ��Сֵ��" + min);
		System.out.println("ƽ��ֵ��" + average);
	}
}
