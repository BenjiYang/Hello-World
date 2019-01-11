//ʵ��15.5 �û�B�˳���
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class BUser extends JFrame{
  JTextArea mainArea;
  JTextArea sendArea; 
  BUserChat userchat;
  JButton sendBtn;
 void setBUserChat(BUserChat userchat){
	this.userchat=userchat;
} 
  public BUser()  {
  	super("�ͻ�B");	
  	Container contain = getContentPane();
  	contain.setLayout( new BorderLayout(3,3) );
  	mainArea = new JTextArea();
	mainArea.setEditable(false);
  	JScrollPane mainAreaP = new JScrollPane( mainArea );
  	mainAreaP.setBorder(BorderFactory.createTitledBorder("�����¼"));
  	JPanel panel = new JPanel();
  	panel.setLayout( new BorderLayout() );
  	sendArea = new JTextArea(3, 8);
	JScrollPane sendAreaP = new JScrollPane( sendArea );
	userchat=new BUserChat(this);
	userchat.start();
  	sendBtn = new JButton("����"); 	
	sendBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			userchat.sendMsg(sendArea.getText().trim());	
			mainArea.append("[�ͻ�B]:"+sendArea.getText().trim()+"\n");
			sendArea.setText("");			
		}
	});
  	JPanel tmpPanel = new JPanel();   
    	tmpPanel.add( sendBtn );    
  	panel.add( tmpPanel, BorderLayout.EAST  );
  	panel.add(sendAreaP, BorderLayout.CENTER  );  	  	
  	contain.add( mainAreaP, BorderLayout.CENTER );
  	contain.add( panel, BorderLayout.SOUTH );
  	setSize( 500, 300);  	
  	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String[] args) {  	
  	BUser ui = new BUser();
	ui.setVisible( true );	
  }  
}

class BUserChat extends Thread {	
	BUser ui;	
	BUserChat(BUser ui){
		this.ui=ui;
		ui.setBUserChat(this);		
	}
	public void run(){//�������ݰ�
		String s=null;
		DatagramSocket mail_data=null;
		DatagramPacket pack=null;
		byte data[]=new byte[8192];
		try{
			pack=new DatagramPacket(data,data.length);
			mail_data=new DatagramSocket(1234);
		}catch(Exception e){System.out.println(e);}
		while(true){
			if(mail_data==null)
				break;
			else{
			try{
				mail_data.receive(pack);
				String msg=new String(pack.getData(),0,pack.getLength());
				ui.mainArea.append("[�ͻ�A]��"+msg+"\n");	
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
			DatagramPacket data_pack=new DatagramPacket(buffer,buffer.length,add,4321);
			DatagramSocket mail_data=new DatagramSocket();
			mail_data.send(data_pack);
		}catch(Exception e){
			System.out.println("���ݷ���ʧ�ܣ�");
		}
	}
}
