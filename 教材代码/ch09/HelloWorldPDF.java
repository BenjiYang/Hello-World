//����PDF�ĵ���д��Ӣ�ġ�����
import java.io.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.awt.Color;

public class HelloWorldPDF {
	public static void main(String[] args) {
		// ����һ��Document����
		Document document = new Document();
		try {
			// ���� HelloWorld.pdf ���ļ�
			PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
			// ���ļ������Ϣ(���⡢����)
			document.addTitle("Hello World");
			document.addAuthor("xyz");

			// ���ĵ���׼��д������
			document.open();
			// ����һ��Ӣ�Ķ���
			document.add(new Paragraph("Hello World!"));

			// �����������塢��ɫ
			BaseFont bfChinese = BaseFont.createFont("STSongStd-Light",	"UniGB-UCS2-H", false);
			Font fontChinese = new Font(bfChinese, 24, Font.NORMAL, Color.BLUE);
			// ����һ�����Ķ���
			document.add(new Paragraph("��pdf��д�����ģ�", fontChinese));
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		// �ر��ļ�
		document.close();
		System.out.println("pdf�ļ�������!");
	}
}