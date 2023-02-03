package menu_frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StudentUnionFrame {
	public static void main(String[] args) {
		// Frame ����
		JFrame frame = new JFrame("�л�ȸ�� �Ĵ�");
		frame.setLayout(null);
		frame.setBounds(800, 200, 500, 400);

		// ��ư ����--------------------------------------
		// ��ư 1
		Font btn_font = new Font("�ü�ü", Font.BOLD, 15);
		JButton btn1 = new JButton("��������");
		btn1.setFont(btn_font);
		btn1.setBounds(30, 50, 200, 100);

		// ��ư 2
		JButton btn2 = new JButton("������ �޴�\n");
		btn2.setFont(btn_font);
		btn2.setBounds(250, 50, 200, 100);

		// ��ư 3
		JButton btn3 = new JButton("�� ���� �Ĵ�\n�˻��ϱ�");
		btn3.setFont(btn_font);
		btn3.setBounds(30, 200, 200, 100);

		// ��ư 4
		JButton btn4 = new JButton("����\n�̸��ֹ��ϱ�");
		btn4.setFont(btn_font);
		btn4.setBounds(250, 200, 200, 100);
		// --------------------------------------------

		// Frame�� Component �߰��ϱ�
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);

		
		// ��ư �����ϱ� -----------------------------------
		// �������� ��ư ������
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new NoticeFrame();
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
		frame.setVisible(true);

	} // end of main
} // end of class
