package ex5_window_listener;

import java.awt.Frame;

public class ListenerMain {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setBounds(500, 200, 300, 400);

		// �������� ���� x��ư Ŭ������ ���� ������
		frame.addWindowListener(new ClosingListener());

		frame.setVisible(true);

	} // end of main
} // end of class
