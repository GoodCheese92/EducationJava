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

	// ���� ������ ���� ��ü
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

		send_bt = new JButton("����");
		send_bt.setBounds(320, 410, 60, 50);

		// TextFiled, Button, TextArea�� frame�� �߰�
		add(panel);
		add(area);
		add(input);
		add(send_bt);

		// ���� Ŭ���̾�Ʈ�� ������ ����
		connected();

		// ���� ��ư Ŭ�� �� ������ �޽����� �����ϴ� �޼���
		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendData(); // ������ �޽��� �����ϱ� �޼���

			}
		});

		t = new Thread(this); // this -> ChatClient Ŭ������ �ǹ�
		t.start();

		// ������ ������ ���� �Ұ�
		setResizable(false);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// x��ư�� ������ �����ϱ� ���� �������� ������ ����
				out.println("xx~:X2V");	// ������ xx~:X2V �޽����� ����(���Ƿ� �ƹ��� ���� ���� �� ���� ��)
				
			}
		});

		setVisible(true);
	} // end of constructor

	// ������ �����ϴ� �޼���
	private void connected() {
		try {
			s = new Socket("192.168.3.28", 3500);

			// �������� �Ѿ�� ���� �о���̱� ���� input��Ʈ��
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// ���ڿ��� ������ �����ϱ� ���� ��Ʈ��
			out = new PrintWriter(s.getOutputStream(), true);

		} catch (Exception e) {
			// TODO: handle exception
		}

	} // end of connected()

	// ������ �����͸� �����ϴ� �޼���
	private void sendData() {
		String msg = input.getText();
		out.println(msg);
		input.setText("");

	} // end of sendData()

	@Override
	public void run() {
		// �����κ��� ���޵Ǵ� �޽����� ��ٸ���.
		while (true) {
			try {
				String msg = in.readLine(); // ������ client���� �޽����� ������ ������ ���
				
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
