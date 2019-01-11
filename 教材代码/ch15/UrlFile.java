//ʵ��15.1������URL�õ������ļ���������Դ
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
		super("����URL�õ������ļ�");
		c = getContentPane();
		setGUI();
		setSize(600, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/* ����Ԫ�س�ʼ�� */
	private void setGUI() {
		JPanel pNorth = new JPanel(new BorderLayout(10, 10));
		pNorth.add(new Label("URL�ļ���"), BorderLayout.WEST);
		pNorth.add(fileName = new JTextField(25), BorderLayout.CENTER);
		pNorth.add(getBtn = new JButton("��ȡ�ļ���Ϣ"), BorderLayout.EAST);
		getBtn.addActionListener(this);
		c.add(pNorth, BorderLayout.NORTH);

		JPanel pCenter = new JPanel(new BorderLayout());
		JPanel pCenter1 = new JPanel(new GridLayout(5, 1));
		pCenter1.add(new JLabel("��������", JLabel.RIGHT));
		pCenter1.add(new JLabel("����IP��ַ��", JLabel.RIGHT));
		pCenter1.add(new JLabel("�˿ڣ�", JLabel.RIGHT));
		pCenter1.add(new JLabel("Э������", JLabel.RIGHT));
		pCenter1.add(new JLabel("�ļ�����", JLabel.RIGHT));
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
				url = new URL(fileName.getText());//����URL����
				getInfo();
				saveFile();
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
	}

//�ֽ�URL����ĸ���Դ
	private void getInfo() {
		try {
			lblHost.setText(url.getHost());
			lblProtocol.setText(url.getProtocol());
             //��ȡurl�����ip����
			InetAddress host = InetAddress.getByName(url.getHost());
			lblIP.setText(host.getHostAddress());
			Integer port = new Integer(url.getPort());
			lblPort.setText(port.toString());
			lblFile.setText(url.getPath());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

 //���������ļ�
	private void saveFile() {
		try {
������������//���� URL���ӵ�������
			BufferedReader inStream = new BufferedReader(new InputStreamReader(url.openStream()));
//����һ����url�ļ�����������file�ļ�����
			File file = new File("." + url.getFile());
������������//����һ���ļ������
			PrintWriter outputStream = new PrintWriter(new FileWriter(file));
			String s;
������������//ѭ���ش��������϶����ݵ������
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
