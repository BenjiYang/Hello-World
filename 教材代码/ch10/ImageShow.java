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

		// 将panel加入到frame
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
		// 得到image图像文件
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
	   //得到image的尺寸
	   int imageWidth = image.getWidth(this);
	   int imageHeight = image.getHeight(this);
	   //得到窗口的尺寸
	   int FrameWidth = getWidth();
	   int FrameHeight = getHeight();
	   // 算出image的坐标，使image显示在窗口正中间
	   int x = (FrameWidth - imageWidth ) / 2;
	   int y = (FrameHeight - imageHeight ) / 2;
	   //显示image
	   g.drawImage(image, x, y, null);
   }
   private Image image;
}