package ex1_server_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
	ServerSocket ss;

	public MyServer() {
		try {
			// ������ ������ Ŭ���̾�Ʈ�� ���� ��Ʈ�� ����д�.
			ss = new ServerSocket(3000); // 3000�� port�� ��θ� �����
			System.out.println("���� �غ� �Ϸ�!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end of constructor

	@Override
	public void run() {
		try {
			// ������ Ŭ���̾�Ʈ�� ������ ������ accept()�޼���� �޾Ƽ�
			// s��ü���� �Ѱ��ش�.
			// accept() : �����ڰ� �� ������ �Ʒ��� ������ �������� �ʰ� ����Ѵ�.
			Socket s = ss.accept();

			// �������� IP�� ������ ����
			String ip = s.getInetAddress().getHostAddress();
			System.out.println(ip + "�� ������ ȯ���մϴ�.");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

} // end of class
