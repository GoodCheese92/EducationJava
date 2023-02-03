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
		// 생성자를 통해 원본 클라이언트의 소켓정보 및 서버정보를 받는다.
		this.s = s;
		this.server = cs;

		try {
			out = new PrintWriter(s.getOutputStream(), true); // true는 자동으로 flush해주는 것을 의미한다.
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
				String msg = in.readLine(); // 외부에서 데이터를 받을 때가지 대기(밑으로 내려가지 않는다.)
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
