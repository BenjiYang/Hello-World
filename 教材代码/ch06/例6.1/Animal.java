/*使用abstract定义Animal为抽象类*/
abstract class Animal{
	private String color;
	abstract void breathe();
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
}

//具体类Fish继承Animal抽象类，必须实现Animal中的抽象方法breathe()
class Fish extends Animal{
	//具体实现抽象方法breathe()
	public void breathe(){
		System.out.println("用鳔呼吸");
	}
	public void swim(){
		System.out.println("游泳需要借助尾巴的摆动");
	}
}

//具体类Monkey继承Animal抽象类，必须实现Animal中的抽象方法breathe()
class Monkey extends Animal{
	private int leg;
	//具体实现抽象方法breathe()
	public void breathe(){
		System.out.println("用肺呼吸"); 
	}
	public void cry(){
		System.out.println("猴子叫:吱吱吱");
	}
}
