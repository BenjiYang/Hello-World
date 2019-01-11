//例7-10    定义第一个异常类
class ExceOne extends Exception {
	void disp() {
		System.out.println("Exception in ExceOne");
	}
}
// 定义第二个异常类
class ExceTwo extends Exception {
	void disp() {
		System.out.println("Exception in ExceTwo");
	}
}
// 定义第 三个异常类，它是第二个异常类的子类
class ExceThree extends ExceTwo {
	void disp() {
		System.out.println("Exception in ExceThree");
	}
}
class MyClass {
	// 方法声明异常ExceTwo, ExceOne
	void fun(int i) throws ExceTwo, ExceOne {
		System.out.println(i);
	}
}
public class MyException extends MyClass {
			//重写超类的方法。声明异常的超类的有所不同;
			//可以抛出超类方法所抛出的异常的子类"ExceThree";
	//可以不抛出超类中方法所抛出的异常"ExceOne";
	void fun(int i) throws ExceTwo, ExceThree {
		if (i< 0)
			throw new ExceThree();
		if (i > 100)
			throw new ExceTwo();
		else
			System.out.println("success!");
	}
	public static void main(String[] args) {
		MyException my = new MyException();
		try {
			my.fun(200);
		} catch (ExceThree e) {
			e.disp();
		} catch (ExceTwo e) {
			e.disp();
		} finally {
			System.out.println("Program End!");
		}
	}
}
