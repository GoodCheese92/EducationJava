package menu_information;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JLabel;

public class CafeButtonClickListener implements ActionListener {

	int key;
	
	int count = 1;
	
	JLabel[] content_lb;
	
	private int total_price = 0;
	
	public int getTotal_price() {
		return total_price;
	}
	
	JLabel total_label;
	HashMap<Integer, CoffeeProperties> hm_coffee;

	public CafeButtonClickListener(int key, HashMap<Integer, CoffeeProperties> hm_coffee, JLabel[] content_lb, JLabel total_label) {
		this.key = key;
		this.hm_coffee = hm_coffee;
		this.content_lb = content_lb;
		this.total_label = total_label;
	} // end of constructor
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<content_lb.length/3; i++) {
			if(content_lb[i*3].getText().equals(" ") || content_lb[i*3].getText() == null) {
				content_lb[i*3].setText(hm_coffee.get(key).getName());
				content_lb[i*3+1].setText(Integer.toString(count)+"개");
				content_lb[i*3+2].setText(Integer.toString(hm_coffee.get(key).getPrice()) + "원");
				content_lb[i*3].repaint();
				content_lb[i*3+1].repaint();
				content_lb[i*3+2].repaint();
				// 현재 label에 써져 있는 금액
				String present_price = total_label.getText().substring(total_label.getText().indexOf("총 : ")+4, total_label.getText().indexOf("원"));
				total_price = Integer.parseInt(present_price) + hm_coffee.get(key).getPrice();
				total_label.setText("총 : " + Integer.toString(total_price)+"원");
				total_label.repaint();
				break;
			} else if(content_lb[i*3].getText().equals(hm_coffee.get(key).getName())){
				content_lb[i*3+1].setText(Integer.toString(++count)+"개");
				content_lb[i*3+2].setText(Integer.toString(hm_coffee.get(key).getPrice()*count)+"원");
				content_lb[i*3].repaint();
				content_lb[i*3+1].repaint();
				content_lb[i*3+2].repaint();
				// 현재 label에 써져 있는 금액
				String present_price = total_label.getText().substring(total_label.getText().indexOf("총 : ")+4, total_label.getText().indexOf("원"));
				total_price = Integer.parseInt(present_price) + hm_coffee.get(key).getPrice();
				total_label.setText("총 : " + Integer.toString(total_price)+"원");
				total_label.repaint();
				break;
			} else {
				System.out.println("오류");
			}
			
		} // for
		
	} // end of actionPerformed(ActionEvent e)
	
	public int totalPriceGet() {
		
		
		return total_price;
	} // end of totalPriceGet()

} // end of class
