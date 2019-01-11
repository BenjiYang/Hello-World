//例 2.3 全局变量与局部变量的比较
public class VariableTest {
	static int a = 10; // 全局变量,属于类所有,可直接使用

	int b; // 全局变量,属于对象所有,需要实例化后再使用

	public void print() {//方法
		b = 20;
		System.out.println("在print()中, 全局变量　a = " + a + ", b = " + b);
		int c = 30;// 局部变量
		System.out.println("在print()中, 局部变量　c = " + c);
	}

	public static void main(String[] args) {
		System.out.println("全局变量 a = " + a);// 直接使用
		// System.out.println("全局变量 b = " +b); 错误:实例前不能使用
		VariableTest v = new VariableTest();//对象实例化
		System.out.println("全局变量 b = " + v.b);// 正确:实例化后使用
		v.print();//调用方法
		System.out.println("变化后变量 b = " + v.b);
		// System.out.println("局部变量 c = " +v.c); 错误:局部变量超出作用范围
	}
}
