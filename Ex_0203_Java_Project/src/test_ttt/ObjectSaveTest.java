package test_ttt;

import menu_information.CafeMenu;
import menu_information.CoffeePath;
import menu_information.CoffeeProperties;

public class ObjectSaveTest {
	public static void main(String[] args) {
		CoffeeProperties[] cpp = new CoffeeProperties[100];
		CafeMenu cm = new CafeMenu();
		cpp[0] = new CoffeeProperties();
		
		cm.readInfo(cpp[0], CoffeePath.PATH, "아메리카노(Ice)");
		System.out.println(cpp[0].getName());
		System.out.println(cpp[0].getExplain());
		System.out.println(cpp[0].getImgicon());
		
		
	} // end of main
} // end of class
