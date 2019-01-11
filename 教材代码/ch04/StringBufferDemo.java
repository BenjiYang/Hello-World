//StringBuffer的长度与容量
public class StringBufferDemo {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
		System.out.println("字符串的内容为: " + sb.toString());
		System.out.println("sb.length()= " + sb.length());
		System.out.println("sb.capacity()= " + sb.capacity());
		System.out.println();

		System.out.println("设置sb的新长度为20后");
		sb.setLength(20);
		System.out.println("字符串的内容为: " + sb.toString());
		System.out.println("sb.length()= " + sb.length());
		System.out.println("sb.capacity()= " + sb.capacity());
	}
}