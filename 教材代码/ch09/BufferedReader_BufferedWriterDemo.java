//�û����ַ���д�ļ������ļ�
import java.io.*;

public class BufferedReader_BufferedWriterDemo {
	public static void main(String[] args) throws Exception {
		// �ļ��ֽ������-->�ַ������-->���������
		FileOutputStream fos = new FileOutputStream("char.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("����!");// д���ַ�������ͬ
		bw.newLine();// ���롰���з�������ͬ
		bw.write("лл!");
		bw.newLine();
		bw.write("�ټ�!");
		bw.newLine();
		bw.close();

		// �ļ��ֽ�������-->�ַ�������-->�����ַ�������
		FileInputStream fis = new FileInputStream("char.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String s;
		// ��ѭ�����ж�ȡ�ַ�����ֱ������nullΪֹ
		while ((s = br.readLine()) != null)
			System.out.println(s);
		br.close();
	}
}