class Printer {
   	public void print(String name,int age){
        	age++;//�޸Ĳ���ֵ
        	System.out.println("����!�ҽ�"+name+",����"+age+"��,�����!");
    	}
}

public class MethodCallDemo1 {
   	public static void main(String[] args){
        	Printer p=new Printer();
        	int age=26;
       		p.print("�Ž�",age);
       		System.out.println("���÷�����age��ֵΪ"+age);
    	}
}
