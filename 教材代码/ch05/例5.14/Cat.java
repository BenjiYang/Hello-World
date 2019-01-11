package mypackage;
public class Cat{
	private String name;
	private int age;
	public Cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args){
		Cat cat=new Cat("Tom",2);
		System.out.println(cat);        //自动调用从Object超类继承的toString()
	}
}
