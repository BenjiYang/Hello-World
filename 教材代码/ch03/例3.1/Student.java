public class Student {
	/*声明了一个类变量和二个实例变量*/
  	private static int sno;
   	private String name;
   	private float score;
   	/*定义了六个实例方法和一个类方法*/
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
		System.out.println("学生姓名："+name);
   	}
   	void printScore(){
       		System.out.println("总分是: "+score);
   	}
   	public static void main(String[] args){
       		Student st1=new Student();
       		st1.sno++;                               //使用实例访问静态变量
       		Student.sno++;                          //使用类名访问静态变量
       		System.out.println("学生学号： "+sno);//输出2，所有实例的修改都会反映到sno变量上
       		st.setName("张敏");
       		st.setScore(630.5f);
       		st.printName();
       		st.printScore();
   	}
}
