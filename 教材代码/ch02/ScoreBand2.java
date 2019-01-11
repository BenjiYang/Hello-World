//例 2.8 利用Scanner类通过控制台来输入成绩,输出相应等级(用switch实现)
import java.util.*;

public class ScoreBand2 {
	public static void main(String args[]) throws Exception {
		float score;
		Scanner sn = new Scanner(System.in);
		System.out.print("请输入成绩: ");
		score = sn.nextFloat();
		System.out.println();
		System.out.println("所输入的成绩为: " + score);
		switch ((int) (score / 10)) {
		case 10:
		case 9:
			System.out.println("等级: 优秀");
			break;
		case 8:
			System.out.println("等级: 良好");
			break;
		case 7:
			System.out.println("等级: 中等");
			break;
		case 6:
			System.out.println("等级: 及格");
			break;
		default:
			System.out.println("等级: 不及格!");
		}
	}
}