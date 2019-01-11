//导入程序中需用到的各个包外类
import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;
public class ImportDemo extends Applet{
	Date date=new Date();
	public void paint(Graphics g){
    		g.drawString("现在时间是:"+date.toString(),20,80);
	}
}
