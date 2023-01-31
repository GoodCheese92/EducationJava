package ex5_window_listener;

import java.awt.Frame;

public class ListenerMain {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setBounds(500, 200, 300, 400);

		// 프레임의 우상단 x버튼 클릭만을 위한 감지자
		frame.addWindowListener(new ClosingListener());

		frame.setVisible(true);

	} // end of main
} // end of class
