package ex2_multi_chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread {
	ServerSocket ss;

	// ����� Ŭ���̾�Ʈ�� ����� ArrayList
	ArrayList<CopyClient> list;

	public ChatServer() {
		try {
			list = new ArrayList<CopyClient>();

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

				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // while

	} // end of run()

	// �޽��� ���� �޼���
	public void sendMessage(String msg) {
		// �����ڵ��� CopyClient���·� ArrayList�� ����Ǿ� �ִ� ����
		for (CopyClient cc : list) {
			cc.out.println(msg); // ������ �������ִ� ��� �����ڵ鿡�� �޽����� ����
		} // for

	} // end of sendMessage()

	// ����� ����ڸ� ArrayList���� ����
	public void removeClient(CopyClient cc) {
		list.remove(cc); // ���� ����� ����ڸ� ArrayList���� ����

		// �����ִ� �������鿡�� ����޽����� ����
		sendMessage("***" + cc.ip + "���� �����Ͽ����ϴ�.***");

	} // end of removeClient()

} // end of class
