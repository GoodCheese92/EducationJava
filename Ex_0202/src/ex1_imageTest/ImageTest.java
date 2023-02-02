package ex1_imageTest;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] args) {
		Frame f = new Frame("�̹���");
		f.setBounds(500, 50, 1400, 900);
		f.setLayout(null);

		// �̹��� �غ�
		ImageIcon img1 = new ImageIcon("WindowBackground.jpg");
		ImageIcon img2 = new ImageIcon("ī����.jpg");
		ImageIcon img3 = new ImageIcon("���.jpg");
		ImageIcon img4 = new ImageIcon("���λ�.png");

		// ImageIcon�� �߰��� �� �ִ� ��ü�� JLabel, JButton���̴�.
		JLabel jl = new JLabel(img4);
		jl.setBounds(0, 20, 1400, 900);

		// ��ư ����
		JButton btn = new JButton();
		btn.setIcon(img3);
		btn.setBounds(200, 200, 50, 50);

		// ��ưŬ�� ����
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setIcon(img2);
				jl.repaint(); // frame�� ����
			}
		});

		// f�� �̹����� ���� JLabel�� �߰�
		f.add(btn); // ��ư�� label���� �ö󰡰� ���̰� �ϰ� �ʹٸ� ���� �߰������ �Ѵ�.
		f.add(jl);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // end of main
} // end of class
