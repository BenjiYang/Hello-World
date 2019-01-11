class People{
	String name;
	int age;
	People(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("我是"+name+",今年"+age+"岁");
	}
}
class Employee extends People{
	String position;
	Employee(String name,int age,String position){
		super(name,age);                     //使用super调用超类构造方法
		this.position=position;
		System.out.println("我的职务是"+position);
	}
}
public class SuperCallDemo1 {
	public static void main(String[] args){
		Employee emp=new Employee("赵刚",35,"高级经理");
	}
}
