package menu_frame;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import menu_information.SaveUserInfo;

public class CreateUserFrame extends JFrame {
	public CreateUserFrame() {
		// 로그인 창 세팅
		setBounds(800, 200, 490, 330);
		setTitle("회원가입");
		setLayout(null);
		
		// id 세팅 ----------------------------------------
		JLabel id_lb = new JLabel("아이디 : ");
		Font font_login = new Font("궁서체", Font.BOLD, 13);
		id_lb.setFont(font_login);
		id_lb.setBounds(20, 10, 80, 30);
		
		TextField id_tf = new TextField("");
		id_tf.setFont(font_login);
		id_tf.setBounds(100, 10, 270, 30);
		
		JButton id_button = new JButton("중복 확인");
		id_button.setBounds(380, 10, 90, 30);
		// -----------------------------------------------
		
		// pw 세팅 -----------------------------------------
		JLabel pw_lb = new JLabel("비밀번호 : ");
		pw_lb.setFont(font_login);
		pw_lb.setBounds(20, 50, 80, 30);
		
		TextField pw_tf = new TextField("");
		pw_tf.setFont(font_login);
		pw_tf.setBounds(100, 50, 270, 30);
		// -----------------------------------------------
		
		// pw 재확인 세팅 ------------------------------------
		JLabel pwcheck_lb = new JLabel("<html><center>비밀번호 : <br>(재확인)    </center></html>");
		pwcheck_lb.setFont(font_login);
		pwcheck_lb.setBounds(20, 90, 80, 35);
		pwcheck_lb.setVerticalAlignment(JLabel.TOP);
		
		TextField pwcheck_tf = new TextField("");
		pwcheck_tf.setFont(font_login);
		pwcheck_tf.setBounds(100, 90, 270, 30);
		// -----------------------------------------------
		
		// 이름
		JLabel name_lb = new JLabel("이름 : ");
		name_lb.setFont(font_login);
		name_lb.setBounds(20, 130, 80, 30);
		
		TextField name_tf = new TextField("");
		name_tf.setFont(font_login);
		name_tf.setBounds(100, 130, 270, 30);
		
		// 생년월일
		JLabel birthday_lb = new JLabel("<html><center>생년월일 : <br>(6자리)    </center></html>");
		birthday_lb.setFont(font_login);
		birthday_lb.setBounds(20, 170, 80, 30);
		
		TextField birthday_tf = new TextField("");
		birthday_tf.setFont(font_login);
		birthday_tf.setBounds(100, 170, 270, 30);
		
		// 전화번화
		JLabel phoneNum_lb = new JLabel("전화번호 : ");
		phoneNum_lb.setFont(font_login);
		phoneNum_lb.setBounds(20, 210, 80, 30);
		
		TextField phoneNum_tf = new TextField("");
		phoneNum_tf.setFont(font_login);
		phoneNum_tf.setBounds(100, 210, 270, 30);
		
		// 하위 버튼 세팅
		JButton create_btn = new JButton("생성");
		Font font_btn = new Font("hy헤드라인m", Font.BOLD, 15);
		create_btn.setBounds(100, 250, 125, 30);
		create_btn.setFont(font_btn);
		
		JButton close_btn = new JButton("닫기");
		close_btn.setBounds(275, 250, 125, 30);
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
		
		// 생성 버튼 감지
		create_btn.addActionListener(new SaveUserInfo(id_tf, pw_tf, name_tf, birthday_tf, phoneNum_tf, this));
		
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
