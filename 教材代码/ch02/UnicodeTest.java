//�� 2.1 char������int���͵��໥ת��
public class UnicodeTest {
	public static void main(String args[]) {
		char c = '��';
		System.out.println("\'" + c + "\'��Unicode���룺" + (int) c);
		int num = 23398;
		System.out.println("Unicode����Ϊ" + num + "���ַ��ǣ�\'" + (char) num + "\'");
	}
}