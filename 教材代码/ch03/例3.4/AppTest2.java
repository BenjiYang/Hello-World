class MyDate {
    	int day=22;
    	int month=10;
    	int year=1996;
    	String msg;
    	String printMsg(){
       		msg="�ҳ�����"+year+"��"+month+"��"+day+"��";
       		return msg;
    	}
}

public class AppTest2{
    	public static void main(String[] agrs){
       		 MyDate myBirthday=new MyDate();//ʹ��new��������Ĭ�Ϲ��췽��ʵ��������
        	 System.out.println(myBirthday.printMsg()); 
    	}
}
