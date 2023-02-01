package ex4_memo_app;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Memo {
	public static void main(String[] args) {
		Frame frame = new Frame("메모장");
		frame.setBounds(500, 200, 400, 500);
		frame.setLayout(null);	// 자동 배치 끄기
		frame.setBackground(new Color(0, 200, 51));
		
		// Font title_font = new Font("궁서체", Font.BOLD, 20);
		// frame.setFont(title_font);
		
		Font font = new Font("궁서체", Font.PLAIN, 20);
		Font save_font = new Font("궁서체", Font.PLAIN, 15); 
		
		// 상단에 자리잡을 컴포넌트들---------------------------
		
		TextField tf = new TextField();
		tf.setBounds(10, 30, 300, 30);
		tf.setFont(font);
		
		Button btn = new Button("OK");
		btn.setBounds(320, 30, 70, 30);
		
		//---------------------------------------------
		
		
		// 중앙에 자리잡을 컴포넌트들---------------------------
		
		// 생성자에 글자종류 및 크기는 자리를 잡았기 때문에 안줘도 상관 없다.
		// 마지막에 스크롤바의 유무를 넣어 줄 수 있다.
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 70, 380, 370);
		ta.setFont(save_font);
		ta.setEditable(false);	// ta에 직접적으로 값을 입력하는 것을 방지
		
		// 값을 넣을 수 있다.
		// ta.setText("안녕\nhi hello\n반가워"); 
		// ta.getText(); --> ta에 쓰여있는 내용을 가져온다.
		
		//---------------------------------------------
		
		
		// 하단에 자리잡을 컴포넌트들---------------------------
		
		Button btnSave = new Button("저장");
		btnSave.setBounds(15, 450, 180, 40);
		
		Button btnClose = new Button("닫기");
		btnClose.setBounds(205, 450, 180, 40);
		// 닫기 버튼에 프레임을 종료하는 감지자 등록
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		//---------------------------------------------
		
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		frame.setResizable(false);	// 만들어진 프레임의 크기를 고정
		frame.setVisible(true);
		
		
	} // end of main
} // end of class
