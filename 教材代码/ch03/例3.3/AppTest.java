class People {
	int age;
	String name;
	char sex;
	People(String n, int a,char s){
		name=n;
		age=a;
		sex=s;
	}
}

public class AppTest{
	public static void main(String[] args){
		People p1;//��������
		p1=new People("����",26,'��');//ʹ��new�������͹��췽��ʵ��������
		System.out.println("������"+p1.name+"\n���䣺"+p1.age+"\n�Ա�"+p1.sex);
	}
}
