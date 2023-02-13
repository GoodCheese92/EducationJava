package test_ttt;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ScrollTest2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setBounds(800, 200, 500, 400);
		frame.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 465, 345);
		panel.setBackground(Color.RED);
		
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		panel.setLayout(gbl);
		
		gbc.fill = GridBagConstraints.BOTH;
		
		gbc.weightx = 0.3;
		gbc.weighty = 0.1;
		
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		JLabel[] lb = new JLabel[500]; 
		for(int i=0; i<lb.length;i++) {
			lb[i] = new JLabel(i + " ¹ø");
			panel.add(lb[i]);
			gbc.gridx = i%10;
			gbc.gridy = i/10;
			gbl.setConstraints(lb[i], gbc);
		} // for
		
		
		JScrollPane scroll = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(0, 0, 160, 160);
		
		frame.add(panel);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
		
	} // end of main
} // end of class
