public class ClassroomDemo1 {
    	private String name;    
    	static void openTime(String str){             //�෽��
        	System.out.println(str);
    	}
   	public void setName(String name){             //ʵ������
        	this.name=name;
    	}
    	public String getName(){                          //ʵ������
    		return name;
    	}
    	public static void main(String[] args){    	
    		ClassroomDemo1 c1=new ClassroomDemo1();   //������һ������
        	c1.setName("B306");                           //�Ϸ���ʹ�ö������ʵ������
       		//setName("B502");                            //�Ƿ������෽����ֱ�ӵ���ʵ������
        	String name=c1.getName();
        	System.out.print("����"+name);
        	c1.openTime("�Ŀ���ʱ����:����8:00");         //�Ϸ���ʹ�ö�������෽��
        	ClassroomDemo1 c2=new ClassroomDemo1();   //�����ڶ�������
        	c2.setName("D101");
        	name=c2.getName();
        	System.out.print("����"+name); 
        	openTime("�Ŀ���ʱ����:����8:30");  		  //�Ϸ������෽���е����෽��
    	}
}
