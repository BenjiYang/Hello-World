//�� 2.7 ͨ������̨����ɼ�,�����Ӧ�ȼ�(if...else...Ƕ��)
import java.io.*;

public class ScoreBand {
	public static void main(String args[]) throws Exception {
		float score;

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		System.out.print("������ɼ�: ");
		String s = br.readLine();
		score = Float.parseFloat(s);

		System.out.println();
		System.out.println("������ĳɼ�Ϊ: " + score);
		if (score >= 90) {
			System.out.println("�ȼ�: ����");
		} else if (score >= 80) {
			System.out.println("�ȼ�: ����");
		} else if (score >= 70) {
			System.out.println("�ȼ�: �е�");
		} else if (score >= 60) {
			System.out.println("�ȼ�: ����");
		} else {
			System.out.println("�ȼ�: ������!");
		}
	}
}