package ex3_ui_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_frame {
	public static void main(String[] args) {
		
		Color color = new Color(006600);
		
		Frame frame = new Frame("나의 첫 프레임");
		frame.setSize(400, 300);	// 생성될 프레임의 너비와 높이
		frame.setLocation(500, 200);	// 생성될 프레임의 좌표값
		
		frame.setBackground(color);	// 배경색 변경
		
		frame.setVisible(true);	// 화면에 프레임을 띄우자
		
		
	} // end of main
} // end of class
