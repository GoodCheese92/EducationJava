package ex6_windowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;

public class Ex_WindowAdapter {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 300, 400, 300);

		// x��ư Ŭ�� ������ ���� AdapterŬ����
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.out.println("f1 x��ư Ŭ����");
				System.exit(0); // �����ִ� ��� �������� ����

			};

		});

		f.setVisible(true);
		
		Frame f2 = new Frame("�� ��°");
		f2.setBounds(300, 300, 500, 250);
		
		f2.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.out.println("f2 x��ư Ŭ����");
				f2.dispose(); // f2��ü�� ����
				// System.exit(0); // �����ִ� ��� �������� ����

			};

		});
		
		
		f2.setVisible(true);
		

	} // end of main
} // end of class
