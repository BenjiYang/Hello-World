//�Ӽ����л�ȡ����,�����ļ�(�ֽ���-->�ַ���-->������)
import java.io.*;

public class KeyboardDemo {
	public static void main(String[] args) throws IOException {
		//��ȡ:�������ֽ�������,��ת�����ַ�������,�ٰ�װ�ɻ����ַ�������
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//д��:�ȵõ��ļ��ַ������,�ٰ�װ�ɻ����ַ������
		FileWriter fw = new FileWriter("myfile2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("�������ַ���(��Ctrl+Z����):");
		String data;
		//���ж�ȡ��д��
		while ((data = br.readLine()) != null) {
			bw.write(data);
			bw.newLine();
		}
		br.close();
		bw.close();
		System.out.println("�ļ��������!");
	}
}
