//�� 2.6 ͨ�������з�ʽ�����¹���,��if...else...����ж��Ƿ���Ҫ���ɸ�������˰
public class PersonalTax {
	public static void main(String args[]) {
		double salary;
		salary = Double.parseDouble(args[0]);
		System.out.println("�����¹���Ϊ: " + salary + "Ԫ");
		if (salary > 2000.0)
			System.out.println("����˰������Ӧ�ý��ɸ�������˰��");
		else
			System.out.println("����˰���������ڲ��ý��ɸ�������˰��");
	}
}