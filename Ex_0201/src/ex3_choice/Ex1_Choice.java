package ex3_choice;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	
	static String ss = "나는 A형!";
	
	public static void main(String[] args) {
				
		Frame f = new Frame("Choice");
		f.setBounds(500, 300, 500, 250);
		f.setLayout(null);

		// 선택상자(Choice)객체 생성
		Choice bt = new Choice();
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");

		// Choice객체의 높이값은 안에 있는 요소의 사이즈로 결정되므로
		// 0으로 두어도 무관하다.
		bt.setBounds(10, 35, 100, 0);
		
		// bt 폰트
		Font bt_font = new Font("궁서체", Font.PLAIN, 20);
		bt.setFont(bt_font);

		// 결과를 보여줄 Label
		Label resultLabel = new Label(ss);
		Font font = new Font("궁서체", Font.BOLD, 30);
		resultLabel.setFont(font);
		resultLabel.setBackground(new Color(0, 152, 51));
		resultLabel.setBounds(200, 100, 200, 50);

		// 혈액형을 선택하는 Choice객체에게 이벤트 감지자 추가
		bt.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// 인터페이스를 새롭게 구현한 객체이기 때문에 밖에 있는 ss를 가져올 수 없다.
				ss = bt.getSelectedItem();
				// 내가 선택한 항목을 Label의 내용으로 갱신
				resultLabel.setText("나는 " + ss + "형!!");
			}
		});

		// 컴포넌트를 프레임에 추가
		f.add(bt);
		f.add(resultLabel);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // end of main
} // end of class
