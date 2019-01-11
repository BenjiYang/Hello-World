//例 2.4 位运算符的使用
class BitsOperation {
	public static void main(String args[]) {
		int x = 11;
		int y = 13;
		System.out.println(" " + x + "  的二进制表示: " + Integer.toBinaryString(x));
		System.out.println(" " + y + "  的二进制表示: " + Integer.toBinaryString(y));
		System.out.println();
		System.out.println(x + "&" + y + "的二进制表示: "
				+ Integer.toBinaryString(x & y));
		System.out.println(x + "|" + y + "的二进制表示: "
				+ Integer.toBinaryString(x | y));
		System.out.println(x + "^" + y + "的二进制表示:  "
				+ Integer.toBinaryString(x ^ y));
		System.out.println("~" + x + "  的二进制表示: " + Integer.toBinaryString(~x));
	}
}