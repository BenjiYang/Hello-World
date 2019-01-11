class People{
	String name;
	int age;
	People(){  
		System.out.print("我是People类的无参构造方法，");
	}
	People(String name){
		System.out.print("我是People类的具有一个参数的构造方法，");
	}
	People(String name,int age){
		System.out.print("我是People类的具有两个参数的构造方法，");
	}
	People(People p){
		System.out.print("我是People类的具有对象参数的构造方法，");
	}
}

class Employee extends People{ 
	String position;
	Employee(){
		super();				//调用超类的无参构造方法
	 	position="工人";
	 	System.out.println("我的职务是:"+position);
	}
	Employee(String name){
		super(name);			//调用超类的具有一个参数的构造方法
		position="会计";
		System.out.println("我的职务是:"+position);
	}
	Employee(String name,int age){
		super(name,age);		//调用超类的具有两个参数的构造方法
		position="工程师";
		System.out.println("我的职务是:"+position);
	}
	Employee(Employee emp){
		super(emp);			//调用超类的具有对象参数的构造方法
		position=emp.position;
		System.out.println("我的职务是:"+position);
	}
}
public class SuperCallDemo2 {
	public static void main(String[] args){
		Employee emp1=new Employee();
		Employee emp2=new Employee("李明");
		Employee emp3=new Employee("张健",33);
		Employee emp4=new Employee(emp2);
	}  
}
