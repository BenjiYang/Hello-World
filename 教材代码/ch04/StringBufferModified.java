//StringBuffer�����ӡ�ɾ�����޸ĵȲ���
public class StringBufferModified {
	public static void main(String args[]) {
		char ch[] = { 'a', 'b', 'c', 'd', 'e' };
		StringBuffer sb = new StringBuffer("12345");
		sb.append("ABCDE"); // sb�������ַ���Ϊ:"12345ABCDE"
		sb.insert(0, ch); // sb�������ַ���Ϊ:"abcde12345ABCDE"
		System.out.println("�����ַ�����,sb�������ַ���Ϊ: " + sb.toString());

		sb.replace(5, 10, "00000"); // sb�������ַ���Ϊ:"abcde00000ABCDE"
		System.out.println("�滻�ַ�����,sb�������ַ���Ϊ: " + sb.toString());

		sb.delete(5, 10); // sb�������ַ���Ϊ:"abcdeABCDE"
		System.out.println("ɾ���ַ�����,sb�������ַ���Ϊ: " + sb.toString());

		sb.reverse(); // sb�������ַ���Ϊ:"EDCBAedcba"
		System.out.println("�����,sb�������ַ���Ϊ: " + sb.toString());
		String mystr="This is a   test.";
		String []array=mystr.split(" ");
		for(int i=0;i<array.length;i++)
			System.out.println(i+" "+array[i]);
	}
}