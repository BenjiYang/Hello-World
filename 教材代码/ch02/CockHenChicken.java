//例 2.9 用穷举法解"百钱买百鸡"问题
public class CockHenChicken {
	public static void main(String args[]) {
		int x, y, z;
		System.out.println("公鸡数\t母鸡数\t小鸡数");
		for (x = 0; x <= 100; x++) { // 第一层循环
			for (y = 0; y <= 100; y++) { // 第二层循环
				for (z = 0; z <= 100; z++) { // 第三层循环
					if ((x + y + z == 100)
							&& (5.0 * x + 3.0 * y + z / 3.0 == 100.0)) {
						System.out.println(x + "\t" + y + "\t" + z);
					}
				}
			}
		}
	}
}