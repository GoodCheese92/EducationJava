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
		// �α��� â ����
		setBounds(800, 200, 490, 330);
		setTitle("ȸ������");
		setLayout(null);

		// id ���� ----------------------------------------
		JLabel id_lb = new JLabel("<html><center>���̵� : <br>(�й�)</center></html>");
		Font font_login = new Font("�ü�ü", Font.BOLD, 13);
		id_lb.setFont(font_login);
		id_lb.setBounds(20, 10, 80, 35);
		id_lb.setHorizontalAlignment(JLabel.CENTER);

		TextField id_tf = new TextField();
		id_tf.setFont(font_login);
		id_tf.setBounds(100, 10, 270, 30);

		JButton id_button = new JButton("�ߺ� Ȯ��");
		id_button.setBounds(380, 10, 90, 30);
		// -----------------------------------------------

		// pw ���� -----------------------------------------
		JLabel pw_lb = new JLabel("<html><center>��й�ȣ : </center></html>");
		pw_lb.setFont(font_login);
		pw_lb.setBounds(20, 50, 80, 30);
		pw_lb.setHorizontalAlignment(JLabel.CENTER);

		TextField pw_tf = new TextField();
		pw_tf.setFont(font_login);
		pw_tf.setBounds(100, 50, 270, 30);
		pw_tf.setEchoChar('*');
		// -----------------------------------------------

		// pw ��Ȯ�� ���� ------------------------------------
		JLabel pwcheck_lb = new JLabel("<html><center>��й�ȣ : <br>(��Ȯ��)</center></html>");
		pwcheck_lb.setFont(font_login);
		pwcheck_lb.setBounds(20, 90, 80, 35);
		pwcheck_lb.setHorizontalAlignment(JLabel.CENTER);
		pwcheck_lb.setVerticalAlignment(JLabel.TOP);

		TextField pwcheck_tf = new TextField();
		pwcheck_tf.setFont(font_login);
		pwcheck_tf.setBounds(100, 90, 270, 30);
		pwcheck_tf.setEchoChar('*');
		// -----------------------------------------------

		// �̸�
		JLabel name_lb = new JLabel("<html><center>�̸� : </center></html>");
		name_lb.setFont(font_login);
		name_lb.setBounds(20, 130, 80, 30);
		name_lb.setHorizontalAlignment(JLabel.CENTER);

		TextField name_tf = new TextField();
		name_tf.setFont(font_login);
		name_tf.setBounds(100, 130, 270, 30);

		// �������
		JLabel birthday_lb = new JLabel("<html><center>������� : <br>ex)920324</center></html>");
		birthday_lb.setFont(font_login);
		birthday_lb.setBounds(20, 170, 80, 30);
		birthday_lb.setHorizontalAlignment(JLabel.CENTER);

		TextField birthday_tf = new TextField();
		birthday_tf.setFont(font_login);
		birthday_tf.setBounds(100, 170, 270, 30);

		// ��ȭ��ȭ
		JLabel phoneNum_lb = new JLabel("<html><center>��ȭ��ȣ : <br>(- ����)</center></html>");
		phoneNum_lb.setFont(font_login);
		phoneNum_lb.setBounds(20, 210, 80, 35);
		phoneNum_lb.setHorizontalAlignment(JLabel.CENTER);

		TextField phoneNum_tf = new TextField();
		phoneNum_tf.setFont(font_login);
		phoneNum_tf.setBounds(100, 210, 270, 30);

		// ���� ��ư ����
		JButton create_btn = new JButton("����");
		Font font_btn = new Font("hy������m", Font.BOLD, 15);
		create_btn.setBounds(90, 250, 125, 30);
		create_btn.setFont(font_btn);

		JButton close_btn = new JButton("�ݱ�");
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

		// ���̵� �ߺ� ��ư ����
		id_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoadUserInfo lui = new LoadUserInfo();
				JFrame check_frame = new JFrame("�ߺ� Ȯ��");
				check_frame.setLayout(new BorderLayout());
				check_frame.setBounds(750, 200, 200, 120);
				JLabel check_lb = new JLabel();
				check_lb.setHorizontalTextPosition(JLabel.CENTER);
				check_lb.setHorizontalAlignment(JLabel.CENTER);
				check_lb.setFont(new Font("hy������m", Font.BOLD, 15));
				check_lb.setText("<html><center>��밡����<br>���̵��Դϴ�.</center></html>");
				for (int i = 0; i < lui.getUserInfo().length; i++) {
					if (lui.getUserInfo()[i].getId().equals(id_tf.getText())) {
						check_lb.setText("<html><center>�ߺ���<br>���̵��Դϴ�.</center></html>");
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

		// ���� ��ư ����1
		create_btn
				.addActionListener(new SaveUserInfo(id_tf, pw_tf, pwcheck_tf, name_tf, birthday_tf, phoneNum_tf, this));

		// �ݱ� ��ư ����
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
