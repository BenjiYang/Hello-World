import java.applet.*;
import java.awt.*;
class ExampleApp extends Applet{	
	public void paint(Graphics g){		
		g.setColor(Color.red);
		g.fillOval(30,30,60,60);
	}
}
public class GraphicsExample extends Frame {
    public GraphicsExample() {
        setTitle("����ͼ��");//���ô���ı���
        setSize(200, 150);//���ô���Ĵ�С
        ExampleApp panel = new ExampleApp();
        add(panel);
    }
    public static void main(String[] args) {
        GraphicsExample frame = new GraphicsExample();
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

