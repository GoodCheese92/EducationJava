package ex2_button;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_CheckBox {
	public static void main(String[] args) {
		Frame f = new Frame("����");
		f.setBounds(600, 150, 800, 300);
		f.setLayout(null);

		// ��Ʈ�� ���õ� Ŭ����
		Font font = new Font("�ü�ü", Font.BOLD, 30);
		Font check_font = new Font("�ü�ü", Font.PLAIN, 20);

		// ������ �ؽ�Ʈ�� �����ֱ� ���� Ŭ����
		Label question1 = new Label("1. ����� ��̴� �����Դϱ�?");
		question1.setFont(font);
		question1.setBounds(10, 30, 420, 50);
		question1.setBackground(new Color(0, 230, 50));

		// üũ�ڽ��� ������ �����ϴ� ������
		ItemListener check_click = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				// System.out.println(str);

				String res = "";

				switch (str) {
				case "��ȭ":
					res = e.getStateChange() == 1 ? "��ȭ ������" : "��ȭ ������"; // üũ�ڽ��� ���°� ���Ѵٸ�(1�� ��ȯ�ϴ� ���� ���õ� ��, 2�� ������)
					break;
				case "����":
					res = e.getStateChange() == 1 ? "���� ������" : "���� ������";
					break;
				case "�":
					res = e.getStateChange() == 1 ? "� ������" : "� ������";
					break;
				} // switch

				System.out.println(res);
			}
		};

		// üũ�ڽ� ����
		Checkbox movie = new Checkbox("��ȭ");
		Checkbox book = new Checkbox("����");
		Checkbox sports = new Checkbox("�");

		movie.setBounds(10, 80, 100, 50);
		movie.setFont(check_font);

		book.setBounds(120, 80, 100, 50);
		book.setFont(check_font);

		sports.setBounds(230, 80, 100, 50);
		sports.setFont(check_font);

		// üũ�ڽ��鿡�� �̺�Ʈ ������ ���
		movie.addItemListener(check_click);
		book.addItemListener(check_click);
		sports.addItemListener(check_click);
		
		// ������ ���� Label ����
		Label question2 = new Label("2. ����� ������ �����Դϱ�?");
		question2.setBounds(10, 140, 420, 50);
		question2.setFont(font);
		question2.setBackground(new Color(51, 152, 51));
		
		// ���� ��ư�� �̺�Ʈ ������
		ItemListener radio_click = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				System.out.println(str);
				// ���������� �ϳ��� ������ �Ǿ��ֱ� ������ Ȯ���� ���ؼ��� ���� switch���� ������ �ʾƵ� �ȴ�.
				
			}
		};
		
		// ���߼����� �Ұ����� RadioButton ����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("����", group, false);	// �̸� �����Ϸ��� true
		Checkbox female = new Checkbox("����", group, false);	// �̸� �����Ϸ��� true
		male.setBounds(10, 200, 100, 50);
		male.setFont(check_font);
		female.setBounds(120, 200, 100, 50);
		female.setFont(check_font);
		
		// ������ư�� �̺�Ʈ ������ ���
		male.addItemListener(radio_click);
		female.addItemListener(radio_click);
		
		
		// ���� Component���� f�� �߰�
		f.add(question1);
		f.add(movie);
		f.add(book);
		f.add(sports);
		f.add(question2);
		f.add(male);
		f.add(female);

		// x��ư ����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // end of main
} // end of class
