//���ð�ť����������屳��ɫ
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
//���Ƕ����Լ��İ�ť���
class ButtonFrame extends JFrame
{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	public ButtonFrame()
	{
		Container con = getContentPane();//�õ������ݴ���
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH)/2;
		int y = (height - HEIGHT)/2;
		setLocation(x, y);//�����������
		setSize(WIDTH, HEIGHT);//���ÿ�ܵĴ�С
		Image image = kit.getImage("duke.gif");// duke.gifΪͼ���ļ���
		setIconImage(image);//���ÿ��ͼ��
		setTitle("��ť�ı����ı���ɫ");//���ÿ�ܵı���
		setResizable(false);//�����û������Ըı��ܵĴ�С
		ButtonPanel panel = new ButtonPanel();//�õ����Ƶ����
		con.add(panel);//�������ӵ����ݴ�����
	}
}
//���Ǽ̳���JPanel�����
class ButtonPanel extends JPanel implements ActionListener
{
	private JButton yellowButton;
	private JButton blueButton;
	private JButton redButton;
	public ButtonPanel()
	{
		//����������ť
		yellowButton = new JButton("Yellow");
		blueButton = new JButton("Blue");
		redButton = new JButton("Red");
		
		//��������ť��ӵ������
		add(yellowButton);
		add(blueButton);
		add(redButton);
		//���¼�Դ����ť��ע�ᶯ��������.-��ͷ������ʵ�ֽӿڴ����¼�
		yellowButton.addActionListener(this);
		blueButton.addActionListener(this);
		redButton.addActionListener(this);
	}
	//������ĳ������ʱ�����Զ����ø÷�����ʵ�ֱ���ɫ���趨
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
