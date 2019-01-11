public class ThisKeyWordDemo3 {
	private String name;
	private double salary;
	public ThisKeyWordDemo3(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	public ThisKeyWordDemo3(String name){
		this(name,3600.0);                       //使用this关键字调用重载构造方法
	}
	public String toString(){
		return name+"的薪水是： "+salary;
	}
	public static void main(String[] agrs){
		ThisKeyWordDemo3 td1=new ThisKeyWordDemo3("Tom",10000);
		ThisKeyWordDemo3 td2=new ThisKeyWordDemo3("Jerry");
		System.out.println(td1);
		System.out.println(td2);
	}
}
