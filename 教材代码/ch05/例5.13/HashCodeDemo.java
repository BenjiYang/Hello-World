public class HashCodeDemo {
	public static void main(String[] args){
    		StringBuffer sb1 = new StringBuffer("hello");
    		StringBuffer sb2 = sb1;
    		System.out.print("sb1和sb2相等吗?");
    		if(sb1.equals(sb2)){
    			System.out.println("Yes!");
    		}else{
        		System.out.println("No!");
    		}
    		System.out.println("sb1的哈希代码是:"+sb1.hashCode());
    		System.out.println("sb2的哈希代码是:"+sb2.hashCode());
    		StringBuffer sb3=new StringBuffer("helllo");
    		System.out.print("sb1和sb3相等吗?");
    		if(sb1.equals(sb3)){
    			System.out.println("Yes!");
    		}else{
        		System.out.println("No!");
    		}
    		System.out.println("sb1的哈希代码是:"+sb1.hashCode());
    		System.out.println("sb3的哈希代码是:"+sb3.hashCode());         
	}
}
