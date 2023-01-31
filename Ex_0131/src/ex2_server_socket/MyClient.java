package ex2_server_socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String msg = sc.nextLine();
		
		if(msg != null && msg.trim().length() > 0) {
			Socket s = null;
			PrintWriter out = null;
			
			try {
				// 서버의 ip와 포트를 통해 클라이언트가 접근을 시도
				s = new Socket("192.168.3.101", 3001);
				
				// 문자열을 서버로 전송하기 위한 스크림을 준비
				out = new PrintWriter(s.getOutputStream());
				
				// out을 통해 서버로 문장을 전송
				out.write(msg);
				out.flush();
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					s.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}


	} // end of main
} // end of class
