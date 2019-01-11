//FileReader的应用
import java.io.*;

class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("myfile.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		// 用循环逐行读取字符串，直至遇到null为止
		while ((s = br.readLine()) != null)
			System.out.println(s);
		br.close();
	}
}