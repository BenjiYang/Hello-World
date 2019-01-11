//用POI读取Word文档内容,再写入文本文件中。
//调用格式 java WordPOIDemo word文件名 文本文件名
import java.io.*;
import org.textmining.text.extraction.WordExtractor;

public class WordPOIDemo {
	public static void main(String[] args) {
		try {
			// 以word文件为参数,创建输入流
			FileInputStream in = new FileInputStream(new File(args[0]));

			// 创建WordExtractor对象
			WordExtractor extractor = new WordExtractor();

			// 从word文档提取文本
			String text = extractor.extractText(in);

			//将文本写入指定的文本文件,关关闭输入流、输出流
			PrintWriter pw = new PrintWriter(new FileWriter(new File(args[1])));
			pw.write(text);
			pw.flush();
			pw.close();
			in.close();

			System.out.println("已成功将word中的文本写入文本文件!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}