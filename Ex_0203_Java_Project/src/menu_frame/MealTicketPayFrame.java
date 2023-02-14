package menu_frame;

import java.awt.Choice;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MealTicketPayFrame extends JFrame {
	String restautantName;
	
	public MealTicketPayFrame(String restaurantName) {
		this.restautantName = restaurantName;
		
		setBounds(750, 150, 200, 100);
		setTitle("식권 결제하기");
		setLayout(null);
		
		Font font_info = new Font("궁서체", Font.BOLD, 12);
		JLabel info_label = new JLabel("몇 장? : ");
		info_label.setFont(font_info);
		info_label.setBounds(10, 10, 70, 30);
		
		Choice choice = new Choice();
		choice.add("1");
		choice.add("2");
		choice.add("3");
		choice.add("4");
		choice.add("5");
		
		Font font_choice = new Font("궁서체", Font.BOLD, 15);
		choice.setFont(font_choice);
		choice.setBounds(80, 10, 110, 30);
		
		add(info_label);
		add(choice);
		
		MealQRcodeFrame mqr = new MealQRcodeFrame(restaurantName);
		choice.addItemListener(mqr);
		
		// frame 닫기 감지
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		setResizable(false);
		setVisible(true);

	} // end of constructor

} // end of class
