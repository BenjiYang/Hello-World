//实例15.1，利用URL得到网络文件各部分资源
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class UrlFile extends JFrame implements ActionListener {
	private URL url;
	JLabel lblHost, lblIP, lblPort, lblProtocol, lblFile;
	JTextField fileName;
	JButton getBtn;
	Container c;

	public UrlFile() {
		super("利用URL得到网络文件");
		c = getContentPane();
		setGUI();
		setSize(600, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/* 界面元素初始化 */
	private void setGUI() {
		JPanel pNorth = new JPanel(new BorderLayout(10, 10));
		pNorth.add(new Label("URL文件："), BorderLayout.WEST);
		pNorth.add(fileName = new JTextField(25), BorderLayout.CENTER);
		pNorth.add(getBtn = new JButton("提取文件信息"), BorderLayout.EAST);
		getBtn.addActionListener(this);
		c.add(pNorth, BorderLayout.NORTH);

		JPanel pCenter = new JPanel(new BorderLayout());
		JPanel pCenter1 = new JPanel(new GridLayout(5, 1));
		pCenter1.add(new JLabel("主机名：", JLabel.RIGHT));
		pCenter1.add(new JLabel("主机IP地址：", JLabel.RIGHT));
		pCenter1.add(new JLabel("端口：", JLabel.RIGHT));
		pCenter1.add(new JLabel("协议名：", JLabel.RIGHT));
		pCenter1.add(new JLabel("文件名：", JLabel.RIGHT));
		pCenter.add(pCenter1, BorderLayout.WEST);
		JPanel pCenter2 = new JPanel(new GridLayout(5, 1));
		pCenter2.add(lblHost = new JLabel("", JLabel.LEFT));
		pCenter2.add(lblIP = new JLabel("", JLabel.LEFT));
		pCenter2.add(lblPort = new JLabel("", JLabel.LEFT));
		pCenter2.add(lblProtocol = new JLabel("", JLabel.LEFT));
		pCenter2.add(lblFile = new JLabel("", JLabel.LEFT));
		pCenter.add(pCenter2, BorderLayout.CENTER);
		c.add(pCenter, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == getBtn) {
			if (url != null)
				url = null;
			try {
				url = new URL(fileName.getText());//创建URL对象
				getInfo();
				saveFile();
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
	}

//分解URL对象的各资源
	private void getInfo() {
		try {
			lblHost.setText(url.getHost());
			lblProtocol.setText(url.getProtocol());
             //获取url对象的ip对象
			InetAddress host = InetAddress.getByName(url.getHost());
			lblIP.setText(host.getHostAddress());
			Integer port = new Integer(url.getPort());
			lblPort.setText(port.toString());
			lblFile.setText(url.getPath());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

 //保存网络文件
	private void saveFile() {
		try {
　　　　　　//打开与 URL连接的输入流
			BufferedReader inStream = new BufferedReader(new InputStreamReader(url.openStream()));
//创建一个由url文件名所命名的file文件对象
			File file = new File("." + url.getFile());
　　　　　　//创建一个文件输出流
			PrintWriter outputStream = new PrintWriter(new FileWriter(file));
			String s;
　　　　　　//循环地从输入流上读数据到输出流
			while ((s = inStream.readLine()) != null) {
				outputStream.println(s);
			}
			inStream.close();
			outputStream.close();
		} catch (IOException eofEx) {
			System.out.println(eofEx);
		}
	}
	public static void main(String[] args) {
		new UrlFile();
	}
}
