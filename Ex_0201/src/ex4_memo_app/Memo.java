package ex4_memo_app;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Memo {
	public static void main(String[] args) {
		Frame frame = new Frame("메모장");
		frame.setBounds(500, 200, 400, 500);
		frame.setLayout(null); // 자동 배치 끄기
		frame.setBackground(new Color(0, 200, 51));

		// frame에 font를 넣으면 전체 스타일이 다 바뀐다.
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
		btn.setEnabled(false); // ok버튼 비활성화 상태로 시작

		// ---------------------------------------------

		// 중앙에 자리잡을 컴포넌트들---------------------------

		// 생성자에 글자종류 및 크기는 자리를 잡았기 때문에 안줘도 상관 없다.
		// 마지막에 스크롤바의 유무를 넣어 줄 수 있다.
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 70, 380, 370);
		ta.setFont(save_font);
		ta.setEditable(false); // ta에 직접적으로 값을 입력하는 것을 방지

		// 값을 넣을 수 있다.
		// ta.setText("안녕\nhi hello\n반가워");
		// ta.getText(); --> ta에 쓰여있는 내용을 가져온다.

		// ---------------------------------------------

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

		// ---------------------------------------------

		// TextField(tf)에 값이 있는 경우에만 ok버튼을 활성화
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if (tf.getText().trim().length() == 0) {
					btn.setEnabled(false); // 버튼 비활성화
				} else {
					btn.setEnabled(true);
				}
			}
		});

		// ok버튼 클릭 시 tf의 내용을 ta에 추가
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");

				// tf를 비워준다.
				tf.setText("");
				tf.requestFocus(); // tf로 커서가 이동됨
			}
		});

		// 엔터값으로 tf의 값을 ta에 추가
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// 엔터값이 감지되었다면
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText() + "\n");

					// tf를 비워준다.
					tf.setText("");
					tf.requestFocus(); // tf로 커서가 이동됨
				}
			}
		});

		// 저장 버튼 클릭시 이벤트 감지자
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();

				FileWriter fw = null;
				BufferedWriter bw = null;

				try {
					FileDialog fd = new FileDialog(frame, "저장", FileDialog.SAVE);
					fd.setVisible(true); // 팝업창 활성화

					// System.out.println(fd.getDirectory() + fd.getFile()); // file이 저장되는 path

					String path = fd.getDirectory() + fd.getFile();

					fw = new FileWriter(path);
					bw = new BufferedWriter(fw);

					bw.write(message); // 파일 생성

					bw.flush();

					// System.out.println(fd.getFile()); // 취소 누르면 null 리턴
					if (fd.getFile() != null) {
						JOptionPane.showMessageDialog(frame, "저장완료");
					}

				} catch (Exception e2) {
					// TODO: handle exception
				} finally {
					try {
						bw.close();
						fw.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}

			}
		});

		// frame에 컴포넌트들 추가
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

		frame.setResizable(false); // 만들어진 프레임의 크기를 고정
		frame.setVisible(true);

	} // end of main
} // end of class
