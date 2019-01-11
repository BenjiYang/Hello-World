//PDF�������ɵ�ʾ��
import java.io.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.awt.Color;

public class TablePDF {
	public static void main(String[] args) {
		// ����һ��Document����
		Document document = new Document();
		try {
			// ���� table_pdf.pdf ���ļ�
			PdfWriter.getInstance(document, new FileOutputStream("table_pdf.pdf"));
			// �����������塢��ɫ(2��)
			BaseFont bfChinese = BaseFont.createFont("STSongStd-Light",	"UniGB-UCS2-H", false);
			Font font1 = new Font(bfChinese, 24, Font.BOLD, Color.BLUE);
			Font font2 = new Font(bfChinese, 12, Font.NORMAL, Color.BLACK);

			Table mytable = new Table(5);//����5�б��
			mytable.setWidth(80); // ռҳ���� 80%    
			mytable.setPadding(5);//����������������߾���
			mytable.setSpacing(0);//���õ�Ԫ��֮�����

			Cell cell = new Cell(new Phrase("ѧ���ɼ���", font1));
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);//ˮƽ����
			cell.setColspan(5);//���5��
			mytable.addCell(cell);//�������ӵ�Ԫ��,��ͬ

			//������
			mytable.addCell(new Cell(new Phrase("����", font2)));
			mytable.addCell(new Cell(new Phrase("����", font2)));
			mytable.addCell(new Cell(new Phrase("��ѧ", font2)));
			mytable.addCell(new Cell(new Phrase("Ӣ��", font2)));
			mytable.addCell(new Cell(new Phrase("�ܳɼ�", font2)));
			//������
			mytable.addCell(new Cell(new Phrase("��Сɽ", font2)));
			mytable.addCell(new Cell("80"));
			mytable.addCell(new Cell("95"));
			mytable.addCell(new Cell("98"));
			mytable.addCell(new Cell("273"));
			mytable.addCell(new Cell(new Phrase("�����", font2)));
			mytable.addCell(new Cell("85"));
			mytable.addCell(new Cell("75"));
			mytable.addCell(new Cell("80"));
			mytable.addCell(new Cell("240"));

			document.open();//���ĵ�
			document.add(mytable);//�������ӵ��ĵ�
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		// �ر��ĵ�
		document.close();
		System.out.println("pdf���������!");
	}
}