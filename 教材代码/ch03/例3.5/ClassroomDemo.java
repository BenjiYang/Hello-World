class Classroom{
    	static String openTime;
    	String closeTime,classroom;
    	Classroom(String time, String room) {
    		closeTime =time;
       		classroom=room;
    	}
}

public class ClassroomDemo {
     	public static void main(String[] agrs){
        	Classroom.openTime="上午8:00";                    //使用类名直接访问类变量
         	Classroom c1=new Classroom("晚上10:30","A401");//创建对象c1
         	Classroom c2=new Classroom("晚上11:00","E102");//创建对象c2
         	/*对象c1、c2通过"."操作符访问各个成员变量*/
         	String classroom=c1.classroom;
         	String openTime=c1.openTime;                    //使用对象c1访问类变量
         	String closeTime=c1.closeTime;
                System.out.println("教室"+classroom+"的开门时间:"+openTime+",关门时"+
         		"间:"+closeTime);
         	classroom=c2.classroom;
         	openTime=c2.openTime;                         //使用对象c2访问类变量
         	closeTime=c2.closeTime;
        	System.out.println("教室" +classroom +"的开门时间:"+openTime+",关门时"+
         		 "间:"+closeTime);
         	c2.openTime="上午8:30";              //使用对象c2对类变量openTime的值进行修改
         	System.out.println("教室"+c1.classroom +"的开门时间现在改为:"+c1.openTime);
         	System.out.println("教室"+c2.classroom +"的开门时间现在改为:"+c2.openTime);
     	}
}
