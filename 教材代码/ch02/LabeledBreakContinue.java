//�� 2.10 ����ǩ��break��continue���
public class LabeledBreakContinue {
	public static void main(String args[]) {
		outer: //��ǩ1
		for (int i = 0; i < 3; i++) {
			System.out.println("�����ѭ����,i=" + i);
			inner: //��ǩ2
			for (int j = 0; j < 5; j++) {
				System.out.println("  ���ڲ�ѭ����,j=" + j);
				if (j == 0) {
					System.out.println("    ����continue;���,��ִ�б���ѭ���ĺ������");
					continue;
				}
				if (i == 1) {
					System.out.println("    ����break outer;���,�������ѭ��,�������");
					break outer;
				}
				if (j % 2 == 0) {
					System.out
							.println("    ����continue outer;���,�������ѭ��,����һ��i ֵ��ʼִ��");
					continue outer;
				}
			}
		}
	}
}