package menu_frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NoticeFrame {
	public NoticeFrame() {
		// frame 세팅
		JFrame frame = new JFrame("공지사항");
		frame.setLayout(null);
		frame.setBounds(800, 200, 400, 300);
		
		// 게시판 내용 세팅 및 출력
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		Font ta_font = new Font("궁서체", Font.PLAIN, 15);
		ta.setEditable(false);
		ta.setBounds(10, 10, 370, 200);
		ta.setBackground(new Color(255, 255, 255));
		
		// 하단 버튼 세팅
		Font bt_font = new Font("궁서체", Font.BOLD, 20);
		JButton btn1 = new JButton("수정");
		btn1.setBounds(10, 220, 175, 30);
		btn1.setFont(bt_font);
		
		JButton btn2 = new JButton("닫기");
		btn2.setBounds(200, 220, 175, 30);
		btn2.setFont(bt_font);
		
		// frame에 컴포넌트 추가
		frame.add(ta);
		frame.add(btn1);
		frame.add(btn2);
		
		// btn1(수정) 버튼 감지자
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new NoticeSetFrame();
			}
		});
		
		// btn2(수정) 버튼 감지자
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		// frame 닫기
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		// frame 디스플레이
		frame.setVisible(true);
		
		
	} // end of constructor
} // end of class
