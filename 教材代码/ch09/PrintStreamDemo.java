//PrintStream的应用
import java.io.*;
import java.awt.*;

public class PrintStreamDemo {
	public static void main(String args[]) {
		try {
			PrintStream ps = new PrintStream("test.txt");
			Button bt = new Button("按钮");// 创建一个按钮对象
			ps.println(123);//输出整数
			ps.println(3.1415926);//输出double型数据
			ps.println("123" + 456);//输出字符串
			ps.println(123 == 123.0);//输出boolean型数据
			ps.println(bt); // 打印对象时，调用对象的toString()方法
			ps.close();
			System.out.println("数据写入完毕!");
		} catch (Exception e) {
		}
	}
}
