import java.awt.*;
import java.awt.event.*;
public class WinAdapterTest extends Frame {
	Frame owner;
	Dialog dig;
	public WinAdapterTest(){
		setTitle("窗口事件处理");
		this.owner=this;
		setSize(200,200);
		setVisible(true);
WindowListener winHandler=new WindowAdapter(){//内部类
public void windowClosing(WindowEvent e){
dig=new Dialog(owner,"确认退出",true);
Panel p=new Panel();
Button yes=new Button("是");
Button no=new Button("否");
p.add(yes);
p.add(no);

yes.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
owner.dispose();
}
});
no.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
dig.dispose();
}
} );
dig.add(new Label("想要退出吗？"));
dig.add(p,"South");
dig.setSize(200,100);
dig.setVisible(true);
}
};
addWindowListener(winHandler);//注册监听者
}
//主方法
public static void main(String[] args){
		WinAdapterTest obj=new WinAdapterTest();
	}
	
	
}