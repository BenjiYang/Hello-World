//�� 2.3 ȫ�ֱ�����ֲ������ıȽ�
public class VariableTest {
	static int a = 10; // ȫ�ֱ���,����������,��ֱ��ʹ��

	int b; // ȫ�ֱ���,���ڶ�������,��Ҫʵ��������ʹ��

	public void print() {//����
		b = 20;
		System.out.println("��print()��, ȫ�ֱ�����a = " + a + ", b = " + b);
		int c = 30;// �ֲ�����
		System.out.println("��print()��, �ֲ�������c = " + c);
	}

	public static void main(String[] args) {
		System.out.println("ȫ�ֱ��� a = " + a);// ֱ��ʹ��
		// System.out.println("ȫ�ֱ��� b = " +b); ����:ʵ��ǰ����ʹ��
		VariableTest v = new VariableTest();//����ʵ����
		System.out.println("ȫ�ֱ��� b = " + v.b);// ��ȷ:ʵ������ʹ��
		v.print();//���÷���
		System.out.println("�仯����� b = " + v.b);
		// System.out.println("�ֲ����� c = " +v.c); ����:�ֲ������������÷�Χ
	}
}
