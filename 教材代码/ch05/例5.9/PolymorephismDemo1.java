class Animal{
	void sleep(){
    		System.out.println("sleeping......");
	}
}

class Dog extends Animal{
	int leg;
	void sleep(){
    		System.out.println("������˯");
	}
	void eat(){
    		System.out.println("ϲ���й�ͷ");
	}
}

public class PolymorephismDemo1 {
	public static void main(String[] args){
    		Animal animal=new Animal();//animalΪAnimal����
    		animal.sleep();			 //����Animal�����е�sleep(),���:sleeping......
    		animal=new Dog();		 //animalΪDog���������ת�Ͷ���
    		animal.sleep();;		 //����Dog�����е�sleep(),���:������˯
    		animal.leg=4;			 //�Ƿ�,����Dog���������ĳ�Ա����
    		animal.eat();			 //�Ƿ�,����Dog���������ĳ�Ա����     
  		Dog dog=(Dog)animal;	 	 //������ת�Ͷ���ǿ��ת��Ϊ����Ķ���
     		dog.leg=4;			 //�Ϸ�
    		dog.eat();			 //�Ϸ�
	}
}
