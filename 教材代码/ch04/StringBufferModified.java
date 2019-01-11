//StringBuffer的增加、删除、修改等操作
public class StringBufferModified {
	public static void main(String args[]) {
		char ch[] = { 'a', 'b', 'c', 'd', 'e' };
		StringBuffer sb = new StringBuffer("12345");
		sb.append("ABCDE"); // sb包含的字符串为:"12345ABCDE"
		sb.insert(0, ch); // sb包含的字符串为:"abcde12345ABCDE"
		System.out.println("增加字符串后,sb包含的字符串为: " + sb.toString());

		sb.replace(5, 10, "00000"); // sb包含的字符串为:"abcde00000ABCDE"
		System.out.println("替换字符串后,sb包含的字符串为: " + sb.toString());

		sb.delete(5, 10); // sb包含的字符串为:"abcdeABCDE"
		System.out.println("删除字符串后,sb包含的字符串为: " + sb.toString());

		sb.reverse(); // sb包含的字符串为:"EDCBAedcba"
		System.out.println("逆序后,sb包含的字符串为: " + sb.toString());
		String mystr="This is a   test.";
		String []array=mystr.split(" ");
		for(int i=0;i<array.length;i++)
			System.out.println(i+" "+array[i]);
	}
}