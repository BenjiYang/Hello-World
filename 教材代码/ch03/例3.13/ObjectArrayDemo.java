class Student{
    	int no;
    	String name;
    	public Student (int sno,String sname){
        	no=sno;
        	name=sname;
    	}
}

public class ObjectArrayDemo {
    	Student[] student = new Student[4];            //����һ������Ϊ4�Ķ�������
   	public ObjectArrayDemo(){
		//��ʼ����������
        	student[0] = new Student(2006090001,"С��");
        	student[1]=new Student(2006090002,"С��");
        	student[2]=new Student(2006090003,"С��");
        	student[3]=new Student(2006090004,"С��");
    	}
    	void printArrayElement(){
        	int j=1;
        	for(int i=0;i<student.length;i++){         //ʹ��ѭ����������ʶ�������Ԫ��
            		System.out.println("��"+j+"��ѧ����ѧ��:"+student[i].no+
				",����:"+student[i].name);
            		j++;
        	}
    	}
    	public static void main(String args[]){
       		ObjectArrayDemo ad=new ObjectArrayDemo();
       		ad.printArrayElement();
    	}
}
