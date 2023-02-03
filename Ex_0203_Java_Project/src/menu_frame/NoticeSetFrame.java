package menu_frame;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoticeSetFrame extends JFrame {
	public NoticeSetFrame() {
		super("�������� ����");
		setBounds(800, 200, 400, 200);
		setLayout(null);
		
		// TextField ���� (��������)
		Font tf_font = new Font("�ü�ü", Font.PLAIN, 15);
		TextField tf = new TextField();
		tf.setFont(tf_font);
		tf.setBounds(10, 10, 300, 140);
		
		// button �߰�
		Font btn_font = new Font("�ü�ü", Font.BOLD, 15);
		JButton btn = new JButton("����");
		btn.setFont(btn_font);
		btn.setBounds(320, 10, 50, 140);
		
		// frame�� ������Ʈ �߰�
		add(tf);
		add(btn);
		
		// �ݱ� ��ư ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		// JFrame ���÷���
		setVisible(true);
		
	} // end of construction
} // end of class
