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
		Frame f = new Frame("이미지");
		f.setBounds(500, 50, 1400, 900);
		f.setLayout(null);

		// 이미지 준비
		ImageIcon img1 = new ImageIcon("WindowBackground.jpg");
		ImageIcon img2 = new ImageIcon("카즈하.jpg");
		ImageIcon img3 = new ImageIcon("녹색.jpg");
		ImageIcon img4 = new ImageIcon("연두색.png");

		// ImageIcon을 추가할 수 있는 객체는 JLabel, JButton뿐이다.
		JLabel jl = new JLabel(img4);
		jl.setBounds(0, 20, 1400, 900);

		// 버튼 생성
		JButton btn = new JButton();
		btn.setIcon(img3);
		btn.setBounds(200, 200, 50, 50);

		// 버튼클릭 감지
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setIcon(img2);
				jl.repaint(); // frame을 갱신
			}
		});

		// f에 이미지를 가진 JLabel을 추가
		f.add(btn); // 버튼이 label위로 올라가게 보이게 하고 싶다면 먼저 추가해줘야 한다.
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
