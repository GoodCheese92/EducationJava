package ex3_ui_frame;

import java.awt.Color;

public class MyFrameMain {
	public static void main(String[] args) {
		MyFrame mf1 = new MyFrame();
		Color c = new Color(0, 120, 51);
		mf1.setBackground(c);
		mf1.setTitle("프레임1");
		
		MyFrame mf2 = new MyFrame();
		mf2.setTitle("프레임2");
		
		
	} // end of main
} // end of class
