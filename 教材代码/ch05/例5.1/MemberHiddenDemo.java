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
	int number=20;                                       //�����˳����number
	//��д�˳����f()����
	int f(int x,int y){
		return x*y;
	}
}

public class MemberHiddenDemo {
	public static void main(String[] args){
		 B b=new B();
		 System.out.println("����f()�Ľ����"+ b.f(3,6));//����������д���f()����
		System.out.println("����g()�Ľ����"+b.g(6,3));//��������ӳ���̳й�����g()����
		 System.out.println("number="+b.number);       //�������������ĳ�Ա����
	}
}
