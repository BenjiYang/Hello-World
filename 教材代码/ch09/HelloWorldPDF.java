//创建PDF文档，写入英文、中文
import java.io.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.awt.Color;

public class HelloWorldPDF {
	public static void main(String[] args) {
		// 创建一个Document对象
		Document document = new Document();
		try {
			// 生成 HelloWorld.pdf 的文件
			PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
			// 给文件添加信息(标题、作者)
			document.addTitle("Hello World");
			document.addAuthor("xyz");

			// 打开文档，准备写入内容
			document.open();
			// 增加一个英文段落
			document.add(new Paragraph("Hello World!"));

			// 设置中文字体、颜色
			BaseFont bfChinese = BaseFont.createFont("STSongStd-Light",	"UniGB-UCS2-H", false);
			Font fontChinese = new Font(bfChinese, 24, Font.NORMAL, Color.BLUE);
			// 增加一个中文段落
			document.add(new Paragraph("在pdf中写入中文！", fontChinese));
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		// 关闭文件
		document.close();
		System.out.println("pdf文件已生成!");
	}
}