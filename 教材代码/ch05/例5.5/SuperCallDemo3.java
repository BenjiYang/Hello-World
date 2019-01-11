class People{
	String name;
	int age;
    	//添加一个无参构造方法
	People(){
		name="王鹏";
		age=26;
		System.out.println("我叫"+name+",今年"+age+"岁");
	}
	People(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("我叫"+name+",今年"+age+"岁");
	}
}

class Employee extends People{ 
	String position;
	Employee(){     	//OK，在此构造方法中将自动调用People()无参构造方法
		position="经理"; 
		System.out.println("我的职务是"+position);
	}
}

public class SuperCallDemo3 {
	public static void main(String[] args){
		Employee emp1=new Employee();		
	}  
}
