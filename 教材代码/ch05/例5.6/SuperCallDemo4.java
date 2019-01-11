class A{
	int n=10,sum=0;
	int f(){
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		return sum;
	}
}
class B extends A{
	int result=1;
	int n=20;					//隐藏超类成员变量n
	int f(){					//重写超类f()方法
		for(int i=1;i<=10;i++){
			result*=i;
		}
		return result;
	}
	void g(){
		int m=super.n;				//调用超类成员变量n
		int c=super.f();			//调用超类f()方法
		int d=f();				//调用子类中的已重写过的f()方法
		System.out.println("变量n被隐藏前的值为:"+m+",被隐藏后的值为:"+n);
		System.out.println("f方法重写前的返回值是: "+c+",重写后的返回值是: "+d);
	}
}
public class SuperCallDemo4 {
	public static void main(String[] args){
		B b=new B();
		b.g();
	}    
}
