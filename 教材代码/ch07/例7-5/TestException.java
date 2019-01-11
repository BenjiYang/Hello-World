//Àý7-5
public class TestException {
	void disp() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		TestException obj = null;
		int a = 1, b = 0;
		System.out.println("Begin");
		try {
			obj.disp();
			int c = a / b;
			System.out.println(c);
		} catch (NullPointerException ne1) {
			ne1.printStackTrace();
		} catch (ArithmeticException ne) {
			System.out.println(ne.getMessage());
			throw ne;
		}
		System.out.println("End");
	}
}


