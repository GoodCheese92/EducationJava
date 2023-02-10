package test_ttt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TestMenubar {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setSize(500, 500);
		
		
		JMenu menu = new JMenu("학생정보");
		
		JMenuBar bar = new JMenuBar();
		
		JMenuItem menu_item = new JMenuItem("Test");
		
		menu_item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new JPanel();
				
				panel.setBounds(10, 10, 350, 400);
				panel.setVisible(true);
			}
		});
		
//		frame.add(bar);
		menu.add(menu_item);
		bar.add(menu);
		frame.setJMenuBar(bar);
		
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
		
		
	} // end of main
} // end of class
