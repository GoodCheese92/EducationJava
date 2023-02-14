package menu_frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import menu_information.LoadUserInfo;
import menu_information.SaveUserInfo;

public class CreateUserFrame extends JFrame {
	public CreateUserFrame() {
		// 로그인 창 세팅
		setBounds(800, 200, 490, 330);
		setTitle("회원가입");
		setLayout(null);

		// id 세팅 ----------------------------------------
		JLabel id_lb = new JLabel("<html><center>아이디 : <br>(학번)</center></html>");
		Font font_login = new Font("궁서체", Font.BOLD, 13);
		id_lb.setFont(font_login);
		id_lb.setBounds(20, 10, 80, 35);
		id_lb.setHorizontalAlignment(JLabel.CENTER);

		TextField id_tf = new TextField();
		id_tf.setFont(font_login);
		id_tf.setBounds(100, 10, 270, 30);

		JButton id_button = new JButton("중복 확인");
		id_button.setBounds(380, 10, 90, 30);
		// -----------------------------------------------

		// pw 세팅 -----------------------------------------
		JLabel pw_lb = new JLabel("<html><center>비밀번호 : </center></html>");
		pw_lb.setFont(font_login);
		pw_lb.setBounds(20, 50, 80, 30);
		pw_lb.setHorizontalAlignment(JLabel.CENTER);

		TextField pw_tf = new TextField();
		pw_tf.setFont(font_login);
		pw_tf.setBounds(100, 50, 270, 30);
		pw_tf.setEchoChar('*');
		// -----------------------------------------------

		// pw 재확인 세팅 ------------------------------------
		JLabel pwcheck_lb = new JLabel("<html><center>비밀번호 : <br>(재확인)</center></html>");
		pwcheck_lb.setFont(font_login);
		pwcheck_lb.setBounds(20, 90, 80, 35);
		pwcheck_lb.setHorizontalAlignment(JLabel.CENTER);
		pwcheck_lb.setVerticalAlignment(JLabel.TOP);

		TextField pwcheck_tf = new TextField();
		pwcheck_tf.setFont(font_login);
		pwcheck_tf.setBounds(100, 90, 270, 30);
		pwcheck_tf.setEchoChar('*');
		// -----------------------------------------------

		// 이름
		JLabel name_lb = new JLabel("<html><center>이름 : </center></html>");
		name_lb.setFont(font_login);
		name_lb.setBounds(20, 130, 80, 30);
		name_lb.setHorizontalAlignment(JLabel.CENTER);

		TextField name_tf = new TextField();
		name_tf.setFont(font_login);
		name_tf.setBounds(100, 130, 270, 30);

		// 생년월일
		JLabel birthday_lb = new JLabel("<html><center>생년월일 : <br>ex)920324</center></html>");
		birthday_lb.setFont(font_login);
		birthday_lb.setBounds(20, 170, 80, 30);
		birthday_lb.setHorizontalAlignment(JLabel.CENTER);

		TextField birthday_tf = new TextField();
		birthday_tf.setFont(font_login);
		birthday_tf.setBounds(100, 170, 270, 30);

		// 전화번화
		JLabel phoneNum_lb = new JLabel("<html><center>전화번호 : <br>(- 빼고)</center></html>");
		phoneNum_lb.setFont(font_login);
		phoneNum_lb.setBounds(20, 210, 80, 35);
		phoneNum_lb.setHorizontalAlignment(JLabel.CENTER);

		TextField phoneNum_tf = new TextField();
		phoneNum_tf.setFont(font_login);
		phoneNum_tf.setBounds(100, 210, 270, 30);

		// 하위 버튼 세팅
		JButton create_btn = new JButton("생성");
		Font font_btn = new Font("hy헤드라인m", Font.BOLD, 15);
		create_btn.setBounds(90, 250, 125, 30);
		create_btn.setFont(font_btn);

		JButton close_btn = new JButton("닫기");
		close_btn.setBounds(260, 250, 125, 30);
		close_btn.setFont(font_btn);

		add(id_lb);
		add(id_tf);
		add(id_button);
		add(pw_lb);
		add(pw_tf);
		add(pwcheck_lb);
		add(pwcheck_tf);
		add(name_lb);
		add(name_tf);
		add(birthday_lb);
		add(birthday_tf);
		add(phoneNum_lb);
		add(phoneNum_tf);
		add(create_btn);
		add(close_btn);

		// 아이디 중복 버튼 감지
		id_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoadUserInfo lui = new LoadUserInfo();
				JFrame check_frame = new JFrame("중복 확인");
				check_frame.setLayout(new BorderLayout());
				check_frame.setBounds(750, 200, 200, 120);
				JLabel check_lb = new JLabel();
				check_lb.setHorizontalTextPosition(JLabel.CENTER);
				check_lb.setHorizontalAlignment(JLabel.CENTER);
				check_lb.setFont(new Font("hy헤드라인m", Font.BOLD, 15));
				check_lb.setText("<html><center>사용가능한<br>아이디입니다.</center></html>");
				for (int i = 0; i < lui.getUserInfo().length; i++) {
					if (lui.getUserInfo()[i].getId().equals(id_tf.getText())) {
						check_lb.setText("<html><center>중복된<br>아이디입니다.</center></html>");
						break;
					}
				} // for
				check_frame.add(check_lb, BorderLayout.CENTER);

				check_frame.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						check_frame.dispose();
					}
				});
				check_frame.setVisible(true);
				check_frame.setResizable(false);
			}
		});

		// 생성 버튼 감지1
		create_btn
				.addActionListener(new SaveUserInfo(id_tf, pw_tf, pwcheck_tf, name_tf, birthday_tf, phoneNum_tf, this));

		// 닫기 버튼 감지
		close_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		setResizable(false);
		setVisible(true);
	} // end of constructor
} // end of class
