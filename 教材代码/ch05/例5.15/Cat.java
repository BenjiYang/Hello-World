package mypackage;
public class Cat{
	private String name;
	private int age;
	public Cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	//重写从Object中继承过来的toString()方法
	public String toString(){
		return "我是小猫咪，我的名字是"+name+",现在刚好"+age+"周岁。";
	}
	public static void main(String[] args){
		Cat cat=new Cat("Tom",2);
		System.out.println(cat);		//调用重写后的toString()
	}
}
