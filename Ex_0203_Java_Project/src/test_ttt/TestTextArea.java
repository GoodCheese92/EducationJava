package test_ttt;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class TestTextArea {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(900, 200, 500, 400);
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.weighty = 1;

		gbc.fill = GridBagConstraints.BOTH;

		frame.setLayout(gbl);

		JLabel[] ta = new JLabel[24];
		for (int i = 0; i < ta.length; i++) {
			ta[i] = new JLabel();
			ta[i].setBorder(new LineBorder(Color.BLACK));

			gbc.gridx = i % 4;
			gbc.gridy = i / 4;

			if (i % 4 == 0) {
				gbc.gridwidth = 1;
				gbl.setConstraints(ta[i], gbc);
			} else {
				gbc.gridwidth = 1;
				gbl.setConstraints(ta[i], gbc);
			}
			frame.add(ta[i]);
		}

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		frame.setVisible(true);

	} // end of main
} // end of class
