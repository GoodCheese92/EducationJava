package menu_frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextField;
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
import menu_information.LoginEnterListener;

public class LoginFrame extends JFrame {
	public static void main(String[] args) {
		new LoginFrame();
	} // end of main

	public LoginFrame() {
		// 로그인 창 세팅
		setBounds(750, 150, 300, 200);
		setTitle("로그인 정보");
		setLayout(null);

		// ID 입력 세팅
		Font font_login = new Font("궁서체", Font.BOLD, 15);

		JLabel id_label = new JLabel("id : ");
		id_label.setFont(font_login);
		id_label.setBounds(10, 10, 60, 30);

		JTextField login_tf = new JTextField();
		login_tf.setFont(font_login);
		login_tf.setBounds(70, 10, 200, 30);

		// password 입력 세팅
		JLabel pw_label = new JLabel("pw : ");
		pw_label.setFont(font_login);
		pw_label.setBounds(10, 50, 60, 30);

		TextField login_pw = new TextField();
		login_pw.setFont(font_login);
		login_pw.setBounds(70, 50, 200, 30);
		login_pw.setEchoChar('*');

		// 버튼1(확인) 세팅
		JButton btn1 = new JButton("로그인");
		btn1.setBounds(15, 100, 120, 40);

		// 버튼2(닫기) 세팅
		JButton btn2 = new JButton("회원가입");
		btn2.setBounds(150, 100, 120, 40);

		// 컴포넌트 추가
		add(id_label);
		add(login_tf);
		add(pw_label);
		add(login_pw);
		add(btn1);
		add(btn2);

		// 버튼1(로그인) 감지
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoadUserInfo lui = new LoadUserInfo();
				boolean isCheck = true;
				for (int i = 0; i < lui.getUserInfo().length; i++) {
					if (lui.getUserInfo()[i].getId().equals(login_tf.getText())) {
						if (lui.getUserInfo()[i].getPw().equals(login_pw.getText())) {
							new MenuFrame();
							dispose();
							isCheck = false;
							break;
						}
					}
				} // for

				// 로그인 실패 시 정보 알려줌
				if (isCheck) {
					JFrame frame = new JFrame();
					frame.setLayout(new BorderLayout());
					frame.setBounds(750, 200, 200, 120);

					JLabel lb = new JLabel("<html><center>아이디 또는 비밀번호가<br>일치하지 않습니다.</center></html>");
					lb.setHorizontalTextPosition(JLabel.CENTER);
					lb.setHorizontalAlignment(JLabel.CENTER);
					lb.setFont(new Font("hy헤드라인m", Font.BOLD, 15));

					frame.add(lb, BorderLayout.CENTER);
					frame.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
							frame.dispose();
						}
					});
					frame.setResizable(false);
					frame.setVisible(true);
				}
			}
		});

		// 키보드 엔터 입력 시 감지
//		LoginEnterListener lel = new LoginEnterListener(this, btn1, login_tf, login_pw);
//		login_tf.addKeyListener(lel);
//		login_pw.addKeyListener(lel);

		// 버튼2(회원가입) 감지
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new CreateUserFrame();
			}
		});

		// frame 닫기 감지
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
