//FileWriter的应用
import java.io.*;

class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("myfile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("C++程序设计");
		bw.newLine();
		bw.write("Java程序设计");
		bw.newLine();
		bw.close();
		System.out.println("文件内容写入完毕");
	}
}