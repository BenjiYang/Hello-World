//�� 2.4 λ�������ʹ��
class BitsOperation {
	public static void main(String args[]) {
		int x = 11;
		int y = 13;
		System.out.println(" " + x + "  �Ķ����Ʊ�ʾ: " + Integer.toBinaryString(x));
		System.out.println(" " + y + "  �Ķ����Ʊ�ʾ: " + Integer.toBinaryString(y));
		System.out.println();
		System.out.println(x + "&" + y + "�Ķ����Ʊ�ʾ: "
				+ Integer.toBinaryString(x & y));
		System.out.println(x + "|" + y + "�Ķ����Ʊ�ʾ: "
				+ Integer.toBinaryString(x | y));
		System.out.println(x + "^" + y + "�Ķ����Ʊ�ʾ:  "
				+ Integer.toBinaryString(x ^ y));
		System.out.println("~" + x + "  �Ķ����Ʊ�ʾ: " + Integer.toBinaryString(~x));
	}
}