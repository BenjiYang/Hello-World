//例12－9
import java.awt.*;
import java.applet.*;
public class ShowStatusTest extends Applet {
	Image image;
	public void start() {//指定加载的Image 对象位置  
		image = getImage(getCodeBase(), "playground.gif");
	}
	public void paint(Graphics g) {//请求参数字符串显示在状态栏 中
		showStatus("Success in loading image...");
		g.drawImage(image, 0, 0, this); 	//绘制指定加载图像。
	}
}
