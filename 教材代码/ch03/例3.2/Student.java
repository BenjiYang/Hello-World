class Student{
	private int no; 
	private String name;
	/*����һ���޲ι��췽��*/
	public Student(){
    		no=1000;
    		name="С��";
    		System.out.println("�����޲ι��췽����");
    		System.out.println("��һ��ѧ����ѧ�ţ� "+no+", ������"+name);
    		System.out.println("------------------------------------------");
	}
    	/*����һ��ֻ��һ�������Ĺ��췽��*/
	public Student(int sno){
    		no=sno;
   	    	name="С��";
   	    	System.out.println("����һ�������Ĺ��췽����");
   	    	System.out.println("�ڶ���ѧ����ѧ�ţ� "+no+", ������"+name);
   	    	System.out.println("------------------------------------------");
	}
	/*����һ���������������Ĺ��췽��*/
	public Student(int sno,String sname){
    		no=sno;
    		name=sname;
    		System.out.println("�������������Ĺ��췽����");
    		System.out.println("������ѧ����ѧ�ţ� "+no+", ������"+name);
    		System.out.println("------------------------------------------");
	}
	/*����һ��������Ĺ��췽����������˳��ͬ�ĺ������������Ĺ��췽��*/
	public Student(String sname,int sno){
    		no=sno;
    		name=sname;
    		System.out.println("�������������Ĺ��췽����");
    		System.out.println("���ĸ�ѧ����ѧ�ţ� "+no+", ������"+name);
	}
		
	public static void main(String[] args){
		//���ݵ�ǰ�����ĵ��ò�����ʽ����Ķ�����ƥ�������ʽһ�µĹ��췽��
		Student st1=new Student();
		Student st2=new Student(1001);
		Student st3=new Student(1002,"С��");
		Student st4=new Student("С��",1003);	
	}
}
