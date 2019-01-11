class Student{
	private int no; 
	private String name;
	/*定义一个无参构造方法*/
	public Student(){
    		no=1000;
    		name="小张";
    		System.out.println("调用无参构造方法：");
    		System.out.println("第一个学生的学号： "+no+", 姓名："+name);
    		System.out.println("------------------------------------------");
	}
    	/*定义一个只有一个参数的构造方法*/
	public Student(int sno){
    		no=sno;
   	    	name="小王";
   	    	System.out.println("调用一个参数的构造方法：");
   	    	System.out.println("第二个学生的学号： "+no+", 姓名："+name);
   	    	System.out.println("------------------------------------------");
	}
	/*定义一个含有两个参数的构造方法*/
	public Student(int sno,String sname){
    		no=sno;
    		name=sname;
    		System.out.println("调用两个参数的构造方法：");
    		System.out.println("第三个学生的学号： "+no+", 姓名："+name);
    		System.out.println("------------------------------------------");
	}
	/*定义一个与上面的构造方法参数类型顺序不同的含有两个参数的构造方法*/
	public Student(String sname,int sno){
    		no=sno;
    		name=sname;
    		System.out.println("调用两个参数的构造方法：");
    		System.out.println("第四个学生的学号： "+no+", 姓名："+name);
	}
		
	public static void main(String[] args){
		//根据当前方法的调用参数形式在类的定义中匹配参数形式一致的构造方法
		Student st1=new Student();
		Student st2=new Student(1001);
		Student st3=new Student(1002,"小李");
		Student st4=new Student("小赵",1003);	
	}
}
