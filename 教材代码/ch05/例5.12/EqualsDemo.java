public class EqualsDemo {
	public static void main(String[] args){
    		StringBuffer sb1=new StringBuffer("hello");
    		StringBuffer sb2=sb1;				//sb1��sb2������ͬ�Ķ�������
    		System.out.println(sb1.equals(sb2));		//���true
    		StringBuffer sb3=new StringBuffer("hello");     //�½�һ���������ø���sb3
    		System.out.println(sb1.equals(sb3));		//���false
	 }
}
