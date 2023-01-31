package ex6_windowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;

public class Ex_WindowAdapter {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 300, 400, 300);

		// x버튼 클릭 감지를 위한 Adapter클래스
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.out.println("f1 x버튼 클릭함");
				System.exit(0); // 열려있는 모든 프레임을 종료

			};

		});

		f.setVisible(true);
		
		Frame f2 = new Frame("두 번째");
		f2.setBounds(300, 300, 500, 250);
		
		f2.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.out.println("f2 x버튼 클릭함");
				f2.dispose(); // f2객체만 종료
				// System.exit(0); // 열려있는 모든 프레임을 종료

			};

		});
		
		
		f2.setVisible(true);
		

	} // end of main
} // end of class
