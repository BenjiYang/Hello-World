class People{
	String name;
	int age;
	People(String name,int age){
    		this.name=name;
		this.age=age;
	}
}
class Employee extends People{ 
	String position;
	Employee(){   		 //����Employee����û����ʽʹ��super���ó���Ĺ��췽������ʱϵ
		position="����"; //ͳ���Զ����ó�����޲ι��췽��������ʱ���಻�ṩ�޲ι��췽��
	}
}
