package ex4_window_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		Frame f = new Frame();
		// f.setSize(300, 300);
		// f.setLocation(400, 200);
		f.setBounds(400, 200, 300, 300);	// setSize()�� setLocation()�� ���ÿ� ó��, location ���� �Ķ���� ����
		
		// �����ӿ��� �� ��� ��ưŬ���� �����ϴ� �̺�Ʈ �����ڸ� ����
		f.addWindowListener(new MyListener());
		
		f.setVisible(true);
		
		
	} // end of main
} // end of class
