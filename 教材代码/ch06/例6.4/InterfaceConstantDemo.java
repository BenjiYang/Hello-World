interface Printable{
	int OP1=33;					 //在声明常量的同时必须对它赋初始值
	int OP2=12;
	void print();
}

public class InterfaceConstantDemo implements Printable {
	public void print(){
		OP1=26;					 //非法，不能修改接口常量的值
		System.out.println(OP2);		 //合法，在实现类中可直接访问接口常量
	}
}
