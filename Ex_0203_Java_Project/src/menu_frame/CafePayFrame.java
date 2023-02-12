package menu_frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CafePayFrame extends JFrame {
	
	JLabel total_label;
	
	public CafePayFrame(JLabel total_label) {
		this.total_label = total_label;
		setBounds(800, 200, 300, 200);
		setLayout(null);
		setTitle("결제하기");
		
		// panel 세팅
		JPanel panel = new JPanel();
		panel.setBounds(20, 10, 245, 80);
		panel.setBackground(Color.white);
		panel.setLayout(new BorderLayout());
		
		JLabel lb = new JLabel();
		lb.setText(total_label.getText().substring( + total_label.getText().indexOf("총 : ")+4));
		lb.setHorizontalAlignment(JLabel.CENTER);
		lb.setVerticalAlignment(JLabel.CENTER);
		Font font = new Font("hy헤드라인m", Font.BOLD, 25);
		lb.setFont(font);
		
		JButton btn1 = new JButton("<html><center>카페페이<br>결제</center></html>");
		JButton btn2 = new JButton("<html><center>신용카드<br>결제</center></html>");
		Font font2 = new Font("hy헤드라인m", Font.BOLD, 14);
		
		btn1.setBounds(20, 100, 110, 50);
		btn2.setBounds(150, 100, 110, 50);
		btn1.setFont(font2);
		btn2.setFont(font2);
		
		// 컴포넌트 추가
		panel.add(lb, BorderLayout.CENTER);
		add(btn1);
		add(btn2);
		add(panel);
		
		// 윈도우 닫기 버튼 감지
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		// 눈에 보이기
		setResizable(false);
		setVisible(true);
		
	} // end of constructor
	
} // end of class
