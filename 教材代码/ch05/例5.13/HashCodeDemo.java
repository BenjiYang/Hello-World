public class HashCodeDemo {
	public static void main(String[] args){
    		StringBuffer sb1 = new StringBuffer("hello");
    		StringBuffer sb2 = sb1;
    		System.out.print("sb1��sb2�����?");
    		if(sb1.equals(sb2)){
    			System.out.println("Yes!");
    		}else{
        		System.out.println("No!");
    		}
    		System.out.println("sb1�Ĺ�ϣ������:"+sb1.hashCode());
    		System.out.println("sb2�Ĺ�ϣ������:"+sb2.hashCode());
    		StringBuffer sb3=new StringBuffer("helllo");
    		System.out.print("sb1��sb3�����?");
    		if(sb1.equals(sb3)){
    			System.out.println("Yes!");
    		}else{
        		System.out.println("No!");
    		}
    		System.out.println("sb1�Ĺ�ϣ������:"+sb1.hashCode());
    		System.out.println("sb3�Ĺ�ϣ������:"+sb3.hashCode());         
	}
}
