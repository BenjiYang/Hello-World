interface X{
	void m1();	
}
interface Y{
	void m2();
}

//接口Z多重继承X和Y接口
interface Z extends X,Y{
	void m3();
}

/*实现Z接口的类除了要实现Z本身声明的方法m3()，同时还必须实现所继承过来的方法m1()和m2()*/
class XYZ implements Z{
	public void m1(){
    		System.out.println("实现m1()方法");
	} 
	public void m2(){
   	 	System.out.println("实现m2()方法");
	}
	public void m3(){
   		System.out.println("实现m3()方法");
	}
}
