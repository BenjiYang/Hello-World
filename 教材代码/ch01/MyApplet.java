import java.applet.Applet;//导入java.applet.Applet类
import java.awt.*;//导入java.awt包中的类,如:Font、Image、Graphics等

public class MyApplet extends Applet {// 继承Applet类
	Image pic;// 声明图像对象

	public void init() {// 初始化方法
		setFont(new Font("宋体", Font.BOLD, 30));// 设置字体
		pic = getImage(getDocumentBase(), "上海世博会.jpg");// 获取图像对象，图像文件应与html文件在同一目录中
	}

	public void paint(Graphics g) {// 绘图方法
		g.drawImage(pic, 0, 0, 500, 340, this);// 按指定坐标位置、大小显示图像
		g.drawString("这是我的第一个Applet程序", 50, 370);// 在指定位置输出文字
	}
}
