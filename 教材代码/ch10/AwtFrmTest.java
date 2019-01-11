import java.awt.*;
public class AwtFrmTest {
	public static void main(String[] args) throws Exception {
		Frame f = new Frame("ÈÝÆ÷×é¼þÑÕÉ«");
		f.setSize(300, 150);
		f.setVisible(true);
		for (int i = 0; i <= 255; i++) {
			f.setBackground(new Color(i, 0, 0));// ºÚ->ºì
			Thread.sleep(10);
		}
		for (int i = 0; i <= 255; i++) {
			f.setBackground(new Color(255, i, 0));// ºì->»Æ
			Thread.sleep(10);
		}
	}
}
