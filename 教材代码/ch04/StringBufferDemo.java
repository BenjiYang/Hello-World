//StringBuffer�ĳ���������
public class StringBufferDemo {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
		System.out.println("�ַ���������Ϊ: " + sb.toString());
		System.out.println("sb.length()= " + sb.length());
		System.out.println("sb.capacity()= " + sb.capacity());
		System.out.println();

		System.out.println("����sb���³���Ϊ20��");
		sb.setLength(20);
		System.out.println("�ַ���������Ϊ: " + sb.toString());
		System.out.println("sb.length()= " + sb.length());
		System.out.println("sb.capacity()= " + sb.capacity());
	}
}