//�����ӡ�ַ���
public class RandomDemo {
	// �þ�̬����ʵ���������ַ�������
	public static String random_print_str(String str) {
		int n = str.length();// �õ�Դ�ַ�������
		char[] source = str.toCharArray();// ��Դ�ַ������ݴ����һ���ַ�������
		char[] result = new char[n];// ����һ�����ڴ�Ž�����ַ�����
		int rand_pos;// ���ÿ�β��������λ��
		int count;// ����
		// �ö���ѭ�����������ַ���:��ѭ����֤�����ַ������,��ѭ����֤ÿ��������ַ����������
		for (int i = 0; i < n; i++) {
			// source��ȥ������Ϊ' '���ַ�,��Ϊʣ���ַ�
			// ����ʣ����ַ����������������,������[1,n-i]���������
			rand_pos = (int) (1 + Math.random() * (n - i));
			count = 0;// ������λΪ0
			for (int j = 0; j < n; j++) {// ����ʣ���ַ��д��ڵ�rand_posλ�ַ�
				if (source[j] != ' ') {
					count++;
					if (rand_pos == count) {// ���ҵ���Ӧλ��
						result[i] = source[j];
						source[j] = ' ';// ��λ���ַ������,��һ���ַ����ʱ���迼��
						break;// ���ҵ��ַ�,���������.������ѭ��
					}
				}
			}
		}
		return new String(result);// ��result�ַ��������ɽ���ַ���,������
	}

	public static void main(String[] args) {
		char alpha[] = new char[26];
		for (int i = 0; i < 26; i++)
			alpha[i] = (char) ('A' + i);
		// ����Դ�ַ���,����random_print_str()��̬����
		String s_str = new String(alpha);
		String r_str = random_print_str(s_str);
		System.out.println("������26��Ӣ����ĸ(��д):");
		System.out.println(r_str);
	}
}
