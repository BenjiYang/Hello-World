//实例15.4 服务器端程序
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ServerUI extends JFrame {
	JTextArea mainArea;
	JTextArea sendArea;
	SvrCom server;

	public void setServer(SvrCom server) {
		this.server = server;
	}

	public ServerUI() {
		super("服务器端");
		Container contain = getContentPane();
		contain.setLayout(new BorderLayout());
		mainArea = new JTextArea();
		JScrollPane mainAreaP = new JScrollPane(mainArea);

		JPanel panel = new JPanel(new BorderLayout());
		sendArea = new JTextArea(3, 8);
		JButton sendBtn = new JButton("发送");

		/*"发送"命令按钮事件处理*/
		sendBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				server.sendMsg(sendArea.getText());//把信息发送到客户端
				//把发送信息在服务器端的聊天记录中显示
				mainArea.append("【服务器】" + sendArea.getText() + "\n"); 
				sendArea.setText("");
			}
		});

		JPanel tmpPanel = new JPanel();
		tmpPanel.add(sendBtn);

		panel.add(tmpPanel, BorderLayout.EAST);
		panel.add(sendArea, BorderLayout.CENTER);

		contain.add(mainAreaP, BorderLayout.CENTER);
		contain.add(panel, BorderLayout.SOUTH);
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ServerUI ui = new ServerUI();
		SvrCom server = new SvrCom(ui);
	}
}

/** 通讯类SvrCom负责守候数据到来 */
class SvrCom extends Thread {
	Socket client;
	ServerSocket soc;
	BufferedReader in;
	PrintWriter out;
	ServerUI ui;

	public SvrCom(ServerUI ui) { // 初始化SvrCom类
		this.ui = ui;
		ui.setServer(this);
		try {
			soc = new ServerSocket(2345);
			System.out.println("启动服务器成功，等待端口号：2345");
			client = soc.accept();// 当客户机请求连接时，创建一条链接
			System.out.println("连接成功！来自" + client.toString());
			in = new BufferedReader(new InputStreamReader(client
					.getInputStream()));
			out = new PrintWriter(client.getOutputStream(), true);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		start();
	}

	public void run() {// 用于监听客户端发送来的信息
		String msg = "";
		while (true) {
			try {
				msg = in.readLine();
			} catch (SocketException ex) {
				System.out.println(ex);
				break;
			} catch (Exception ex) {
				System.out.println(ex);
			}
			if (msg != null && msg.trim() != "") {
				System.out.println(">>" + msg);
				//把客户端传来的信息在服务器端的聊天记录显示
				ui.mainArea.append(msg + "\n");
			}
		}
	}

	public void sendMsg(String msg) {// 用于发送信息
		try {
			out.println("【服务器】" + msg);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
