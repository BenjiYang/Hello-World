//创建 CheckBoxMenuItem
import java.awt.*;
public class TestCheckBoxMenuItem{
	public static void main(String[] args) {
		Frame f = new Frame("CheckBoxMenuItem Test");
		MenuBar mb = new MenuBar();
		f.setMenuBar(mb);
		Menu m1 = new Menu("File");
		Menu m2 = new Menu("Format");
		Menu m3 = new Menu("Help");
		mb.add(m1);
		mb.add(m2);
		mb.setHelpMenu(m3);
		MenuItem m11 = new MenuItem("中文");
		m2.add(m11);
		CheckboxMenuItem m12 = new  CheckboxMenuItem("二进制");
		m2.add(m12);		
		f.setSize(200,150);
		f.setVisible(true);
	}	
}