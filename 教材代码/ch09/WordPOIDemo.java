//��POI��ȡWord�ĵ�����,��д���ı��ļ��С�
//���ø�ʽ java WordPOIDemo word�ļ��� �ı��ļ���
import java.io.*;
import org.textmining.text.extraction.WordExtractor;

public class WordPOIDemo {
	public static void main(String[] args) {
		try {
			// ��word�ļ�Ϊ����,����������
			FileInputStream in = new FileInputStream(new File(args[0]));

			// ����WordExtractor����
			WordExtractor extractor = new WordExtractor();

			// ��word�ĵ���ȡ�ı�
			String text = extractor.extractText(in);

			//���ı�д��ָ�����ı��ļ�,�عر��������������
			PrintWriter pw = new PrintWriter(new FileWriter(new File(args[1])));
			pw.write(text);
			pw.flush();
			pw.close();
			in.close();

			System.out.println("�ѳɹ���word�е��ı�д���ı��ļ�!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}