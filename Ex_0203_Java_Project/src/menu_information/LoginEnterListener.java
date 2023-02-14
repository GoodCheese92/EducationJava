package menu_information;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import menu_frame.MenuFrame;

public class LoginEnterListener extends KeyAdapter {

	JButton btn;
	JTextField id_tf;
	TextField pw_tf;
	JFrame frame;

	public LoginEnterListener(JFrame frame, JButton btn, JTextField id_tf, TextField pw_tf) {
		this.btn = btn;
		this.id_tf = id_tf;
		this.pw_tf = pw_tf;
	} // end of constructor

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					LoadUserInfo lui = new LoadUserInfo();
					boolean isCheck = true;
					for (int i = 0; i < lui.getUserInfo().length; i++) {
						if (lui.getUserInfo()[i].getId().equals(id_tf.getText())) {
							if (lui.getUserInfo()[i].getPw().equals(pw_tf.getText())) {
								new MenuFrame();
								frame.dispose();
								break;
							}
						}
					} // for

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
		}
	} // end of  keyTyped(KeyEvent e)

} // end of class
