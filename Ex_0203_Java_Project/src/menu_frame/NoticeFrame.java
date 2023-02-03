package menu_frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NoticeFrame {
	public NoticeFrame() {
		// frame ����
		JFrame frame = new JFrame("��������");
		frame.setLayout(null);
		frame.setBounds(800, 200, 400, 300);
		
		// �Խ��� ���� ���� �� ���
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		Font ta_font = new Font("�ü�ü", Font.PLAIN, 15);
		ta.setEditable(false);
		ta.setBounds(10, 10, 370, 200);
		ta.setBackground(new Color(255, 255, 255));
		
		// �ϴ� ��ư ����
		Font bt_font = new Font("�ü�ü", Font.BOLD, 20);
		JButton btn1 = new JButton("����");
		btn1.setBounds(10, 220, 175, 30);
		btn1.setFont(bt_font);
		
		JButton btn2 = new JButton("�ݱ�");
		btn2.setBounds(200, 220, 175, 30);
		btn2.setFont(bt_font);
		
		// frame�� ������Ʈ �߰�
		frame.add(ta);
		frame.add(btn1);
		frame.add(btn2);
		
		// btn1(����) ��ư ������
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new NoticeSetFrame();
			}
		});
		
		// btn2(����) ��ư ������
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		// frame �ݱ�
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		// frame ���÷���
		frame.setVisible(true);
		
		
	} // end of constructor
} // end of class
