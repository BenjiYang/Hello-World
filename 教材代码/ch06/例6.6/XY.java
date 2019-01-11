interface X{
	void m1();
	void m2();
}

interface Y extends X{
	void m3();
}

/*接口Y继承了X，所以实现Y时，还必须同时实现接口X中的方法m1()和m2()*/
class XY implements Y{
	public void m1(){
    		System.out.println("实现m1()方法");
	} 
	public void m2(){
    		System.out.println("实现m2()方法");
	}
	public void m3(){
   		System.out.println("实现m3()方法");
	}
	public static void main(String args[]){
		XY xy=new XY();
		xy.m1();
		xy.m2();
		xy.m3();
	}
}
