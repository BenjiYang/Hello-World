import java.awt.*;
import java.awt.event.*;
public class WinEventTest extends Frame implements WindowListener{
	Frame owner;
	Dialog dig;
	public WinEventTest( ){//构造方法
	setTitle("窗口事件处理");
	addWindowListener(this);//注册监听者
	this.owner=this;
	setSize(200,200);
	setVisible(true);
	}
public void windowClosing(WindowEvent e){//重写窗口关闭方法
dig=new Dialog(owner,"确认退出",true);
Panel p=new Panel();
Button yes=new Button("是");
Button no=new Button("否");
p.add(yes);
p.add(no);
yes.addActionListener(new ActionListener(){//内部类形式注册及重写事件处理方法
public void actionPerformed(ActionEvent e){
owner.dispose();
}
});
no.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
dig.dispose();
}
});
dig.add(new Label("想要退出吗？"));
dig.add(p,"South");
dig.setSize(200,100);
dig.setVisible(true);
}
//实现WindowListener的抽象方法
public void windowClosed(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
public void windowOpened(WindowEvent e){}

public static void main(String[] args){
WinEventTest obj=new WinEventTest();
}
}
