import java.awt.*;
import java.awt.event.*;
public class WinEventTest extends Frame implements WindowListener{
	Frame owner;
	Dialog dig;
	public WinEventTest( ){//���췽��
	setTitle("�����¼�����");
	addWindowListener(this);//ע�������
	this.owner=this;
	setSize(200,200);
	setVisible(true);
	}
public void windowClosing(WindowEvent e){//��д���ڹرշ���
dig=new Dialog(owner,"ȷ���˳�",true);
Panel p=new Panel();
Button yes=new Button("��");
Button no=new Button("��");
p.add(yes);
p.add(no);
yes.addActionListener(new ActionListener(){//�ڲ�����ʽע�ἰ��д�¼�������
public void actionPerformed(ActionEvent e){
owner.dispose();
}
});
no.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
dig.dispose();
}
});
dig.add(new Label("��Ҫ�˳���"));
dig.add(p,"South");
dig.setSize(200,100);
dig.setVisible(true);
}
//ʵ��WindowListener�ĳ��󷽷�
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
