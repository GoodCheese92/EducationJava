package menu_frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class StudentUnionFrame {
	public StudentUnionFrame(String restaurantName) {
		// Frame 세팅
		JFrame frame = new JFrame(restaurantName + " 식당");
		frame.setLayout(null);
		frame.setBounds(800, 200, 500, 400);

		// 버튼 세팅--------------------------------------
		// 버튼 1
		Font btn_font = new Font("궁서체", Font.BOLD, 20);
		JButton btn1 = new JButton("공지사항");
		btn1.setFont(btn_font);
		btn1.setBounds(30, 50, 200, 100);
//		btn1.setHorizontalAlignment(JButton.CENTER);
//		btn1.setVerticalAlignment(SwingConstants.CENTER);

		// 버튼 2
		JButton btn2 = new JButton("<html><center>오늘의 메뉴</center></html>");
		btn2.setFont(btn_font);
		btn2.setBounds(250, 50, 200, 100);
//		btn2.setHorizontalAlignment(JButton.CENTER);
//		btn2.setVerticalAlignment(SwingConstants.CENTER);
		
		// 버튼 3
		JButton btn3 = new JButton("<html><center>이번 주<br>식단 보기</center><html>");
		btn3.setFont(btn_font);
		btn3.setBounds(30, 200, 200, 100);
//		btn3.setHorizontalAlignment(JButton.CENTER);
//		btn3.setVerticalAlignment(SwingConstants.CENTER);

		// 버튼 4
		JButton btn4 = new JButton("<html><center>음식<br>미리 주문하기</center></html>");
		btn4.setFont(btn_font);
		btn4.setBounds(250, 200, 200, 100);
//		btn4.setHorizontalAlignment(SwingConstants.CENTER);
//		btn4.setVerticalAlignment(SwingConstants.CENTER);
		
		// 버튼 5 (이전 버튼)
		JButton btn5 = new JButton("뒤로가기");
		btn5.setFont(new Font("궁서체", Font.BOLD, 15));
		btn5.setBounds(186, 315, 100, 30);
//		btn5.setHorizontalAlignment(JButton.CENTER);
//		btn5.setVerticalAlignment(SwingConstants.CENTER);
		// --------------------------------------------

		// Frame에 Component 추가하기
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);

		// 버튼 감지하기 -----------------------------------
		// 공지사항 버튼 누르기
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new NoticeFrame(restaurantName);
			}
		});
		
		// 오늘의 식단 버튼 감지
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TodayMenuFrame(restaurantName + " 메뉴/2월 2주차 메뉴.txt");
			}
		});
		
		// 이 주의 식단 버튼 감지
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ThisWeekmenuFrame(restaurantName + " 메뉴/2월 2주차 메뉴.txt");
			}
		});
		
		// 뒤로가기 버튼 감지
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.repaint();
				new MenuFrame();
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
		frame.setResizable(false);
		frame.setVisible(true);

	} // end of constructor

} // end of class
