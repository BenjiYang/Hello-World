//Àý12£­8
import java.applet.*;
import java.awt.*;
public class MyAppletBase extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("CodeBase->" + getCodeBase(), 5, 15);
		g.drawString("DocumentBase->" + getDocumentBase(), 5, 30);
	}
}
