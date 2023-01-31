package ex4_window_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		Frame f = new Frame();
		// f.setSize(300, 300);
		// f.setLocation(400, 200);
		f.setBounds(400, 200, 300, 300);	// setSize()와 setLocation()을 동시에 처리, location 먼저 파라미터 대입
		
		// 프레임에게 우 상단 버튼클릭을 감지하는 이벤트 감지자를 부착
		f.addWindowListener(new MyListener());
		
		f.setVisible(true);
		
		
	} // end of main
} // end of class
