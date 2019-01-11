class A {
	int number=30;
	int f(int x,int y){
		return x+y;
	}
	int g(int x,int y){
		return x-y;
	}
}

class B extends A{
	int number=20;                                       //隐藏了超类的number
	//重写了超类的f()方法
	int f(int x,int y){
		return x*y;
	}
}

public class MemberHiddenDemo {
	public static void main(String[] args){
		 B b=new B();
		 System.out.println("调用f()的结果："+ b.f(3,6));//调用子类重写后的f()方法
		System.out.println("调用g()的结果："+b.g(6,3));//调用子类从超类继承过来的g()方法
		 System.out.println("number="+b.number);       //调用子类声明的成员变量
	}
}
