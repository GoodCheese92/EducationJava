package menu_information;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import path.ProjectMyPath;

public class LoadCoffeeObject {

	private CoffeeProperties[] coffee;

	private CoffeeProperties[] drink;
	
	public CoffeeProperties[] getDrink() {
		return drink;
	}

	public void setDrink(CoffeeProperties[] drink) {
		this.drink = drink;
	}

	public CoffeeProperties[] getCoffee() {
		return coffee;
	}

	public void setCoffee(CoffeeProperties[] coffee) {
		this.coffee = coffee;
	}

	File file;

	// 생성자
	public LoadCoffeeObject(String path) {
		// 학원
//		file = new File(
//				ProjectMyPath.path + "/Ex_0203_Java_Project/src/menu_information/CafeMenuInfo" + "/" + path);
		// 집
		file = new File(
				ProjectMyPath.path + "/Ex_0203_Java_Project/src/menu_information/CafeMenuInfo" + "/" + path);

		
		
		if(path.contains("CoffeeObject")) {
			coffee = new CoffeeProperties[file.list().length];
			loadCoffeeObject();
		} else if(path.contains("DrinkObject")){
			drink = new CoffeeProperties[file.list().length];
			loadDrinkObject();
		}

	} // end of constructor

	public void loadCoffeeObject() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		for (int i = 0; i < coffee.length; i++) {
			coffee[i] = new CoffeeProperties();

			try {
				fis = new FileInputStream(file + "\\" + file.list()[i]);
				ois = new ObjectInputStream(fis);

				coffee[i] = (CoffeeProperties) ois.readObject();

			} catch (Exception e) {
				e.printStackTrace();

			} finally {
				try {
					ois.close();
					fis.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} // for
	} // end of loadCoffeeObject()
	
	public void loadDrinkObject() {
		FileInputStream fis2 = null;
		ObjectInputStream ois2 = null;

		for (int i = 0; i < drink.length; i++) {
			drink[i] = new CoffeeProperties();

			try {
				fis2 = new FileInputStream(file + "\\" + file.list()[i]);
				ois2 = new ObjectInputStream(fis2);

				drink[i] = (CoffeeProperties) ois2.readObject();

			} catch (Exception e) {
				e.printStackTrace();

			} finally {
				try {
					ois2.close();
					fis2.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} // for
	} // end of loadDrinkObject()

} // end of class
