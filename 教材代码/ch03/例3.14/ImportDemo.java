//������������õ��ĸ���������
import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;
public class ImportDemo extends Applet{
	Date date=new Date();
	public void paint(Graphics g){
    		g.drawString("����ʱ����:"+date.toString(),20,80);
	}
}
