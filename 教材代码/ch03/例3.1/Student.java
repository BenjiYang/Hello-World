public class Student {
	/*������һ��������Ͷ���ʵ������*/
  	private static int sno;
   	private String name;
   	private float score;
   	/*����������ʵ��������һ���෽��*/
   	public String getName(){
		return name;
   	}
   	public void setName(String sname){
		name=sname;
   	}
   	public float getScore(){
       		return score;
   	}
   	public void setScore(float sc){
       		score=sc;
   	}
   	protected void printName(){
		System.out.println("ѧ��������"+name);
   	}
   	void printScore(){
       		System.out.println("�ܷ���: "+score);
   	}
   	public static void main(String[] args){
       		Student st1=new Student();
       		st1.sno++;                               //ʹ��ʵ�����ʾ�̬����
       		Student.sno++;                          //ʹ���������ʾ�̬����
       		System.out.println("ѧ��ѧ�ţ� "+sno);//���2������ʵ�����޸Ķ��ᷴӳ��sno������
       		st.setName("����");
       		st.setScore(630.5f);
       		st.printName();
       		st.printScore();
   	}
}
