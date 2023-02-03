package menu_frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StudentUnionFrame {
	public static void main(String[] args) {
		// Frame 세팅
		JFrame frame = new JFrame("학생회관 식당");
		frame.setLayout(null);
		frame.setBounds(800, 200, 500, 400);

		// 버튼 세팅--------------------------------------
		// 버튼 1
		Font btn_font = new Font("궁서체", Font.BOLD, 15);
		JButton btn1 = new JButton("공지사항");
		btn1.setFont(btn_font);
		btn1.setBounds(30, 50, 200, 100);

		// 버튼 2
		JButton btn2 = new JButton("오늘의 메뉴\n");
		btn2.setFont(btn_font);
		btn2.setBounds(250, 50, 200, 100);

		// 버튼 3
		JButton btn3 = new JButton("이 주의 식단\n검색하기");
		btn3.setFont(btn_font);
		btn3.setBounds(30, 200, 200, 100);

		// 버튼 4
		JButton btn4 = new JButton("음식\n미리주문하기");
		btn4.setFont(btn_font);
		btn4.setBounds(250, 200, 200, 100);
		// --------------------------------------------

		// Frame에 Component 추가하기
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);

		
		// 버튼 감지하기 -----------------------------------
		// 공지사항 버튼 누르기
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new NoticeFrame();
			}
		});
		
		// --------------------------------------------
		
		
		
		// Frame 닫기 버튼
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		// Frame 디스플레이
		frame.setVisible(true);

	} // end of main
} // end of class
