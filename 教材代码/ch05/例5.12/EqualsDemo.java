public class EqualsDemo {
	public static void main(String[] args){
    		StringBuffer sb1=new StringBuffer("hello");
    		StringBuffer sb2=sb1;				//sb1和sb2具有相同的对象引用
    		System.out.println(sb1.equals(sb2));		//输出true
    		StringBuffer sb3=new StringBuffer("hello");     //新建一个对象引用赋给sb3
    		System.out.println(sb1.equals(sb3));		//输出false
	 }
}
