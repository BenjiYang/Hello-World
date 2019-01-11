import java.awt.*;
import javax.swing.*;
public class ImageShow
{  
	public static void main(String[] args)
	{  
		ImageFrame frame = new ImageFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}
}
class ImageFrame extends JFrame
{
	public ImageFrame()
	{
		setTitle("ImageShowTest");
		setSize(WIDTH, HEIGHT);

		// ��panel���뵽frame
		ImagePanel panel = new ImagePanel();
		Container contentPane = getContentPane();
		contentPane.add(panel);
	}
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;  	
}
class ImagePanel extends JPanel
{  
	public ImagePanel()
	{  
		// �õ�imageͼ���ļ�
		image = Toolkit.getDefaultToolkit().getImage("back.gif");
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(image, 1);
		try
		{
			tracker.waitForID(1); 
		} 
		catch (InterruptedException exception) 
		{}
   }
   public void paintComponent(Graphics g)
   {  
	   super.paintComponent(g);
	   //�õ�image�ĳߴ�
	   int imageWidth = image.getWidth(this);
	   int imageHeight = image.getHeight(this);
	   //�õ����ڵĳߴ�
	   int FrameWidth = getWidth();
	   int FrameHeight = getHeight();
	   // ���image�����꣬ʹimage��ʾ�ڴ������м�
	   int x = (FrameWidth - imageWidth ) / 2;
	   int y = (FrameHeight - imageHeight ) / 2;
	   //��ʾimage
	   g.drawImage(image, x, y, null);
   }
   private Image image;
}