interface X{
	void m1();	
}
interface Y{
	void m2();
}

//�ӿ�Z���ؼ̳�X��Y�ӿ�
interface Z extends X,Y{
	void m3();
}

/*ʵ��Z�ӿڵ������Ҫʵ��Z���������ķ���m3()��ͬʱ������ʵ�����̳й����ķ���m1()��m2()*/
class XYZ implements Z{
	public void m1(){
    		System.out.println("ʵ��m1()����");
	} 
	public void m2(){
   	 	System.out.println("ʵ��m2()����");
	}
	public void m3(){
   		System.out.println("ʵ��m3()����");
	}
}
