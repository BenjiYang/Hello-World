package mypackage;
public class Cat{
	private String name;
	private int age;
	public Cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	//��д��Object�м̳й�����toString()����
	public String toString(){
		return "����Сè�䣬�ҵ�������"+name+",���ڸպ�"+age+"���ꡣ";
	}
	public static void main(String[] args){
		Cat cat=new Cat("Tom",2);
		System.out.println(cat);		//������д���toString()
	}
}
