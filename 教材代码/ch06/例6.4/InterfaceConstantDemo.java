interface Printable{
	int OP1=33;					 //������������ͬʱ�����������ʼֵ
	int OP2=12;
	void print();
}

public class InterfaceConstantDemo implements Printable {
	public void print(){
		OP1=26;					 //�Ƿ��������޸Ľӿڳ�����ֵ
		System.out.println(OP2);		 //�Ϸ�����ʵ�����п�ֱ�ӷ��ʽӿڳ���
	}
}
