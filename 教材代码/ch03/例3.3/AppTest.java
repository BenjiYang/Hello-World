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
		People p1;//声明对象
		p1=new People("张林",26,'男');//使用new操作符和构造方法实例化对象
		System.out.println("姓名："+p1.name+"\n年龄："+p1.age+"\n性别："+p1.sex);
	}
}
