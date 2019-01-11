//��7��8   Ƕ�� try ��
public class NestedException {
	public static void main(String[] args) {
		try {
			int[] s = new int[5];
			try {
				System.out.println(s[-1]);
			} catch (NegativeArraySizeException ne) {
				System.out.println("inner catch");
				ne.printStackTrace();
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("outer catch");
			ae.printStackTrace();
		} finally {
			System.out.println("End");
		}
	}
}
