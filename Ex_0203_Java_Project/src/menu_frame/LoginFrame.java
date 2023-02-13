package menu_frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import menu_information.LoadUserInfo;

public class LoginFrame extends JFrame {
	public static void main(String[] args) {
		new LoginFrame();
	} // end of main

	public LoginFrame() {
		// �α��� â ����
		setBounds(800, 200, 300, 200);
		setTitle("�α��� ����");
		setLayout(null);

		// ID �Է� ����
		Font font_login = new Font("�ü�ü", Font.BOLD, 15);

		JLabel id_label = new JLabel("id : ");
		id_label.setFont(font_login);
		id_label.setBounds(10, 10, 60, 30);

		JTextField login_tf = new JTextField();
		login_tf.setFont(font_login);
		login_tf.setBounds(70, 10, 200, 30);

		// password �Է� ����
		JLabel pw_label = new JLabel("pw : ");
		pw_label.setFont(font_login);
		pw_label.setBounds(10, 50, 60, 30);

		JTextField login_pw = new JTextField();
		login_pw.setFont(font_login);
		login_pw.setBounds(70, 50, 200, 30);

		// ��ư1(Ȯ��) ����
		JButton btn1 = new JButton("�α���");
		btn1.setBounds(15, 100, 120, 40);

		// ��ư2(�ݱ�) ����
		JButton btn2 = new JButton("ȸ������");
		btn2.setBounds(150, 100, 120, 40);

		// ������Ʈ �߰�
		add(id_label);
		add(login_tf);
		add(pw_label);
		add(login_pw);
		add(btn1);
		add(btn2);

		// ��ư1(�α���) ����
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoadUserInfo lui = new LoadUserInfo();
				for(int i=0; i<lui.getUserInfo().length; i++) {
					if(lui.getUserInfo()[i].getId().equals(login_tf.getText())) {
						if(lui.getUserInfo()[i].getPw() == Integer.parseInt(login_pw.getText())){
							new MenuFrame();
							dispose();
							break;
						}
					}
				} // for
				
			}
		});

		// ��ư2(ȸ������) ����
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new CreateUserFrame();
			}
		});

		// frame �ݱ� ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setResizable(false);
		setVisible(true);

		
		
	} // end of constructor

} // end of class
