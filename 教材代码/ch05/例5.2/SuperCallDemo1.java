class People{
	String name;
	int age;
	People(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("����"+name+",����"+age+"��");
	}
}
class Employee extends People{
	String position;
	Employee(String name,int age,String position){
		super(name,age);                     //ʹ��super���ó��๹�췽��
		this.position=position;
		System.out.println("�ҵ�ְ����"+position);
	}
}
public class SuperCallDemo1 {
	public static void main(String[] args){
		Employee emp=new Employee("�Ը�",35,"�߼�����");
	}
}
