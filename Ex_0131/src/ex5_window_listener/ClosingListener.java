package ex5_window_listener;

import java.awt.event.WindowEvent;

public class ClosingListener extends ListenerClass {
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("x��ư Ŭ�� ��");
		System.exit(0);
	}
	
	
} // end of class
