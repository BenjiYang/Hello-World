//例 2.1 char类型与int类型的相互转换
public class UnicodeTest {
	public static void main(String args[]) {
		char c = '大';
		System.out.println("\'" + c + "\'的Unicode编码：" + (int) c);
		int num = 23398;
		System.out.println("Unicode编码为" + num + "的字符是：\'" + (char) num + "\'");
	}
}