package ex2_multi_chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer extends Thread {
	ServerSocket ss;

	public ChatServer() {
		try {
			ss = new ServerSocket(3500);
			System.out.println("��������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end of constructor

	@Override
	public void run() {
		while (true) {
			try {
				Socket s = ss.accept(); // Ŭ���̾�Ʈ�� ��ٸ���.
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "�� ����");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // while

	} // end of run()

} // end of class
