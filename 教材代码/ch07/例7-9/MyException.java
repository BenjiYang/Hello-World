//��7-9
class MyException extends Exception {
	void disp() {
		System.out.println("Exception is  MyException");
	}
}
public class MyExceptionTest {
	static void go() throws MyException {
		throw new MyException();
	}
	public static void main(String[] args) {
		try {
			go();
		} catch (MyException e) {
			e.disp();
		} catch (Exception e) {
			System.out.println("һ���쳣");
		}
		System.out.println("End");
	}
}
