class Animal{
	void cry(){
    		System.out.println("动物叫:...");
	}
}

class Dog extends Animal{
	void cry(){
    		System.out.println("狗叫:汪汪汪...");
	}
}

class Cat extends Animal{
	void cry(){
    		System.out.println("猫叫:喵喵喵...");
	}
}

class Frog extends Animal{
	void cry(){
    		System.out.println("青蛙叫:呱呱呱...");
	}
}


public class PolymorephismDemo2 {
	public static void main(String[] args){
    		Animal animal=new Animal();		  //创建Animal对象
    		animal.cry();
    		animal=new Dog();				 //创建Dog对象的向上转型对象
    		animal.cry();
    		animal=new Cat();				 //创建Cat对象的向上转型对象
    		animal.cry();
    		animal=new Frog();				//创建Frog对象的向上转型对象
    		animal.cry();
	}
}
