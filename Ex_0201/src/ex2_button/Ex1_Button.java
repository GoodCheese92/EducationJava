package ex2_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {
		Frame f = new Frame("Ex1_Button");
		f.setBounds(600, 150, 1000, 500);

		// �ڵ���ġ ����
		f.setLayout(null);

		// ��ư ���� �� �߰�
		Button btn1 = new Button("��ư 1");
		btn1.setBounds(190, 200, 200, 100);

		Button btn2 = new Button("��ư 2");
		btn2.setBounds(210 + 190, 200, 200, 100);

		Button btn3 = new Button("��ư 3");
		btn3.setBounds(420 + 190, 200, 200, 100);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);

		// ��ư�鿡�� �߰��� ������ ����
		ActionListener click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = e.getActionCommand();
				// System.out.println(str);

				// �ȵ���̵��� ���, ���� id�� �ٸ���.
				// int n = e.getID();
				// System.out.println(n);

				switch (str) {
				case "��ư 1":
					System.out.println("��ư 1���� Ŭ���߾��");
					break;
				case "��ư 2":
					System.out.println("�ȳ��ϼ���");
					break;
				case "��ư 3":
					System.out.println("�ݰ����ϴ�.");
					break;
				} // switch
			}
		};

		// ��ư �� ���� �ϳ��� �������� ���ÿ� ����
		btn1.addActionListener(click);
		btn2.addActionListener(click);
		btn3.addActionListener(click);

		// x��ư ����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // end of main
} // end of class
