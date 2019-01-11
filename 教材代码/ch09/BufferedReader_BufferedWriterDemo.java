//用缓冲字符流写文件、读文件
import java.io.*;

public class BufferedReader_BufferedWriterDemo {
	public static void main(String[] args) throws Exception {
		// 文件字节输出流-->字符输出流-->缓冲输出流
		FileOutputStream fos = new FileOutputStream("char.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("您好!");// 写入字符串，下同
		bw.newLine();// 插入“换行符”，下同
		bw.write("谢谢!");
		bw.newLine();
		bw.write("再见!");
		bw.newLine();
		bw.close();

		// 文件字节输入流-->字符输入流-->缓冲字符输入流
		FileInputStream fis = new FileInputStream("char.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String s;
		// 用循环逐行读取字符串，直至遇到null为止
		while ((s = br.readLine()) != null)
			System.out.println(s);
		br.close();
	}
}