import java.awt.*;
class ButtonExample extends Frame{
	public static void main(String[] args){
		ButtonExample f=new ButtonExample();
		f.setTitle("Button Example");//��Ʊ���
    	f.setLayout(new FlowLayout());
		Panel p=new Panel();//Panel���ܵ���ʹ��
		p.setBackground(new Color(0,200,200));
		Button b1=new Button("Click");
		Button b2=new Button("Submit");
		p.add(b1);//Panel���Ӱ�ť
		p.add(b2);
		f.add(p,"North");//Panel������Frame�ı���
		f.setSize(200, 200);
		f.setVisible(true);
	}
}