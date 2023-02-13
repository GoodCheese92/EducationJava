package test_ttt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class ScrollTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		frame.setLayout(null);
		frame.setBounds(800, 200, 500, 400);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 10, 455, 330);

//		JPanel panel2 = new JPanel();
//		panel2.setLayout(new BorderLayout());
//		panel2.setBounds(10, 10, 475, 350);
//		panel2.setBackground(Color.RED);

		JScrollPane scroll = new JScrollPane(panel);
		scroll.setPreferredSize(new Dimension(30, 100));
		scroll.setBounds(10, 10, 455, 330);
		frame.add(scroll);

		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.fill = GridBagConstraints.BOTH;

		gbc.gridheight = 1;
		JLabel[] lb = new JLabel[30 * 4];
		for (int i = 0; i < lb.length; i++) {
			lb[i] = new JLabel(i + "¹ø");
			lb[i].setFont(new Font("±Ã¼­Ã¼", Font.BOLD, 15));

			gbc.gridx = i % 3;
			gbc.gridy = i / 3;

			if (i % 3 == 0) {
				gbc.weightx = 0.3;
			} else if (i % 3 == 1) {
				gbc.weightx = 0.1;
			} else {
				gbc.weightx = 0.2;
			}

			lb[i].setHorizontalAlignment(JLabel.CENTER);
			lb[i].setBorder(new LineBorder(Color.BLACK, 1, false));
			gbl.setConstraints(lb[i], gbc);

			panel.add(lb[i], gbc);
		} // for
		panel.setLayout(gbl);

//		panel2.add(panel, BorderLayout.CENTER);
//		frame.add(panel);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		frame.setResizable(false);
		frame.setVisible(true);

	} // end of main
} // end of class
