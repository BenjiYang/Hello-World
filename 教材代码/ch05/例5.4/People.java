class People{
	String name;
	int age;
	People(String name,int age){
    		this.name=name;
		this.age=age;
	}
}
class Employee extends People{ 
	String position;
	Employee(){   		 //出错，Employee类中没有显式使用super调用超类的构造方法，这时系
		position="经理"; //统将自动调用超类的无参构造方法，但此时超类不提供无参构造方法
	}
}
