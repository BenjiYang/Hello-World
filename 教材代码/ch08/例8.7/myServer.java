import java.net.*;
import java.io.*;
import java.util.*;
public class myServer {
	public static ArrayList<Socket> socketList = new ArrayList<Socket>();

		public static void main(String[] args) throws IOException {
			ServerSocket ss = new ServerSocket(30000);
			while (true) {
				Socket s = ss.accept();
				socketList.add(s);
				new Thread(new ServerThread(s)).start();
			}
		}
}

class ServerThread implements Runnable {
		Socket s = null;
		DataInputStream dataIn = null;
		public ServerThread(Socket s) throws IOException {
		this.s = s;
		dataIn = new DataInputStream(s.getInputStream());
	}

	public void run() {
		try {
			String content = null;
			while ((content = readFromClient()) != null) {
				for (Socket s : myServer.socketList) {
					DataOutputStream ps = new DataOutputStream(s
							.getOutputStream());
					ps.writeUTF(content);
					ps.flush();
				}
			}
		} catch (IOException e) {

		}
	}

		private String readFromClient() {
			try {
				return dataIn.readUTF();
			} catch (IOException e) {
				myServer.socketList.remove(s);
			}
			return null;
		}
}
