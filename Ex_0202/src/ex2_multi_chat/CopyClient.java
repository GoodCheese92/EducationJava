package ex2_multi_chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;

	public CopyClient(Socket s, ChatServer cs) {
		// �����ڸ� ���� ���� Ŭ���̾�Ʈ�� �������� �� ���������� �޴´�.
		this.s = s;
		this.server = cs;

		try {
			out = new PrintWriter(s.getOutputStream(), true); // true�� �ڵ����� flush���ִ� ���� �ǹ��Ѵ�.
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			ip = s.getInetAddress().getHostAddress();

		} catch (Exception e) {
			// TODO: handle exception
		}

	} // end of constructor

	@Override
	public void run() {
		try {
			while (true) {
				String msg = in.readLine(); // �ܺο��� �����͸� ���� ������ ���(������ �������� �ʴ´�.)
				if (msg.equals("xx~:X2V")) {
					out.println("xx~:X2V");
					
					server.removeClient(this);
					
					break;
				}
				
				server.sendMessage(ip + " : " + msg);

			} // while

		} catch (Exception e) {
			// TODO: handle exception
		}

	} // end of run()

} // end of class
