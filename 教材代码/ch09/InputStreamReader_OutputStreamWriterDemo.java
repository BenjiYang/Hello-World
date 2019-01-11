import java.io.*;

public class InputStreamReader_OutputStreamWriterDemo {
	public static void main(String[] args) throws Exception {
		String str1 = "大学";
		char cbuf[] = new char[str1.length()];
		str1.getChars(0, str1.length(), cbuf, 0);// 将字符串str1内容存放到字符数组cbuf
		String str2 = "华软软件学院";

		// 先创建文件字节输出流,再创建字符输出流
		FileOutputStream fos = new FileOutputStream("char.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		// 以多种方式写入字符数据
		osw.write('广');// 写入一个字符
		osw.write('州');// 写入一个字符
		osw.write(cbuf);// 写入字符数组内容
		osw.write(str2);// 写入字符串内容
		osw.close();

		// 先创建文件字节输入流,再创建字符输入流
		FileInputStream fis = new FileInputStream("char.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		char mychars[] = new char[str1.length() + str2.length()];// 定义一个能存放str1和str2的字符数组
		System.out.print((char) isr.read());// 以字符方式读取第1个字符,并输出
		System.out.print((char) isr.read());// 以字符方式读取第2个字符,并输出
		int len = isr.read(mychars, 0, str1.length() + str2.length());// 以字符数组方式读取剩余字符
		System.out.print(new String(mychars, 0, len));// 将字符数组内容以系统默认字符集生成字符串,并输出
		isr.close();
	}
}
