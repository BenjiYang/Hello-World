//例 2.10 带标签的break和continue语句
public class LabeledBreakContinue {
	public static void main(String args[]) {
		outer: //标签1
		for (int i = 0; i < 3; i++) {
			System.out.println("在外层循环中,i=" + i);
			inner: //标签2
			for (int j = 0; j < 5; j++) {
				System.out.println("  在内层循环中,j=" + j);
				if (j == 0) {
					System.out.println("    遇到continue;语句,不执行本次循环的后续语句");
					continue;
				}
				if (i == 1) {
					System.out.println("    遇到break outer;语句,跳出外层循环,程序结束");
					break outer;
				}
				if (j % 2 == 0) {
					System.out
							.println("    遇到continue outer;语句,跳至外层循环,从下一个i 值开始执行");
					continue outer;
				}
			}
		}
	}
}