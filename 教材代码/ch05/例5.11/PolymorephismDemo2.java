class Animal{
	void cry(){
    		System.out.println("�����:...");
	}
}

class Dog extends Animal{
	void cry(){
    		System.out.println("����:������...");
	}
}

class Cat extends Animal{
	void cry(){
    		System.out.println("è��:������...");
	}
}

class Frog extends Animal{
	void cry(){
    		System.out.println("���ܽ�:������...");
	}
}


public class PolymorephismDemo2 {
	public static void main(String[] args){
    		Animal animal=new Animal();		  //����Animal����
    		animal.cry();
    		animal=new Dog();				 //����Dog���������ת�Ͷ���
    		animal.cry();
    		animal=new Cat();				 //����Cat���������ת�Ͷ���
    		animal.cry();
    		animal=new Frog();				//����Frog���������ת�Ͷ���
    		animal.cry();
	}
}
