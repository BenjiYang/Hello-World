interface Animal{
    	void cry();
}
class Dog implements Animal{
	public void cry(){
       		System.out.println("����:������...");
    	}
}
class Cat implements Animal{
    	public void cry(){
        	System.out.println("è��:������...");
    	}
}

class Frog implements Animal{
	public void cry(){
       		System.out.println("���ܽ�:������...");
	}
}
public class InterfaceCallBack {
	public static void main(String[] args){
		Animal animal;//����һ���ӿڱ���
       	  	animal=new Dog();//������Dog����Ľӿ�����
        	animal.cry();
         	animal=new Cat();//������Cat����Ľӿ�����
         	animal.cry();
        	animal=new Frog();//������Frog����Ľӿ�����
         	animal.cry();
   	}
}
