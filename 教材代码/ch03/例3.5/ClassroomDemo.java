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
        	Classroom.openTime="����8:00";                    //ʹ������ֱ�ӷ��������
         	Classroom c1=new Classroom("����10:30","A401");//��������c1
         	Classroom c2=new Classroom("����11:00","E102");//��������c2
         	/*����c1��c2ͨ��"."���������ʸ�����Ա����*/
         	String classroom=c1.classroom;
         	String openTime=c1.openTime;                    //ʹ�ö���c1���������
         	String closeTime=c1.closeTime;
                System.out.println("����"+classroom+"�Ŀ���ʱ��:"+openTime+",����ʱ"+
         		"��:"+closeTime);
         	classroom=c2.classroom;
         	openTime=c2.openTime;                         //ʹ�ö���c2���������
         	closeTime=c2.closeTime;
        	System.out.println("����" +classroom +"�Ŀ���ʱ��:"+openTime+",����ʱ"+
         		 "��:"+closeTime);
         	c2.openTime="����8:30";              //ʹ�ö���c2�������openTime��ֵ�����޸�
         	System.out.println("����"+c1.classroom +"�Ŀ���ʱ�����ڸ�Ϊ:"+c1.openTime);
         	System.out.println("����"+c2.classroom +"�Ŀ���ʱ�����ڸ�Ϊ:"+c2.openTime);
     	}
}
