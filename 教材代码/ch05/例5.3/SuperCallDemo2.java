class People{
	String name;
	int age;
	People(){  
		System.out.print("����People����޲ι��췽����");
	}
	People(String name){
		System.out.print("����People��ľ���һ�������Ĺ��췽����");
	}
	People(String name,int age){
		System.out.print("����People��ľ������������Ĺ��췽����");
	}
	People(People p){
		System.out.print("����People��ľ��ж�������Ĺ��췽����");
	}
}

class Employee extends People{ 
	String position;
	Employee(){
		super();				//���ó�����޲ι��췽��
	 	position="����";
	 	System.out.println("�ҵ�ְ����:"+position);
	}
	Employee(String name){
		super(name);			//���ó���ľ���һ�������Ĺ��췽��
		position="���";
		System.out.println("�ҵ�ְ����:"+position);
	}
	Employee(String name,int age){
		super(name,age);		//���ó���ľ������������Ĺ��췽��
		position="����ʦ";
		System.out.println("�ҵ�ְ����:"+position);
	}
	Employee(Employee emp){
		super(emp);			//���ó���ľ��ж�������Ĺ��췽��
		position=emp.position;
		System.out.println("�ҵ�ְ����:"+position);
	}
}
public class SuperCallDemo2 {
	public static void main(String[] args){
		Employee emp1=new Employee();
		Employee emp2=new Employee("����");
		Employee emp3=new Employee("�Ž�",33);
		Employee emp4=new Employee(emp2);
	}  
}
