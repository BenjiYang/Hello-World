//例7.1 零做除数的异常情况
public class ExceptionByZero {
	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		int c = a / b;
		System.out.println("a/b=" + c);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}

