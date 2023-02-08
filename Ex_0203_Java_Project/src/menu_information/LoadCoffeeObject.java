package menu_information;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadCoffeeObject {

	// 학원
//	File file = new File(
//			"C:\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo\\CoffeeObjectSave");
	// 집
	File file = new File(
			"D:\\국비지원\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo\\CoffeeObjectSave");

	private CoffeeProperties[] coffee = new CoffeeProperties[file.list().length];
	
	public CoffeeProperties[] getCoffee() {
		return coffee;
	}
	
	public void setCoffee(CoffeeProperties[] coffee) {
		this.coffee = coffee;
	}
	
	// 생성자
	public LoadCoffeeObject() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		for (int i = 0; i < coffee.length; i++) {
			coffee[i] = new CoffeeProperties();

//			System.out.println(file.list()[i]);
			try {
				fis = new FileInputStream(file + "\\" + file.list()[i]);
				// bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(fis);

				coffee[i] = (CoffeeProperties) ois.readObject();

			} catch (Exception e) {
				e.printStackTrace();

			} finally {
				try {
					ois.close();
					// bis.close();
					fis.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} // for
		System.out.println(coffee[0].getName());
	} // end of constructor

} // end of class
