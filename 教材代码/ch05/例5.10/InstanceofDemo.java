class Animal{
	…
}
class Dog extends Animal{
	…
}
public class InstanceofDemo {
	public static void main(String[] args){
		Animal animal;
		animal=new Animal();
		if(animal instanceof Animal){
			System.out.println("animal的类型是 Animal");
		}else{
			System.out.println("animal的类型不是 Animal");
		}
		animal=new Dog();
		if(animal instanceof Dog){
			System.out.println("animal的类型可以转换为 Dog");
		}else{
			System.out.println("animal的类型不能转换为是Dog");
		}
	}
}
