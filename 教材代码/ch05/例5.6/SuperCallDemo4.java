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
	int n=20;					//���س����Ա����n
	int f(){					//��д����f()����
		for(int i=1;i<=10;i++){
			result*=i;
		}
		return result;
	}
	void g(){
		int m=super.n;				//���ó����Ա����n
		int c=super.f();			//���ó���f()����
		int d=f();				//���������е�����д����f()����
		System.out.println("����n������ǰ��ֵΪ:"+m+",�����غ��ֵΪ:"+n);
		System.out.println("f������дǰ�ķ���ֵ��: "+c+",��д��ķ���ֵ��: "+d);
	}
}
public class SuperCallDemo4 {
	public static void main(String[] args){
		B b=new B();
		b.g();
	}    
}
