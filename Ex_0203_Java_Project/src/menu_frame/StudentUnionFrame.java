package menu_frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class StudentUnionFrame {
	public StudentUnionFrame(String restaurantName) {
		// Frame ����
		JFrame frame = new JFrame(restaurantName + " �Ĵ�");
		frame.setLayout(null);
		frame.setBounds(800, 200, 500, 400);

		// ��ư ����--------------------------------------
		// ��ư 1
		Font btn_font = new Font("�ü�ü", Font.BOLD, 20);
		JButton btn1 = new JButton("��������");
		btn1.setFont(btn_font);
		btn1.setBounds(30, 50, 200, 100);
//		btn1.setHorizontalAlignment(JButton.CENTER);
//		btn1.setVerticalAlignment(SwingConstants.CENTER);

		// ��ư 2
		JButton btn2 = new JButton("<html><center>������ �޴�</center></html>");
		btn2.setFont(btn_font);
		btn2.setBounds(250, 50, 200, 100);
//		btn2.setHorizontalAlignment(JButton.CENTER);
//		btn2.setVerticalAlignment(SwingConstants.CENTER);
		
		// ��ư 3
		JButton btn3 = new JButton("<html><center>�̹� ��<br>�Ĵ� ����</center><html>");
		btn3.setFont(btn_font);
		btn3.setBounds(30, 200, 200, 100);
//		btn3.setHorizontalAlignment(JButton.CENTER);
//		btn3.setVerticalAlignment(SwingConstants.CENTER);

		// ��ư 4
		JButton btn4 = new JButton("<html><center>����<br>�̸� �ֹ��ϱ�</center></html>");
		btn4.setFont(btn_font);
		btn4.setBounds(250, 200, 200, 100);
//		btn4.setHorizontalAlignment(SwingConstants.CENTER);
//		btn4.setVerticalAlignment(SwingConstants.CENTER);
		
		// ��ư 5 (���� ��ư)
		JButton btn5 = new JButton("�ڷΰ���");
		btn5.setFont(new Font("�ü�ü", Font.BOLD, 15));
		btn5.setBounds(186, 315, 100, 30);
//		btn5.setHorizontalAlignment(JButton.CENTER);
//		btn5.setVerticalAlignment(SwingConstants.CENTER);
		// --------------------------------------------

		// Frame�� Component �߰��ϱ�
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);

		// ��ư �����ϱ� -----------------------------------
		// �������� ��ư ������
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new NoticeFrame(restaurantName);
			}
		});
		
		// ������ �Ĵ� ��ư ����
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TodayMenuFrame(restaurantName + " �޴�/2�� 2���� �޴�.txt");
			}
		});
		
		// �� ���� �Ĵ� ��ư ����
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ThisWeekmenuFrame(restaurantName + " �޴�/2�� 2���� �޴�.txt");
			}
		});
		
		// �ڷΰ��� ��ư ����
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.repaint();
				new MenuFrame();
			}
		});
		
		// --------------------------------------------

		// Frame �ݱ� ��ư
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		// Frame ���÷���
		frame.setResizable(false);
		frame.setVisible(true);

	} // end of constructor

} // end of class
