//FileReader��Ӧ��
import java.io.*;

class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("myfile.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		// ��ѭ�����ж�ȡ�ַ�����ֱ������nullΪֹ
		while ((s = br.readLine()) != null)
			System.out.println(s);
		br.close();
	}
}