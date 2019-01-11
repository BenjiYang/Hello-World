/*ʹ��abstract����AnimalΪ������*/
abstract class Animal{
	private String color;
	abstract void breathe();
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
}

//������Fish�̳�Animal�����࣬����ʵ��Animal�еĳ��󷽷�breathe()
class Fish extends Animal{
	//����ʵ�ֳ��󷽷�breathe()
	public void breathe(){
		System.out.println("��������");
	}
	public void swim(){
		System.out.println("��Ӿ��Ҫ����β�͵İڶ�");
	}
}

//������Monkey�̳�Animal�����࣬����ʵ��Animal�еĳ��󷽷�breathe()
class Monkey extends Animal{
	private int leg;
	//����ʵ�ֳ��󷽷�breathe()
	public void breathe(){
		System.out.println("�÷κ���"); 
	}
	public void cry(){
		System.out.println("���ӽ�:֨֨֨");
	}
}
