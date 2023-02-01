package ex2_button;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_CheckBox {
	public static void main(String[] args) {
		Frame f = new Frame("질문");
		f.setBounds(600, 150, 800, 300);
		f.setLayout(null);

		// 폰트와 관련된 클래스
		Font font = new Font("궁서체", Font.BOLD, 30);
		Font check_font = new Font("궁서체", Font.PLAIN, 20);

		// 고정된 텍스트를 보여주기 위한 클래스
		Label question1 = new Label("1. 당신의 취미는 무엇입니까?");
		question1.setFont(font);
		question1.setBounds(10, 30, 420, 50);
		question1.setBackground(new Color(0, 230, 50));

		// 체크박스의 선택을 감지하는 감지자
		ItemListener check_click = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				// System.out.println(str);

				String res = "";

				switch (str) {
				case "영화":
					res = e.getStateChange() == 1 ? "영화 선택함" : "영화 해제됨"; // 체크박스의 상태가 변한다면(1을 반환하는 것이 선택된 것, 2는 해제됨)
					break;
				case "독서":
					res = e.getStateChange() == 1 ? "독서 선택함" : "독서 해제됨";
					break;
				case "운동":
					res = e.getStateChange() == 1 ? "운동 선택함" : "운동 해제됨";
					break;
				} // switch

				System.out.println(res);
			}
		};

		// 체크박스 생성
		Checkbox movie = new Checkbox("영화");
		Checkbox book = new Checkbox("독서");
		Checkbox sports = new Checkbox("운동");

		movie.setBounds(10, 80, 100, 50);
		movie.setFont(check_font);

		book.setBounds(120, 80, 100, 50);
		book.setFont(check_font);

		sports.setBounds(230, 80, 100, 50);
		sports.setFont(check_font);

		// 체크박스들에게 이벤트 감지자 등록
		movie.addItemListener(check_click);
		book.addItemListener(check_click);
		sports.addItemListener(check_click);
		
		// 성별을 묻는 Label 생성
		Label question2 = new Label("2. 당신의 성별은 무엇입니까?");
		question2.setBounds(10, 140, 420, 50);
		question2.setFont(font);
		question2.setBackground(new Color(51, 152, 51));
		
		// 라디오 버튼의 이벤트 감지자
		ItemListener radio_click = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				System.out.println(str);
				// 마지막에는 하나만 선택이 되어있기 때문에 확인을 위해서는 따로 switch문을 만들지 않아도 된다.
				
			}
		};
		
		// 다중선택이 불가능한 RadioButton 생성
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("남자", group, false);	// 미리 선택하려면 true
		Checkbox female = new Checkbox("여자", group, false);	// 미리 선택하려면 true
		male.setBounds(10, 200, 100, 50);
		male.setFont(check_font);
		female.setBounds(120, 200, 100, 50);
		female.setFont(check_font);
		
		// 라디오버튼에 이벤트 감지자 등록
		male.addItemListener(radio_click);
		female.addItemListener(radio_click);
		
		
		// 각종 Component들을 f에 추가
		f.add(question1);
		f.add(movie);
		f.add(book);
		f.add(sports);
		f.add(question2);
		f.add(male);
		f.add(female);

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
