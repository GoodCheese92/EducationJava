package ex4_window_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyListener implements WindowListener {

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("x��ư�� ������");
		System.exit(0);	// �����ִ� ��� �������� �� ���� ����
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("���� ������� ���ƿ�");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ ��ư Ŭ��");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

} // end of class
