class Animal{
	��
}
class Dog extends Animal{
	��
}
public class InstanceofDemo {
	public static void main(String[] args){
		Animal animal;
		animal=new Animal();
		if(animal instanceof Animal){
			System.out.println("animal�������� Animal");
		}else{
			System.out.println("animal�����Ͳ��� Animal");
		}
		animal=new Dog();
		if(animal instanceof Dog){
			System.out.println("animal�����Ϳ���ת��Ϊ Dog");
		}else{
			System.out.println("animal�����Ͳ���ת��Ϊ��Dog");
		}
	}
}
