interface X{
	void m1();
	void m2();
}

interface Y extends X{
	void m3();
}

/*�ӿ�Y�̳���X������ʵ��Yʱ��������ͬʱʵ�ֽӿ�X�еķ���m1()��m2()*/
class XY implements Y{
	public void m1(){
    		System.out.println("ʵ��m1()����");
	} 
	public void m2(){
    		System.out.println("ʵ��m2()����");
	}
	public void m3(){
   		System.out.println("ʵ��m3()����");
	}
	public static void main(String args[]){
		XY xy=new XY();
		xy.m1();
		xy.m2();
		xy.m3();
	}
}
