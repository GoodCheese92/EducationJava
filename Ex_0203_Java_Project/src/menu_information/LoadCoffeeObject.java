package menu_information;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadCoffeeObject {

	File file = new File(
			"C:\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo\\CoffeeObjectSave");

	CoffeeProperties[] coffee = new CoffeeProperties[file.list().length];

	public LoadCoffeeObject(CoffeeProperties[] coffee) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		for (int i = 0; i < coffee.length; i++) {
			coffee[i] = new CoffeeProperties();

			System.out.println(file.list()[i]);
			try {
				fis = new FileInputStream(file + "\\" + file.list()[i]);
				//bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(fis);
				
				coffee[i] = (CoffeeProperties) ois.readObject();

			} catch (Exception e) {
				e.printStackTrace();

			} finally {
				try {
					ois.close();
					//bis.close();
					fis.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} // for
	} // end of constructor

	public static void main(String[] args) {
		CoffeeProperties[] coffee = new CoffeeProperties[10];
		LoadCoffeeObject lco = new LoadCoffeeObject(coffee);
		System.out.println(lco.file.list().length);
	}
} // end of class
