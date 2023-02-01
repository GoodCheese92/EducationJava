package ex1_button;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Ex1_ButtonTest {
	public static void main(String[] args) {
		Frame f = new Frame("��ư �׽�Ʈ");
		f.setBounds(900, 150, 400, 400); // (x��ǥ, y��ǥ, �ʺ�, ����)

		// FrameŬ������ �߰��� ������Ʈ�� ȭ�鿡 ���� ä����� �ϴ� �Ӽ��� ������ �ִ�.
		f.setLayout(null); // �ڵ���ġ�� ����.

		// ��ư ����
		// �ڵ� ��ġ�� �����ִ� Frame�� ���� �� �ڽ� ������Ʈ����
		// �ݵ�� ��ġ�� ũ�Ⱚ�� �����Ǿ� �־�� �Ѵ�.
		Button btnOk = new Button("Ȯ��");
		btnOk.setBounds(70, 90, 100, 50);

		Button btnClose = new Button("�ݱ�");
		btnClose.setBounds(230, 90, 100, 50);

		// ��ư �� ����
		// btnOk.setBackground(new Color(0, 102, 51));

		// ������ ����鿡 ���ؼ� �̺�Ʈ ������ �߰�
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok��ư Ŭ���Ϸ�");
			}
		});

		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		// ������ ��ư�� f�� �߰�
		f.add(btnOk);
		f.add(btnClose);

		// frame x��ư ����(�̺�Ʈ ó��)
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.out.println("f x��ư Ŭ����");
				System.exit(0); // �����ִ� ��� �������� ����
			};
		});

		f.setVisible(true);

	} // end of main
} // end of class
