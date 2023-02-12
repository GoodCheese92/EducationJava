package menu_frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import menu_information.ThisWeekMenu;

public class ThisWeekmenuFrame extends JFrame {
	public ThisWeekmenuFrame(String filename) {
		setBounds(400, 100, 1200, 800);
		setTitle("이 주의 식단");
		
		
		// panel 세팅
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		Font panel_font = new Font("궁서체", Font.BOLD, 30);
//		panel.setFont(panel_font);
		
		

		// 내용 보여줄 Label -----------------------------------
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		panel.setLayout(gbl);
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;

		gbc.gridwidth = 1;
		gbc.gridheight = 1;

		gbc.fill = GridBagConstraints.BOTH;

		JLabel[] la_date = new JLabel[24];
		for (int i = 0; i < la_date.length; i++) {
			// label 생성 및 세팅
			la_date[i] = new JLabel();
			la_date[i].setHorizontalAlignment(JLabel.LEFT);
			la_date[i].setBorder(new LineBorder(Color.BLACK));
			
			la_date[i].setBackground(Color.GREEN);

			gbc.gridx = i % 4;
			gbc.gridy = i / 4;

			// la_date[i].setEnabled(false);
			
			
			// 상단 표 제목 출력하기
			ThisWeekMenu twk = new ThisWeekMenu();
			Font upperMenu_font = new Font("hy신명조", Font.BOLD, 20);
			if(i<4) {
//				la_date[i].setForeground(Color.BLACK);
				la_date[i].setHorizontalAlignment(JLabel.CENTER);
				la_date[i].setFont(upperMenu_font);
				la_date[i].setText(twk.getUpper_name()[i]);
			}
			
			// 요일 출력하기
//			filename = "학생회관 메뉴/2월 2주차 메뉴.txt";
			if(i%4 == 0 && i != 0) {
				twk.menuGet(filename);
				la_date[i].setHorizontalAlignment(JLabel.CENTER);
				la_date[i].setText("<html>"+twk.getDate().get(i/4 - 1)+"</html>");
			}

			// 메뉴넣기
			// 조식
			if(i/4 != 0 && i%4 == 1) {
				twk.menuGet(filename);
				la_date[i].setHorizontalAlignment(JLabel.CENTER);
				la_date[i].setText("<html>"+twk.getBreakfast().get(i/4-1)+"</html>");	
			}
			// 중식
			if(i/4 != 0 && i%4 == 2) {
				twk.menuGet(filename);
				la_date[i].setText("<html>"+twk.getLunch().get(i/4 -1)+"</html>");
			}
			// 석식
			if(i/4 != 0 && i%4 == 3) {
				twk.menuGet(filename);
				la_date[i].setText("<html>" + twk.getDinner().get(i/4 - 1) + "</html>");
			}
			
			
			gbl.setConstraints(la_date[i], gbc);
		} // end of for

		// --------------------------------------------------
		
		

		// frame에 컴포넌트 추가
		for (int i = 0; i < la_date.length; i++) {
			panel.add(la_date[i]);
		}
		setContentPane(panel);

		// frame 닫기버튼 감지
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		setVisible(true);

	} // end of constructor

} // end of class
