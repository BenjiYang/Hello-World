public class ClassroomDemo1 {
    	private String name;    
    	static void openTime(String str){             //类方法
        	System.out.println(str);
    	}
   	public void setName(String name){             //实例方法
        	this.name=name;
    	}
    	public String getName(){                          //实例方法
    		return name;
    	}
    	public static void main(String[] args){    	
    		ClassroomDemo1 c1=new ClassroomDemo1();   //创建第一个对象
        	c1.setName("B306");                           //合法，使用对象调用实例方法
       		//setName("B502");                            //非法，在类方法中直接调用实例方法
        	String name=c1.getName();
        	System.out.print("教室"+name);
        	c1.openTime("的开门时间是:上午8:00");         //合法，使用对象调用类方法
        	ClassroomDemo1 c2=new ClassroomDemo1();   //创建第二个对象
        	c2.setName("D101");
        	name=c2.getName();
        	System.out.print("教室"+name); 
        	openTime("的开门时间是:上午8:30");  		  //合法，在类方法中调用类方法
    	}
}
