//从键盘中获取数据,存入文件(字节流-->字符流-->缓冲流)
import java.io.*;

public class KeyboardDemo {
	public static void main(String[] args) throws IOException {
		//读取:键盘是字节输入流,先转换成字符输入流,再包装成缓冲字符输入流
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//写入:先得到文件字符输出流,再包装成缓冲字符输出流
		FileWriter fw = new FileWriter("myfile2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("请输入字符串(按Ctrl+Z结束):");
		String data;
		//逐行读取、写入
		while ((data = br.readLine()) != null) {
			bw.write(data);
			bw.newLine();
		}
		br.close();
		bw.close();
		System.out.println("文件创建完毕!");
	}
}
