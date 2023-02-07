package test_ttt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(800, 200, 500, 400);
		frame.setLayout(null);
		
		JPanel panel = new JPanel();
//		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.setBackground(Color.GREEN);
		
		JLabel lb1 = new JLabel();
		Font font = new Font("»ﬁ∏’∏Ì¡∂", Font.BOLD, 20);
		lb1.setForeground(Color.BLACK);
		lb1.setBounds(10, 10, 100, 50);
		lb1.setFont(font);
		lb1.setText("Hello Java");
		
		
		panel.add(lb1);
		frame.setContentPane(panel);

		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
		
		
		
	} // end of main
} // end of class
