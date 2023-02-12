package menu_frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuFrame {
	public MenuFrame() {
		// Frame ����
				JFrame frame = new JFrame("�� ����~~~!!");
//				JPanel panel = new JPanel();
//				frame.setContentPane(panel);
//				panel.setBackground(new Color(0, 200, 51));
				frame.setLayout(null);
				frame.setBounds(800, 200, 500, 400);

				// ��ư ����-------------------------------------
				// ��ư 1
				Font btn_font = new Font("�ü�ü", Font.BOLD, 20);
				JButton btn1 = new JButton("�л�ȸ�� �Ĵ�");
				btn1.setFont(btn_font);
				btn1.setBounds(30, 50, 200, 100);

				// ��ư 2
				JButton btn2 = new JButton("�ڿ����а� �Ĵ�");
				btn2.setFont(btn_font);
				btn2.setBounds(250, 50, 200, 100);

				// ��ư 3
				JButton btn3 = new JButton("���� �Ĵ�");
				btn3.setFont(btn_font);
				btn3.setBounds(30, 200, 200, 100);

				// ��ư 4
				JButton btn4 = new JButton("ī��");
				btn4.setFont(btn_font);
				btn4.setBounds(250, 200, 200, 100);
				
				// -------------------------------------------

				// panel�� �߰��ϱ�
//				panel.add(btn1);

				// frame�� �߰��ϱ�
				frame.add(btn1);
				frame.add(btn2);
				frame.add(btn3);
				frame.add(btn4);
				
				
				// �л�ȸ�� �Ĵ� ��ư ����
				btn1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new StudentUnionFrame("�л�ȸ��");
					}
				});
				
				// �ڿ����а� �Ĵ� ��ư ����
				btn2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new StudentUnionFrame("�ڿ����а�");
					}
				});
				
				// ���� �Ĵ� ��ư ����
				btn3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new StudentUnionFrame("����");
					}
				});
				
				// ī�� ��ư ����
				btn4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new CafeMenuFrame();
					}
				});
				
				// frame �ݱ� ��ư ����
				frame.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
				
				frame.setResizable(false);
				frame.setVisible(true);
	} // end of constructor
} // end of class
