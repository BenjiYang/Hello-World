class Student{
    	int no;
    	String name;
    	public Student (int sno,String sname){
        	no=sno;
        	name=sname;
    	}
}

public class ObjectArrayDemo {
    	Student[] student = new Student[4];            //声明一个长度为4的对象数组
   	public ObjectArrayDemo(){
		//初始化对象数组
        	student[0] = new Student(2006090001,"小刘");
        	student[1]=new Student(2006090002,"小李");
        	student[2]=new Student(2006090003,"小唐");
        	student[3]=new Student(2006090004,"小何");
    	}
    	void printArrayElement(){
        	int j=1;
        	for(int i=0;i<student.length;i++){         //使用循环语句来访问对象数组元素
            		System.out.println("第"+j+"个学生的学号:"+student[i].no+
				",姓名:"+student[i].name);
            		j++;
        	}
    	}
    	public static void main(String args[]){
       		ObjectArrayDemo ad=new ObjectArrayDemo();
       		ad.printArrayElement();
    	}
}
