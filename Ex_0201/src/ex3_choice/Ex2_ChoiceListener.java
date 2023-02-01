package ex3_choice;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex2_ChoiceListener implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		String str = (String)e.getItem();
		System.out.println(str);
		
	}
	
	
	
} // end of class
