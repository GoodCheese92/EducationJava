package menu_frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuFrame {
	public MenuFrame() {
		// Frame 세팅
				JFrame frame = new JFrame("밥 먹자~~~!!");
//				JPanel panel = new JPanel();
//				frame.setContentPane(panel);
//				panel.setBackground(new Color(0, 200, 51));
				frame.setLayout(null);
				frame.setBounds(800, 200, 500, 400);

				// 버튼 세팅-------------------------------------
				// 버튼 1
				Font btn_font = new Font("궁서체", Font.BOLD, 20);
				JButton btn1 = new JButton("학생회관 식당");
				btn1.setFont(btn_font);
				btn1.setBounds(30, 50, 200, 100);

				// 버튼 2
				JButton btn2 = new JButton("자연과학관 식당");
				btn2.setFont(btn_font);
				btn2.setBounds(250, 50, 200, 100);

				// 버튼 3
				JButton btn3 = new JButton("본관 식당");
				btn3.setFont(btn_font);
				btn3.setBounds(30, 200, 200, 100);

				// 버튼 4
				JButton btn4 = new JButton("카페");
				btn4.setFont(btn_font);
				btn4.setBounds(250, 200, 200, 100);
				
				// 버튼 5
				JButton btn5 = new JButton("뒤로가기");
				btn5.setFont(new Font("궁서체", Font.BOLD, 15));
				btn5.setBounds(186, 315, 100, 30);
				
				// -------------------------------------------

				// panel에 추가하기
//				panel.add(btn1);

				// frame에 추가하기
				frame.add(btn1);
				frame.add(btn2);
				frame.add(btn3);
				frame.add(btn4);
				frame.add(btn5);
				
				
				// 학생회관 식당 버튼 감지
				btn1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new StudentUnionFrame("학생회관");
						frame.dispose();
					}
				});
				
				// 자연과학관 식당 버튼 감지
				btn2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new StudentUnionFrame("자연과학관");
						frame.dispose();
					}
				});
				
				// 본관 식당 버튼 감지
				btn3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new StudentUnionFrame("본관");
						frame.dispose();
					}
				});
				
				// 카페 버튼 감지
				btn4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new CafeMenuFrame();
//						frame.dispose();
					}
				});
				
				// 뒤로가기 버튼 감지
				btn5.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new LoginFrame();
						frame.dispose();
					}
				});
				
				// frame 닫기 버튼 감지
				frame.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
				
				frame.setResizable(false);
				frame.setVisible(true);
	} // end of constructor
} // end of class
