//随机打印字符串
public class RandomDemo {
	// 用静态方法实现随机输出字符串功能
	public static String random_print_str(String str) {
		int n = str.length();// 得到源字符串长度
		char[] source = str.toCharArray();// 将源字符串内容存放于一个字符数组中
		char[] result = new char[n];// 定义一个用于存放结果的字符数组
		int rand_pos;// 存放每次产生的随机位置
		int count;// 计数
		// 用二重循环来获得随机字符串:外循环保证所有字符被输出,内循环保证每次输出的字符都是随机的
		for (int i = 0; i < n; i++) {
			// source中去除内容为' '的字符,称为剩余字符
			// 根据剩余的字符个数来生成随机数,即产生[1,n-i]的随机整数
			rand_pos = (int) (1 + Math.random() * (n - i));
			count = 0;// 计数复位为0
			for (int j = 0; j < n; j++) {// 查找剩余字符中处于第rand_pos位字符
				if (source[j] != ' ') {
					count++;
					if (rand_pos == count) {// 已找到对应位置
						result[i] = source[j];
						source[j] = ' ';// 该位置字符已输出,下一次字符输出时不予考虑
						break;// 已找到字符,并处理完毕.结束内循环
					}
				}
			}
		}
		return new String(result);// 由result字符数组生成结果字符串,并返回
	}

	public static void main(String[] args) {
		char alpha[] = new char[26];
		for (int i = 0; i < 26; i++)
			alpha[i] = (char) ('A' + i);
		// 生成源字符串,调用random_print_str()静态方法
		String s_str = new String(alpha);
		String r_str = random_print_str(s_str);
		System.out.println("随机输出26个英文字母(大写):");
		System.out.println(r_str);
	}
}
