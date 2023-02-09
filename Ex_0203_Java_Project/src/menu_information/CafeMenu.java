package menu_information;

import java.util.ArrayList;

public class CafeMenu {
	private ArrayList<String> menuCategory = new ArrayList<String>();

	public ArrayList<String> getMenuCategory() {
		return menuCategory;
	}

	public void setMenuCategory(ArrayList<String> menuCategory) {
		this.menuCategory = menuCategory;
	}

	public CafeMenu() {
		menuCategory.add("커피(HOT)");
		menuCategory.add("커피(ICE)");
		menuCategory.add("음료(HOT)");
		menuCategory.add("음료(ICE)");
	} // end of constructor
	
	public String clickButton(CoffeeProperties coffee) {
		String name = coffee.getName();
		
		String price = Integer.toString(coffee.getPrice());
		
		return name + price;
	} // end of clickButton()
	
	
	

} // end of class
