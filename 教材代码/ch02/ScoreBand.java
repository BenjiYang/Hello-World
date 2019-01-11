//例 2.7 通过控制台输入成绩,输出相应等级(if...else...嵌套)
import java.io.*;

public class ScoreBand {
	public static void main(String args[]) throws Exception {
		float score;

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		System.out.print("请输入成绩: ");
		String s = br.readLine();
		score = Float.parseFloat(s);

		System.out.println();
		System.out.println("所输入的成绩为: " + score);
		if (score >= 90) {
			System.out.println("等级: 优秀");
		} else if (score >= 80) {
			System.out.println("等级: 良好");
		} else if (score >= 70) {
			System.out.println("等级: 中等");
		} else if (score >= 60) {
			System.out.println("等级: 及格");
		} else {
			System.out.println("等级: 不及格!");
		}
	}
}