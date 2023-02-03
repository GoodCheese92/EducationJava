package menu_frame;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoticeSetFrame extends JFrame {
	public NoticeSetFrame() {
		super("공지사항 수정");
		setBounds(800, 200, 400, 200);
		setLayout(null);
		
		// TextField 세팅 (수정내용)
		Font tf_font = new Font("궁서체", Font.PLAIN, 15);
		TextField tf = new TextField();
		tf.setFont(tf_font);
		tf.setBounds(10, 10, 300, 140);
		
		// button 추가
		Font btn_font = new Font("궁서체", Font.BOLD, 15);
		JButton btn = new JButton("수정");
		btn.setFont(btn_font);
		btn.setBounds(320, 10, 50, 140);
		
		// frame에 컴포넌트 추가
		add(tf);
		add(btn);
		
		// 닫기 버튼 감지
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		// JFrame 디스플레이
		setVisible(true);
		
	} // end of construction
} // end of class
