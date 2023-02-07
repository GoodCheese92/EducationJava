package menu_information;

import java.util.ArrayList;

public class CafeMenu {
	private ArrayList<String> menuCategory = new ArrayList<String>();
	private ArrayList<String> coffee = new ArrayList<String>();
	private ArrayList<String> drink = new ArrayList<String>();
	
	public ArrayList<String> getCoffee() {
		return coffee;
	}

	public void setCoffee(ArrayList<String> coffee) {
		this.coffee = coffee;
	}

	public ArrayList<String> getDrink() {
		return drink;
	}

	public void setDrink(ArrayList<String> drink) {
		this.drink = drink;
	}

	public ArrayList<String> getMenuCategory() {
		return menuCategory;
	}
	
	public void setMenuCategory(ArrayList<String> menuCategory) {
		this.menuCategory = menuCategory;
	}
	
	public CafeMenu() {
		menuCategory.add("Ŀ��(HOT)");
		menuCategory.add("Ŀ��(ICE)");
		menuCategory.add("����(HOT)");
		menuCategory.add("����(ICE)");
	} // end of constructor
	
	
	
	
	
} // end of class

