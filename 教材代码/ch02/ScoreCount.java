//例 2.11 成绩分类统计，用图形界面输入成绩、输出结果
import javax.swing.*;

public class ScoreCount {
	public static void main(String args[]) {
		int n0, n30, n40, n50, n60, n70, n80, n90;
		n0 = n30 = n40 = n50 = n60 = n70 = n80 = n90 = 0;// 各分数段次数"清0"
		String str;
		float score;

		while (true) {
			str = JOptionPane.showInputDialog("请输入学生成绩:(负数表示输入结束)");
			score = Float.parseFloat(str);
			if (score < 0)
				break;

			// 分类统计
			if (score >= 90) {
				n90++;
			} else if (score >= 80) {
				n80++;
			} else if (score >= 70) {
				n70++;
			} else if (score >= 60) {
				n60++;
			} else if (score >= 50) {
				n50++;
			} else if (score >= 40) {
				n40++;
			} else if (score >= 30) {
				n30++;
			} else {
				n0++;
			}
		}

		String str90 = "90~100   分的人数：" + n90 + "\n";
		String str80 = "80~89.99 分的人数：" + n80 + "\n";
		String str70 = "70~79.99 分的人数：" + n70 + "\n";
		String str60 = "60~69.99 分的人数：" + n60 + "\n";
		String str50 = "50~59.99 分的人数：" + n50 + "\n";
		String str40 = "40~49.99 分的人数：" + n40 + "\n";
		String str30 = "30~39.99 分的人数：" + n30 + "\n";
		String str0 = "00~29.99 分的人数：" + n0 + "\n";

		JOptionPane.showMessageDialog(null, "各分数段的人数如下：\n" + str90 + str80
				+ str70 + str60 + str50 + str40 + str30 + str0);
	}
}