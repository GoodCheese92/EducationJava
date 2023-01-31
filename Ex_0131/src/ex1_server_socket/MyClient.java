package ex1_server_socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {
		// 클라이언트를 의미하는 Socket객체를 생성한 뒤
		// 접속할 서버의 ip주소와 포트번호를 통해 서버에 접속한다.
		// cmd창에서 ipconfig 입력으로 확인 가능, IPv4가 내 아이피 주소
		try {
			Socket s = new Socket("192.168.3.28", 3000);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main
} // end of class
