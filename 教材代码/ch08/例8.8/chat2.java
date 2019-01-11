import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class chat2 {
		public static void main(String[] args) {
			new chatframe2("ChatroomClient");
		}
}

class chatframe2 extends Frame {
		Socket s = null;
		DataInputStream dataIn = null;
		DataOutputStream dataout = null;
		Panel p1, p2;
		Button bs, bl, bx;
		TextArea t1;
		Label l1, l2;
		TextField t2, t3;
		chatframe2(String ss) {
			super(ss);
			p1 = new Panel();
			p2 = new Panel();
			t1 = new TextArea(12, 75);
			l1 = new Label("消息:");
			l2 = new Label("昵称:");
			t2 = new TextField("那你就去吧,别让妖精迷住! ", 36);
			t3 = new TextField("八戒", 6);
			bs = new Button("  发送  ");
			bl = new Button("  连接  ");
			bl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						s = new Socket("localhost", 30000);
						dataIn = new DataInputStream(s.getInputStream());
				dataout = new Dat	aOutputStream(s.getOutputStream());
					} catch (IOException gg) {
				}
				dp gg = new dp();
				Thread yy = new Thread(gg);
				yy.start();
			}
		});
		bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dataout.writeUTF(t3.getText() + ":" + t2.getText());
				} catch (IOException e1) {
				}
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ee) {
				System.exit(0);
			}
		});
		setLayout(new FlowLayout());
		p1.setLayout(new BorderLayout());
		p1.add(t1);
		add(p1);
		p2.setLayout(new FlowLayout());
		p2.add(bl);
		p2.add(l2);
		p2.add(t3);
		p2.add(l1);
		p2.add(t2);
		p2.add(bs);
		add(p2);
		setBounds(100, 100, 600, 280);
		setVisible(true);
	}

	class dp implements Runnable {
		public void run() {
			while (true) {
				try {
					t1.append(dataIn.readUTF() + "\n");
				} catch (IOException gg) {
				}
			}
		}
}
}
