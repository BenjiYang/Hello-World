class People{
	String name;
	int age;
    	//���һ���޲ι��췽��
	People(){
		name="����";
		age=26;
		System.out.println("�ҽ�"+name+",����"+age+"��");
	}
	People(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("�ҽ�"+name+",����"+age+"��");
	}
}

class Employee extends People{ 
	String position;
	Employee(){     	//OK���ڴ˹��췽���н��Զ�����People()�޲ι��췽��
		position="����"; 
		System.out.println("�ҵ�ְ����"+position);
	}
}

public class SuperCallDemo3 {
	public static void main(String[] args){
		Employee emp1=new Employee();		
	}  
}
