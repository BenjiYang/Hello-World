import java.awt.*;
class ButtonExample extends Frame{
	public static void main(String[] args){
		ButtonExample f=new ButtonExample();
		f.setTitle("Button Example");//设计标题
    	f.setLayout(new FlowLayout());
		Panel p=new Panel();//Panel不能单独使用
		p.setBackground(new Color(0,200,200));
		Button b1=new Button("Click");
		Button b2=new Button("Submit");
		p.add(b1);//Panel增加按钮
		p.add(b2);
		f.add(p,"North");//Panel布局在Frame的北边
		f.setSize(200, 200);
		f.setVisible(true);
	}
}