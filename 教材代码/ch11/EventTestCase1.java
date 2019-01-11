//利用按钮动作控制面板背景色
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class EventTestCase1
{
	public static void main(String[] args)
	{
		ButtonFrame frame = new ButtonFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	} 
}
//这是定制自己的按钮框架
class ButtonFrame extends JFrame
{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	public ButtonFrame()
	{
		Container con = getContentPane();//得到了内容窗格
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH)/2;
		int y = (height - HEIGHT)/2;
		setLocation(x, y);//设置坐标起点
		setSize(WIDTH, HEIGHT);//设置框架的大小
		Image image = kit.getImage("duke.gif");// duke.gif为图像文件名
		setIconImage(image);//设置框架图标
		setTitle("按钮改变面板的背景色");//设置框架的标题
		setResizable(false);//设置用户不可以改变框架的大小
		ButtonPanel panel = new ButtonPanel();//得到定制的面板
		con.add(panel);//将面板添加到内容窗格中
	}
}
//这是继承了JPanel面板类
class ButtonPanel extends JPanel implements ActionListener
{
	private JButton yellowButton;
	private JButton blueButton;
	private JButton redButton;
	public ButtonPanel()
	{
		//生成三个按钮
		yellowButton = new JButton("Yellow");
		blueButton = new JButton("Blue");
		redButton = new JButton("Red");
		
		//将三个按钮添加到面板中
		add(yellowButton);
		add(blueButton);
		add(redButton);
		//向事件源（按钮）注册动作监听器.-类头定义中实现接口处理事件
		yellowButton.addActionListener(this);
		blueButton.addActionListener(this);
		redButton.addActionListener(this);
	}
	//当产生某个动作时，会自动调用该方法，实现背景色的设定
	public void actionPerformed(ActionEvent event)
	{
		JButton button = (JButton)event.getSource();
		if(button == yellowButton)
			setBackground(Color.yellow);
		else if(button == blueButton)
			setBackground(Color.blue);
		else if(button == redButton)
			setBackground(Color.red);
	}	
}
