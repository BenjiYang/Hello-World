import java.awt.*;
import java.awt.event.*;
public class WinAdapterTest extends Frame {
	Frame owner;
	Dialog dig;
	public WinAdapterTest(){
		setTitle("�����¼�����");
		this.owner=this;
		setSize(200,200);
		setVisible(true);
WindowListener winHandler=new WindowAdapter(){//�ڲ���
public void windowClosing(WindowEvent e){
dig=new Dialog(owner,"ȷ���˳�",true);
Panel p=new Panel();
Button yes=new Button("��");
Button no=new Button("��");
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
dig.add(new Label("��Ҫ�˳���"));
dig.add(p,"South");
dig.setSize(200,100);
dig.setVisible(true);
}
};
addWindowListener(winHandler);//ע�������
}
//������
public static void main(String[] args){
		WinAdapterTest obj=new WinAdapterTest();
	}
	
	
}