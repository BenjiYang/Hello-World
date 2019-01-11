//ʵ��15.5 �û�A�˳���
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class AUser extends JFrame{
  JTextArea mainArea;
  JTextArea sendArea;  
  JButton  sendBtn;
  AUserChat userchat;
 void setAUserChat(AUserChat userchat){
	this.userchat=userchat;
}
  public AUser()  {
  	super("�ͻ�A");
	Container contain = getContentPane();
  	contain.setLayout( new BorderLayout() );	  
  	mainArea = new JTextArea();
	mainArea.setEditable(false);
  	JScrollPane mainAreaP = new JScrollPane( mainArea );//Ϊ�ı�����ӹ�����
  	mainAreaP.setBorder(BorderFactory.createTitledBorder("�����¼"));
  	JPanel panel = new JPanel();
  	panel.setLayout( new BorderLayout());
  	sendArea = new JTextArea(3, 8);
	JScrollPane sendAreaP = new JScrollPane( sendArea );
	userchat=new AUserChat(this);
	userchat.start();

  	sendBtn = new JButton("����");
  	sendBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			userchat.sendMsg(sendArea.getText().trim());	
			mainArea.append("[�ͻ�A]:"+sendArea.getText().trim()+"\n");
			sendArea.setText("");		
		}
	});
  	panel.add( sendBtn, BorderLayout.EAST  );
  	panel.add( sendAreaP, BorderLayout.CENTER  );	
  	contain.add( mainAreaP, BorderLayout.CENTER );
  	contain.add( panel, BorderLayout.SOUTH );
  	setSize( 500, 300);
  	setVisible( true );
  	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  } 
  
  public static void main(String[] args) {  	
  	AUser ui = new AUser();
  }
}

class AUserChat extends Thread {	
	AUser ui;
	AUserChat(AUser ui){
		this.ui=ui;
		ui.setAUserChat(this);		
	}
	public void run(){//�������ݰ�
		String s=null;
		DatagramSocket mail_data=null;
		DatagramPacket pack=null;
		byte data[]=new byte[8192];
		try{
			pack=new DatagramPacket(data,data.length);
			mail_data=new DatagramSocket(4321);
		}catch(Exception e){System.out.println(e);}
		while(true){
			if(mail_data==null)
				break;
			else{
			try{
				mail_data.receive(pack);
				String msg=new String(pack.getData(),0,pack.getLength());
				ui.mainArea.append("[�ͻ�B]��"+msg+"\n");	
			}catch(IOException e1){
				System.out.println("���ݽ��չ���");
				break;
			}
		  }
		}
	}
	public void sendMsg(String s){	//�������ݰ�		
		byte buffer[]=s.getBytes();
		try{
			InetAddress add=InetAddress.getByName("localhost");
			DatagramPacket data_pack=new DatagramPacket(buffer,buffer.length,add,1234);
			DatagramSocket mail_data=new DatagramSocket();
			mail_data.send(data_pack);
		}catch(Exception e){
			System.out.println("���ݷ���ʧ�ܣ�");
	}
  }
}
