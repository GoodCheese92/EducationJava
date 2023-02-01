package ex3_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Choice {
	public static void main(String[] args) {
		Frame f = new Frame("Choice2");
		f.setBounds(500, 200, 400, 200);
		f.setLayout(null);

		Choice day = new Choice();
		day.add("��");
		day.add("ȭ");
		day.add("��");
		day.add("��");
		day.add("��");
		day.add("��");
		day.add("��");
		
		Font day_font = new Font("�ü�ü", Font.PLAIN, 15);
		day.setFont(day_font);
		
		day.setBounds(10, 40, 100, 0);
		
		// day ������ �߰�
		day.addItemListener(new Ex2_ChoiceListener());
		
		f.add(day);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // end of main
} // end of class
