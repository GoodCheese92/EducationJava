package ex3_ui_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_frame {
	public static void main(String[] args) {
		
		Color color = new Color(006600);
		
		Frame frame = new Frame("���� ù ������");
		frame.setSize(400, 300);	// ������ �������� �ʺ�� ����
		frame.setLocation(500, 200);	// ������ �������� ��ǥ��
		
		frame.setBackground(color);	// ���� ����
		
		frame.setVisible(true);	// ȭ�鿡 �������� �����
		
		
	} // end of main
} // end of class
