package ex2_multi_chat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements Runnable {
	JTextArea area;
	JTextField input;
	JButton send_bt;

	// 서버 접속을 위한 객체
	Socket s;
	BufferedReader in = null;
	PrintWriter out = null;
	Thread t;

	public ChatClient() {
		setBounds(1200, 100, 400, 500);
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 200, 51));

		area = new JTextArea();
		area.setBounds(10, 10, 370, 390);

		input = new JTextField();
		input.setBounds(10, 410, 300, 50);

		send_bt = new JButton("전송");
		send_bt.setBounds(320, 410, 60, 50);

		// TextFiled, Button, TextArea를 frame에 추가
		add(panel);
		add(area);
		add(input);
		add(send_bt);

		// 현재 클라이언트를 서버에 접속
		connected();

		// 전송 버튼 클릭 시 서버에 메시지를 전달하는 메서드
		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendData(); // 서버로 메시지 전달하기 메서드

			}
		});

		t = new Thread(this); // this -> ChatClient 클래스를 의미
		t.start();

		// 프레임 사이즈 변경 불가
		setResizable(false);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// x버튼을 눌러서 종료하기 전에 서버와의 접속을 해제
				out.println("xx~:X2V");	// 서버에 xx~:X2V 메시지를 전송(임의로 아무도 쓰지 않을 것 같은 것)
				
			}
		});

		setVisible(true);
	} // end of constructor

	// 서버와 접속하는 메서드
	private void connected() {
		try {
			s = new Socket("192.168.3.28", 3500);

			// 서버에서 넘어온 값을 읽어들이기 위한 input스트림
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// 문자열을 서버로 전송하기 위한 스트림
			out = new PrintWriter(s.getOutputStream(), true);

		} catch (Exception e) {
			// TODO: handle exception
		}

	} // end of connected()

	// 서버에 데이터를 전달하는 메서드
	private void sendData() {
		String msg = input.getText();
		out.println(msg);
		input.setText("");

	} // end of sendData()

	@Override
	public void run() {
		// 서버로부터 전달되는 메시지를 기다린다.
		while (true) {
			try {
				String msg = in.readLine(); // 누군가 client한테 메시지를 보내기 전까지 대기
				
				if(msg.equals("xx~:X2V")) {
					break;
				}

				if (msg != null) {
					area.append(msg + "\n");
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					out.close();
					in.close();
					s.close();
					System.exit(0);
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}

		} // while

	} // end of run()

} // end of class
