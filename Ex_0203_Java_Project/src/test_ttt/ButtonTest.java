package test_ttt;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		frame.setBounds(800, 200, 500, 400);
		frame.setLayout(null);
		
		JButton btn1 = new JButton("<html><center>오늘의<br>식당 검색하기<center></html>");
		btn1.setBounds(200, 150, 150, 150);
//		btn1.setHorizontalAlignment(JButton.LEFT);
		
		frame.add(btn1);
		
		frame.setVisible(true);
		
		
		
		
	} // end of main
} // end of class
