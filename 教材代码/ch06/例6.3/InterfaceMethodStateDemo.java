interface X{
	int val();	
}

public class InterfaceMethodStateDemo implements X{
	int sum=0;
	//�ڽӿڷ��������public���η�ʵ�ֽӿڷ���,�����return���
	public int val(){
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		return sum;
	}
}
