interface Climbable{
	final int SPEED=100;
	void climb();
}

interface Sleepable{
	void sleep();
}

abstract class Animal{
   	abstract void breathe();
}

class Monkey extends Animal implements Climbable,Sleepable{
	//ʵ�ֳ������е�breathe()���󷽷�
	void breathe(){
    		System.out.println("����ʹ�÷κ���");
	}    	
	//ʵ�ֽӿ�Climbable�еķ���
	public void climb(){
    		System.out.println("��������������,����ٶȿɴ�"+SPEED);    
	}
	//ʵ�ֽӿ�Sleepable�еķ���
	public void sleep(){
    		System.out.println("����˯��ʱ������");    
	}
}

public class InterfaceDemo{
	public static void main(String[] args){
    		Monkey monkey=new Monkey();
    		monkey.breathe();
    		monkey.climb();
    		monkey.sleep();
	}  
}
