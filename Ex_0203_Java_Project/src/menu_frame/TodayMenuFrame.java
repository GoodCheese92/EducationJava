package menu_frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import menu_information.ThisWeekMenu;

public class TodayMenuFrame extends JFrame {
	String fileName;
	public TodayMenuFrame(String fileName) {
		this.fileName = fileName;
		setBounds(400, 100, 800, 600);
		setTitle("오늘의 식단");

		// panel 세팅
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);

		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.BOTH;
		panel.setLayout(gbl);
		
	
		// 내용 보여줄 컴포넌트 넣기 ------------------------------
		JLabel[] lb = new JLabel[8];
		ThisWeekMenu twk = new ThisWeekMenu();
		Font upperMenu_font = new Font("hy신명조", Font.BOLD, 20);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d(E)");
		for (int i = 0; i < lb.length; i++) {
			lb[i] = new JLabel();
			lb[i].setBorder(new LineBorder(Color.BLACK));

			if (i >= 0 && i <= 5) {
				lb[i].setHorizontalAlignment(JLabel.CENTER);
			} else {
				lb[i].setHorizontalAlignment(JLabel.LEFT);
			}

			gbc.gridx = i % 4;
			gbc.gridy = i / 4;
			
			if(i>=0 && i<=3) {
				gbc.gridwidth = 1;
				gbc.gridheight = 1;
				gbc.weightx = 1;
				gbc.weighty = 1;
				lb[i].setText(twk.getUpper_name()[i]);
				lb[i].setFont(upperMenu_font);
			} else {
				gbc.gridwidth = 1;
				gbc.gridheight = 1;
				gbc.weightx = 1;
				gbc.weighty = 5;
			}

			gbl.setConstraints(lb[i], gbc);
		} // for
		
		// 내용 세팅
		twk.menuGet(fileName);
		for(int i=0; i<twk.getDate().size(); i++) {
			String str = twk.getDate().get(i);
			if(str.equals(sdf.format(date))) {
				lb[4].setText(str);
				lb[5].setText("<html>"+ twk.getBreakfast().get(i)+"</html>");
				lb[6].setText("<html>"+twk.getLunch().get(i)+"</html>");
				lb[7].setText("<html>"+twk.getDinner().get(i)+"</html>");
			}
		} // for

		// -----------------------------------------------

		// 컴포넌트 추가
		
		for (int i = 0; i < lb.length; i++) {
			panel.add(lb[i]);
		}
		setContentPane(panel);

		// frame 닫기 감지
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		// 눈에 보이기
		setVisible(true);

	} // end of constructor
} // end of class
