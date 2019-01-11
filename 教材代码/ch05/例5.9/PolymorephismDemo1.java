class Animal{
	void sleep(){
    		System.out.println("sleeping......");
	}
}

class Dog extends Animal{
	int leg;
	void sleep(){
    		System.out.println("呼呼大睡");
	}
	void eat(){
    		System.out.println("喜欢啃骨头");
	}
}

public class PolymorephismDemo1 {
	public static void main(String[] args){
    		Animal animal=new Animal();//animal为Animal对象
    		animal.sleep();			 //调用Animal对象中的sleep(),输出:sleeping......
    		animal=new Dog();		 //animal为Dog对象的向上转型对象
    		animal.sleep();;		 //调用Dog对象中的sleep(),输出:呼呼大睡
    		animal.leg=4;			 //非法,调用Dog对象新增的成员变量
    		animal.eat();			 //非法,调用Dog对象新增的成员方法     
  		Dog dog=(Dog)animal;	 	 //把向上转型对象强制转换为子类的对象
     		dog.leg=4;			 //合法
    		dog.eat();			 //合法
	}
}
