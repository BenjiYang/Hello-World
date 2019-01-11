//创建 MenuBar
import java.awt.*;
public class TestMenuBar{
        public static void main(String[] args) {
	Frame f = new Frame("MenuBar");
	MenuBar mb = new MenuBar();
	f.setMenuBar(mb);
	f.setSize(200,150);
	f.setVisible(true);
        }
}

//创建 Menu
import java.awt.*;
public class TestMenu{
        public static void main(String[] args) {
	Frame f = new Frame("Menu");
	MenuBar mb = new MenuBar();
	f.setMenuBar(mb);
	Menu m1 = new Menu("File");
	Menu m2 = new Menu("Edit");
	Menu m3 = new Menu("Help");
	mb.add(m1);
	mb.add(m2);
	mb.setHelpMenu(m3);			
	f.setSize(150,120);
	f.setVisible(true);
        }
}

//创建 MenuItem
import java.awt.*;              
	public class TestMenuItem{  
	       public static void main(String[] args) {
		Frame f = new Frame("Menu");
		MenuBar mb = new MenuBar();
		f.setMenuBar(mb);
		Menu m1 = new Menu("File");
		Menu m2 = new Menu("Edit");
		Menu m3 = new Menu("Help");
		mb.add(m1);           mb.add(m2);
		mb.setHelpMenu(m3);		
		MenuItem m11 = new MenuItem("New");
		MenuItem m12 = new MenuItem("Save");
		MenuItem m13 = new MenuItem("Load");
		MenuItem m14 = new MenuItem("Quit");
		m1.add(m11);    m1.add(m12);
		m1.add(m13);    m1.addSeparator();
		m1.add(m14);					f.setSize(150,170);
		f.setVisible(true);
	        }
	}
//创建 CheckBoxMenuItem
import java.awt.*;
public class TestCheckBoxMenuItem{
	public static void main(String[] args) {
		Frame f = new Frame("Menu");
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
		f.setSize(150,170);
		f.setVisible(true);
	}	
}
