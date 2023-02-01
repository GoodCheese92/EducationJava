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

		// 자동배치 끄기
		f.setLayout(null);

		// 버튼 생성 및 추가
		Button btn1 = new Button("버튼 1");
		btn1.setBounds(190, 200, 200, 100);

		Button btn2 = new Button("버튼 2");
		btn2.setBounds(210 + 190, 200, 200, 100);

		Button btn3 = new Button("버튼 3");
		btn3.setBounds(420 + 190, 200, 200, 100);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);

		// 버튼들에게 추가할 감지자 생성
		ActionListener click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = e.getActionCommand();
				// System.out.println(str);

				// 안드로이드의 경우, 각각 id가 다르다.
				// int n = e.getID();
				// System.out.println(n);

				switch (str) {
				case "버튼 1":
					System.out.println("버튼 1번을 클릭했어요");
					break;
				case "버튼 2":
					System.out.println("안녕하세요");
					break;
				case "버튼 3":
					System.out.println("반갑습니다.");
					break;
				} // switch
			}
		};

		// 버튼 세 개가 하나의 감지자을 동시에 참조
		btn1.addActionListener(click);
		btn2.addActionListener(click);
		btn3.addActionListener(click);

		// x버튼 감지
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // end of main
} // end of class
