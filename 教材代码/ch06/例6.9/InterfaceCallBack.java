interface Animal{
    	void cry();
}
class Dog implements Animal{
	public void cry(){
       		System.out.println("狗叫:汪汪汪...");
    	}
}
class Cat implements Animal{
    	public void cry(){
        	System.out.println("猫叫:喵喵喵...");
    	}
}

class Frog implements Animal{
	public void cry(){
       		System.out.println("青蛙叫:呱呱呱...");
	}
}
public class InterfaceCallBack {
	public static void main(String[] args){
		Animal animal;//声明一个接口变量
       	  	animal=new Dog();//创建对Dog对象的接口引用
        	animal.cry();
         	animal=new Cat();//创建对Cat对象的接口引用
         	animal.cry();
        	animal=new Frog();//创建对Frog对象的接口引用
         	animal.cry();
   	}
}
