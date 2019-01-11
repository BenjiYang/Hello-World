//字符串的比较
public class StringCompare {
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println("s1==s2 ?: " + (s1 == s2));
		System.out.println("s1==s3 ?: " + (s1 == s3));
		System.out.println("s3==s4 ?: " + (s3 == s4));
		System.out.println("s1.equals(s2) ?: " + s1.equals(s2));
		System.out.println("s1.equals(s3) ?: " + s1.equals(s3));
		System.out.println("s3.equals(s4) ?: " + s3.equals(s4));
		System.out.println("s1.compareTo(s3) ?: " + s1.compareTo(s3));
		String ss1= String.valueOf(123); 	//s1内容为："123"
		String ss2= String.valueOf(false); 	//s2内容为："false"
		String ss3= String.valueOf(4.5f); 	//s3内容为："4.5"
		String ss4= ss1+ss2+ss3; 			//s4内容为："123false4.5"
		System.out.println(ss4);
	}
}