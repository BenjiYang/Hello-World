//例 2.5 用"异或"运算符进行加密、解密
public class EncryptDemo {
	public static void main(String args[]) {
		char ch1 = '二', ch2 = '点', ch3 = '抓', ch4 = '捕';
		char secret = 'x';
		ch1 = (char) (ch1 ^ secret);
		ch2 = (char) (ch2 ^ secret);
		ch3 = (char) (ch3 ^ secret);
		ch4 = (char) (ch4 ^ secret);
		System.out.println("密文: " + ch1 + ch2 + ch3 + ch4);
		ch1 = (char) (ch1 ^ secret);
		ch2 = (char) (ch2 ^ secret);
		ch3 = (char) (ch3 ^ secret);
		ch4 = (char) (ch4 ^ secret);
		System.out.println("原文: " + ch1 + ch2 + ch3 + ch4);
	}
}