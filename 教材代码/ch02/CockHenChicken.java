//�� 2.9 ����ٷ���"��Ǯ��ټ�"����
public class CockHenChicken {
	public static void main(String args[]) {
		int x, y, z;
		System.out.println("������\tĸ����\tС����");
		for (x = 0; x <= 100; x++) { // ��һ��ѭ��
			for (y = 0; y <= 100; y++) { // �ڶ���ѭ��
				for (z = 0; z <= 100; z++) { // ������ѭ��
					if ((x + y + z == 100)
							&& (5.0 * x + 3.0 * y + z / 3.0 == 100.0)) {
						System.out.println(x + "\t" + y + "\t" + z);
					}
				}
			}
		}
	}
}