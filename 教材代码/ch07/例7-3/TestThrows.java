public class TestThrows {
	static void array(int size) throws NegativeArraySizeException,
			ArrayIndexOutOfBoundsException {
		int[] a = new int[size];
		System.out.println(a[10]);
	}
	static void test() {
		array(-10);
	}
	public static void main(String[] args) {
		try {
			test();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
		} catch (NegativeArraySizeException e) {
			System.out.println("���鳤��Ϊ����");
		}
		System.out.println("End");
	}
}	

