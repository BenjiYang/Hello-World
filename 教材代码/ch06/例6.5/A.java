/*接口Computable中定义了一个常量和两个抽象方法*/
interface Computable {
	final int X=10; 
	int add();
	void print();
}

class A implements Computable{
	private int y;
	public A(int y){
    		this.y=y;
	}
	//实现抽象方法时添加public和return语句
	public int add(){
    		return X+y;
	}
	//返回类型为void,所以方法体可为空
	public void print(){    }
}
