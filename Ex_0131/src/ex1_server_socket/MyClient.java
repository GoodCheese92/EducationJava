package ex1_server_socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {
		// Ŭ���̾�Ʈ�� �ǹ��ϴ� Socket��ü�� ������ ��
		// ������ ������ ip�ּҿ� ��Ʈ��ȣ�� ���� ������ �����Ѵ�.
		// cmdâ���� ipconfig �Է����� Ȯ�� ����, IPv4�� �� ������ �ּ�
		try {
			Socket s = new Socket("192.168.3.28", 3000);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main
} // end of class
