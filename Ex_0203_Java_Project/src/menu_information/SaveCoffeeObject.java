package menu_information;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import path.ProjectMyPath;

public class SaveCoffeeObject {
	public static void main(String[] args) {
		// 학원
//		File file = new File(ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/Coffee");
//		File file2 = new File(ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/Drink");
		// 집
		File file = new File(
				ProjectMyPath.path + "Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/Coffee");
		File file2 = new File(
				ProjectMyPath.path + "Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/Drink");

		File[] arrFile = file.listFiles();
		File[] arrFile2 = file2.listFiles();

		// 파일 이름만 ArrayList에 저장 - 나중에 파일 읽어올 때 쓰기 위함
		ArrayList<String> coffeeFileName = new ArrayList<String>();
		ArrayList<String> drinkFileName = new ArrayList<String>();

		for (int i = 0; i < arrFile.length; i++) {
			if (arrFile[i].isFile() && arrFile[i].getName().contains(".txt")) {
				coffeeFileName.add(arrFile[i].getName().substring(0, arrFile[i].getName().length() - 4));
			}
		} // for

		for (int i = 0; i < arrFile2.length; i++) {
			if (arrFile2[i].isFile() && arrFile2[i].getName().contains(".txt")) {
				drinkFileName.add(arrFile2[i].getName().substring(0, arrFile2[i].getName().length() - 4));
			}
		} // for

		CoffeeProperties[] coffee = new CoffeeProperties[arrFile.length / 2];
		CoffeeProperties[] drink = new CoffeeProperties[arrFile2.length / 2];

		// 파일에 저장된 정보 읽어와서 객체에 대입(커피) ---------------------------------
		for (int i = 0; i < coffeeFileName.size(); i++) {
			// 각 개체마다 메모리 할당
			coffee[i] = new CoffeeProperties();

			// coffee 이름, 관련정보 읽어오기
			FileReader fr = null;
			BufferedReader br = null;

			try {
				fr = new FileReader(file + "/" + coffeeFileName.get(i) + ".txt");
				br = new BufferedReader(fr);

				String info = "";
				while ((info = br.readLine()) != null) {
					switch (info.charAt(0)) {
					case '1':
						coffee[i].setName(info.substring(3));
						break;
					case '2':
						coffee[i].setExplain(info.substring(3));
						break;
					case '3':
						coffee[i].setPrice(Integer.parseInt(info.substring(3)));
					} // switch
				} // while
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
					fr.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

			// 사진정보 읽어오기
			FileInputStream fis = null;
			BufferedInputStream bis = null;

			// 학원
//			File img_file = new File(ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo\\Coffee/"
//+ coffeeFileName.get(i) + ".jpg");
			// 집
			File img_file = new File(
					ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo\\Coffee/"
							+ coffeeFileName.get(i) + ".jpg");
			byte[] img_read = new byte[(int) img_file.length()];
			try {
				fis = new FileInputStream(img_file);
				bis = new BufferedInputStream(fis);
				bis.read(img_read);
				ImageIcon icon = new ImageIcon(img_read);
				SaveCoffeeObject method = new SaveCoffeeObject();
				icon = method.changeIconSize(icon, 250, 170);
				coffee[i].setImgicon(icon);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					bis.close();
					fis.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		} // for ----------------------------------------------------

		// 파일에 저장된 정보 읽어와서 객체에 대입(drink) ---------------------------------
		for (int i = 0; i < drinkFileName.size(); i++) {
			// 각 개체마다 메모리 할당
			drink[i] = new CoffeeProperties();

			// coffee 이름, 관련정보 읽어오기
			FileReader fr2 = null;
			BufferedReader br2 = null;

			try {
				fr2 = new FileReader(file2 + "/" + drinkFileName.get(i) + ".txt");
				br2 = new BufferedReader(fr2);

				String info = "";
				while ((info = br2.readLine()) != null) {
					switch (info.charAt(0)) {
					case '1':
						drink[i].setName(info.substring(3));
						break;
					case '2':
						drink[i].setExplain(info.substring(3));
						break;
					case '3':
						drink[i].setPrice(Integer.parseInt(info.substring(3)));
					} // switch
				} // while
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					br2.close();
					fr2.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

			// 사진정보 읽어오기
			FileInputStream fis2 = null;
			BufferedInputStream bis2 = null;

			// 학원
//			File img_file2 = new File(ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo\\Drink/"
//					+ drinkFileName.get(i) + ".jpg");
			// 집
			File img_file2 = new File(
					ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo\\Drink/"
							+ drinkFileName.get(i) + ".jpg");
			byte[] img_read = new byte[(int) img_file2.length()];
			try {
				fis2 = new FileInputStream(img_file2);
				bis2 = new BufferedInputStream(fis2);
				bis2.read(img_read);
				ImageIcon icon = new ImageIcon(img_read);
				SaveCoffeeObject method = new SaveCoffeeObject();
				icon = method.changeIconSize(icon, 250, 170);
				drink[i].setImgicon(icon);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					bis2.close();
					fis2.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		} // for ------------------------------------------------------------------

		// 확인용 -------
		for (int i = 0; i < coffee.length; i++) {
			System.out.print(coffee[i].getName());
			System.out.println(" : " + coffee[i].getExplain());
			System.out.println("-------------------------------------");
		}

		for (int i = 0; i < drink.length; i++) {
			System.out.print(drink[i].getName());
			System.out.println(" : " + drink[i].getExplain());
			System.out.println("-------------------------------------");
		}
		// ------------- 확인 끝

		// 학원
		File objectFile_ice_coffee = new File(ProjectMyPath.path
				+ "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/CoffeeObjectSave(Ice)/");
		File objectFile_hot_coffee = new File(ProjectMyPath.path
				+ "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/CoffeeObjectSave(Hot)/");
		// 집
//		File objectFile_ice_coffee = new File(ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/CoffeeObjectSave(Ice)/");
//		File objectFile_hot_coffee = new File(ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/CoffeeObjectSave(Hot)/");

		// 객체 저장 (커피)
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		if (!objectFile_ice_coffee.exists() || !objectFile_hot_coffee.exists()) {
			objectFile_ice_coffee.mkdirs();
			objectFile_hot_coffee.mkdirs();
		} else {
			System.out.println("존재합니다.");
		}

		for (int i = 0; i < coffee.length; i++) {
			try {
				if (coffee[i].getName().contains("(Ice)")) {
					fos = new FileOutputStream(objectFile_ice_coffee + "/" + coffee[i].getName() + ".save");
				} else if (coffee[i].getName().contains("(Hot)")) {
					fos = new FileOutputStream(objectFile_hot_coffee + "/" + coffee[i].getName() + ".save");
				}
				oos = new ObjectOutputStream(fos);

				oos.writeObject(coffee[i]);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					oos.close();
					fos.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}

		// 학원
		File objectFile_ice_drink = new File(ProjectMyPath.path
				+ "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/DrinkObjectSave(Ice)/");
		File objectFile_hot_drink = new File(ProjectMyPath.path
				+ "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/DrinkObjectSave(Hot)/");
		// 집
//		File objectFile = new File(ProjectMyPath.path + "\\work\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/CoffeeObjectSave/");
//		File objectFile_ice_drink = new File(ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/DrinkObjectSave(Ice)/");
//		File objectFile_hot_drink = new File(ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/DrinkObjectSave(Hot)/");

		// 객체 저장 (음료)
		FileOutputStream fos2 = null;
		ObjectOutputStream oos2 = null;

		if (!objectFile_ice_drink.exists() || !objectFile_hot_drink.exists()) {
			objectFile_ice_drink.mkdirs();
			objectFile_hot_drink.mkdirs();
		} else {
			System.out.println("존재합니다.");
		}

		try {

			for (int i = 0; i < drink.length; i++) {
				if (drink[i].getName().contains("(Ice)")) {
					fos2 = new FileOutputStream(objectFile_ice_drink + "/" + drink[i].getName() + ".save");
				} else if (drink[i].getName().contains("(Hot)")) {
					fos2 = new FileOutputStream(objectFile_hot_drink + "/" + drink[i].getName() + ".save");
				}
				oos2 = new ObjectOutputStream(fos2);

				oos2.writeObject(drink[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos2.close();
				fos2.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	} // end of main

	public ImageIcon changeIconSize(ImageIcon icon, int width, int height) {
		Image img1 = icon.getImage();
		Image img2 = img1.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		ImageIcon icon_res = new ImageIcon(img2);
		return icon_res;
	} // end of changeIconSize()

	public Image chanegeImg(ImageIcon icon, int width, int height) {
		Image img1 = icon.getImage();
		Image img2 = img1.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return img2;
	} // end of changeImg

} // end of class
