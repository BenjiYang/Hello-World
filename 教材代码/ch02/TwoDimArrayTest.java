//例 2.13 计算二维数组元素的连乘积(二维数组的应用)
public class TwoDimArrayTest {
	public static void main(String args[]) {
		int a[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };// 二维数组初始化
		long p = 1L;// p用来存放连乘积.初值为1
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				p = p * a[i][j];// 计算连乘积
			}
		}
		System.out.println("二维数组元素的连乘积: " + p);
	}
}