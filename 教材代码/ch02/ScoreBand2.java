//�� 2.8 ����Scanner��ͨ������̨������ɼ�,�����Ӧ�ȼ�(��switchʵ��)
import java.util.*;

public class ScoreBand2 {
	public static void main(String args[]) throws Exception {
		float score;
		Scanner sn = new Scanner(System.in);
		System.out.print("������ɼ�: ");
		score = sn.nextFloat();
		System.out.println();
		System.out.println("������ĳɼ�Ϊ: " + score);
		switch ((int) (score / 10)) {
		case 10:
		case 9:
			System.out.println("�ȼ�: ����");
			break;
		case 8:
			System.out.println("�ȼ�: ����");
			break;
		case 7:
			System.out.println("�ȼ�: �е�");
			break;
		case 6:
			System.out.println("�ȼ�: ����");
			break;
		default:
			System.out.println("�ȼ�: ������!");
		}
	}
}