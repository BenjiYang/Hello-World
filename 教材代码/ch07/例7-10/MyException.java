//��7-10    �����һ���쳣��
class ExceOne extends Exception {
	void disp() {
		System.out.println("Exception in ExceOne");
	}
}
// ����ڶ����쳣��
class ExceTwo extends Exception {
	void disp() {
		System.out.println("Exception in ExceTwo");
	}
}
// ����� �����쳣�࣬���ǵڶ����쳣�������
class ExceThree extends ExceTwo {
	void disp() {
		System.out.println("Exception in ExceThree");
	}
}
class MyClass {
	// ���������쳣ExceTwo, ExceOne
	void fun(int i) throws ExceTwo, ExceOne {
		System.out.println(i);
	}
}
public class MyException extends MyClass {
			//��д����ķ����������쳣�ĳ����������ͬ;
			//�����׳����෽�����׳����쳣������"ExceThree";
	//���Բ��׳������з������׳����쳣"ExceOne";
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
