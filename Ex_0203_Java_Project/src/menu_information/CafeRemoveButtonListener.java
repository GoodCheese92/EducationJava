package menu_information;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class CafeRemoveButtonListener implements ActionListener {
	
	JLabel[] content_lb;
	JLabel totalPrice_lb;
	
	public CafeRemoveButtonListener(JLabel[] content_lb, JLabel totalPrice_lb) {
		this.content_lb = content_lb;
		this.totalPrice_lb = totalPrice_lb;
	} // end of constructor
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<content_lb.length;i++) {
			
			
		} // for
		
	}
	
} // end of class
