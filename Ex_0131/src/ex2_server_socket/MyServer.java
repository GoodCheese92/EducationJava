package ex2_server_socket;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
	ServerSocket ss;

	public MyServer() {
		try {
			ss = new ServerSocket(3001);
			System.out.println("���� �غ� �Ϸ�");
		} catch (Exception e) {
			// TODO: handle exception
		}
	} // end of constructor

	@Override
	public void run() {
		
		
		while (true) {
			BufferedReader reader = null;
			InputStreamReader isr = null;
			
			try {
				Socket s = ss.accept();
				
				// Ŭ���̾�Ʈ�� ���Ӱ� ���ÿ� ���ڿ��� ������ ������
				// �� ���� Reader�� ���ؼ� �޴´�.
				isr = new InputStreamReader(s.getInputStream());
				reader = new BufferedReader(isr);
				
				String msg = reader.readLine();
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println(ip + " : " + msg);
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		} // end of while

	}

} // end of class
