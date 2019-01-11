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
	//实现抽象类中的breathe()抽象方法
	void breathe(){
    		System.out.println("猴子使用肺呼吸");
	}    	
	//实现接口Climbable中的方法
	public void climb(){
    		System.out.println("猴子是爬树高手,最快速度可达"+SPEED);    
	}
	//实现接口Sleepable中的方法
	public void sleep(){
    		System.out.println("猴子睡觉时会打呼噜");    
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
