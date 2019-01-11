//PDF报表生成的示例
import java.io.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.awt.Color;

public class TablePDF {
	public static void main(String[] args) {
		// 创建一个Document对象
		Document document = new Document();
		try {
			// 生成 table_pdf.pdf 的文件
			PdfWriter.getInstance(document, new FileOutputStream("table_pdf.pdf"));
			// 设置中文字体、颜色(2种)
			BaseFont bfChinese = BaseFont.createFont("STSongStd-Light",	"UniGB-UCS2-H", false);
			Font font1 = new Font(bfChinese, 24, Font.BOLD, Color.BLUE);
			Font font2 = new Font(bfChinese, 12, Font.NORMAL, Color.BLACK);

			Table mytable = new Table(5);//设置5列表格
			mytable.setWidth(80); // 占页面宽度 80%    
			mytable.setPadding(5);//设置填充内容与表格线距离
			mytable.setSpacing(0);//设置单元格之间距离

			Cell cell = new Cell(new Phrase("学生成绩表", font1));
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
			cell.setColspan(5);//横跨5列
			mytable.addCell(cell);//给表格添加单元格,下同

			//标题行
			mytable.addCell(new Cell(new Phrase("姓名", font2)));
			mytable.addCell(new Cell(new Phrase("语文", font2)));
			mytable.addCell(new Cell(new Phrase("数学", font2)));
			mytable.addCell(new Cell(new Phrase("英语", font2)));
			mytable.addCell(new Cell(new Phrase("总成绩", font2)));
			//内容行
			mytable.addCell(new Cell(new Phrase("张小山", font2)));
			mytable.addCell(new Cell("80"));
			mytable.addCell(new Cell("95"));
			mytable.addCell(new Cell("98"));
			mytable.addCell(new Cell("273"));
			mytable.addCell(new Cell(new Phrase("李大四", font2)));
			mytable.addCell(new Cell("85"));
			mytable.addCell(new Cell("75"));
			mytable.addCell(new Cell("80"));
			mytable.addCell(new Cell("240"));

			document.open();//打开文档
			document.add(mytable);//将表格添加到文档
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		// 关闭文档
		document.close();
		System.out.println("pdf表格已生成!");
	}
}