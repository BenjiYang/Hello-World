interface X{
	int val();	
}

public class InterfaceMethodStateDemo implements X{
	int sum=0;
	//在接口方法中添加public修饰符实现接口方法,并添加return语句
	public int val(){
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		return sum;
	}
}
