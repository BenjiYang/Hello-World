//例 2.12 用随机数建立数组,求其中的最大值、最小值，并计算平均数(一维数组的应用)
public class ArrayTest {
	public static void main(String[] args) {
		int a[] = new int[10];// 数组的声明、创建
		for (int i = 0; i < a.length; i++)
			// 利用数组的长度属性来遍历数组
			a[i] = (int) (Math.random() * 100);// 产生0~99的随机整数，存放到数组中

		int max, min, sum;
		float average;
		max = min = sum = a[0];
		for (int i = 1; i < a.length; i++) {
			sum = sum + a[i];// 求数组元素之和
			if (a[i] > max)
				max = a[i];// 求最大值
			if (a[i] < min)
				min = a[i]; // 求最小值
		}
		average = sum / 10.0f;
		System.out.print("数组元素：");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("\n最大值：" + max + ", 最小值：" + min);
		System.out.println("平均值：" + average);
	}
}
