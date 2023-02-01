package ex3_choice;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	
	static String ss = "���� A��!";
	
	public static void main(String[] args) {
				
		Frame f = new Frame("Choice");
		f.setBounds(500, 300, 500, 250);
		f.setLayout(null);

		// ���û���(Choice)��ü ����
		Choice bt = new Choice();
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");

		// Choice��ü�� ���̰��� �ȿ� �ִ� ����� ������� �����ǹǷ�
		// 0���� �ξ �����ϴ�.
		bt.setBounds(10, 35, 100, 0);
		
		// bt ��Ʈ
		Font bt_font = new Font("�ü�ü", Font.PLAIN, 20);
		bt.setFont(bt_font);

		// ����� ������ Label
		Label resultLabel = new Label(ss);
		Font font = new Font("�ü�ü", Font.BOLD, 30);
		resultLabel.setFont(font);
		resultLabel.setBackground(new Color(0, 152, 51));
		resultLabel.setBounds(200, 100, 200, 50);

		// �������� �����ϴ� Choice��ü���� �̺�Ʈ ������ �߰�
		bt.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// �������̽��� ���Ӱ� ������ ��ü�̱� ������ �ۿ� �ִ� ss�� ������ �� ����.
				ss = bt.getSelectedItem();
				// ���� ������ �׸��� Label�� �������� ����
				resultLabel.setText("���� " + ss + "��!!");
			}
		});

		// ������Ʈ�� �����ӿ� �߰�
		f.add(bt);
		f.add(resultLabel);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // end of main
} // end of class
