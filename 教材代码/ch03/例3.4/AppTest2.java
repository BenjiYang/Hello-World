class MyDate {
    	int day=22;
    	int month=10;
    	int year=1996;
    	String msg;
    	String printMsg(){
       		msg="我出生于"+year+"年"+month+"月"+day+"日";
       		return msg;
    	}
}

public class AppTest2{
    	public static void main(String[] agrs){
       		 MyDate myBirthday=new MyDate();//使用new操作符和默认构造方法实例化对象
        	 System.out.println(myBirthday.printMsg()); 
    	}
}
