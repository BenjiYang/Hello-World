//�� 2.5 ��"���"��������м��ܡ�����
public class EncryptDemo {
	public static void main(String args[]) {
		char ch1 = '��', ch2 = '��', ch3 = 'ץ', ch4 = '��';
		char secret = 'x';
		ch1 = (char) (ch1 ^ secret);
		ch2 = (char) (ch2 ^ secret);
		ch3 = (char) (ch3 ^ secret);
		ch4 = (char) (ch4 ^ secret);
		System.out.println("����: " + ch1 + ch2 + ch3 + ch4);
		ch1 = (char) (ch1 ^ secret);
		ch2 = (char) (ch2 ^ secret);
		ch3 = (char) (ch3 ^ secret);
		ch4 = (char) (ch4 ^ secret);
		System.out.println("ԭ��: " + ch1 + ch2 + ch3 + ch4);
	}
}