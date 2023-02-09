package test_ttt;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import menu_information.LoadCoffeeObject;

public class ButtonTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		frame.setBounds(800, 200, 800, 400);
		frame.setLayout(null);
		
		JButton btn1 = new JButton("<html><center>오늘의<br>식당 검색하기<center></html>");
		btn1.setBounds(50, 50, 300, 250);
//		btn1.setHorizontalAlignment(JButton.LEFT);
		
		LoadCoffeeObject lco = new LoadCoffeeObject("CoffeeObjectSave(Hot)");
		ImageIcon icon = new ImageIcon();
		icon = lco.getCoffee()[0].getImgicon();
		
		btn1.setIcon(icon);
		btn1.setHorizontalTextPosition(JButton.CENTER);
		btn1.setVerticalTextPosition(JButton.BOTTOM);
		
		LoadCoffeeObject lco2 = new LoadCoffeeObject("DrinkObjectSave(Ice)");
		JButton btn2 = new JButton("<html><center>오늘의<br>식당 검색하기<center></html>");
		btn2.setBounds(450, 50, 300, 250);
		ImageIcon icon2 = new ImageIcon();
		icon2 = lco2.getDrink()[0].getImgicon();
		
		btn2.setIcon(icon2);
		btn2.setHorizontalTextPosition(JButton.CENTER);
		btn2.setVerticalTextPosition(JButton.BOTTOM);
		
		frame.add(btn1);
		frame.add(btn2);
		
		frame.setVisible(true);
		
		
		
		
	} // end of main
} // end of class
