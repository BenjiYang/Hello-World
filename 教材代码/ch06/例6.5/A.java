/*�ӿ�Computable�ж�����һ���������������󷽷�*/
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
	//ʵ�ֳ��󷽷�ʱ���public��return���
	public int add(){
    		return X+y;
	}
	//��������Ϊvoid,���Է������Ϊ��
	public void print(){    }
}
