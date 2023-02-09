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

public class SaveCoffeeObject {
	public static void main(String[] args) {
		// �п�
		File file = new File(CoffeePath.PATH + "/Coffee");
		File file2 = new File(CoffeePath.PATH + "/Drink");
		// ��
//		File file = new File(
//				"D:\\��������\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/Coffee");

		File[] arrFile = file.listFiles();
		File[] arrFile2 = file2.listFiles();

		// ���� �̸��� ArrayList�� ���� - ���߿� ���� �о�� �� ���� ����
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

		// ���Ͽ� ����� ���� �о�ͼ� ��ü�� ����(Ŀ��) ---------------------------------
		for (int i = 0; i < coffeeFileName.size(); i++) {
			// �� ��ü���� �޸� �Ҵ�
			coffee[i] = new CoffeeProperties();

			// coffee �̸�, �������� �о����
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

			// �������� �о����
			FileInputStream fis = null;
			BufferedInputStream bis = null;

			// �п�
			File img_file = new File(CoffeePath.PATH + "\\Coffee\\" + coffeeFileName.get(i) + ".jpg");
			// ��
//			File img_file = new File("D:\\��������\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo\\Coffee/" + coffeeFileName.get(i) + ".jpg");
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

		// ���Ͽ� ����� ���� �о�ͼ� ��ü�� ����(drink) ---------------------------------
		for (int i = 0; i < drinkFileName.size(); i++) {
			// �� ��ü���� �޸� �Ҵ�
			drink[i] = new CoffeeProperties();

			// coffee �̸�, �������� �о����
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

			// �������� �о����
			FileInputStream fis2 = null;
			BufferedInputStream bis2 = null;

			// �п�
			File img_file2 = new File(CoffeePath.PATH + "\\Drink\\" + drinkFileName.get(i) + ".jpg");
			// ��
//						File img_file = new File("D:\\��������\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo\\Coffee/" + coffeeFileName.get(i) + ".jpg");
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

		// Ȯ�ο� -------
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
		// ------------- Ȯ�� ��

		// �п�
		File objectFile_ice_coffee = new File(CoffeePath.PATH + "/CoffeeObjectSave(Ice)/");
		File objectFile_hot_coffee = new File(CoffeePath.PATH + "/CoffeeObjectSave(Hot)/");
		// ��
//		File objectFile = new File("D:\\��������\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/CoffeeObjectSave/");

		// ��ü ���� (Ŀ��)
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		if (!objectFile_ice_coffee.exists() || !objectFile_hot_coffee.exists()) {
			objectFile_ice_coffee.mkdirs();
			objectFile_hot_coffee.mkdirs();
		} else {
			System.out.println("�����մϴ�.");
		}

		try {

			for (int i = 0; i < coffee.length; i++) {
				if (coffee[i].getName().contains("(Ice)")) {
					fos = new FileOutputStream(objectFile_ice_coffee + "/" + coffee[i].getName() + ".save");
				} else if (coffee[i].getName().contains("(Hot)")) {
					fos = new FileOutputStream(objectFile_hot_coffee + "/" + coffee[i].getName() + ".save");
				}
				oos = new ObjectOutputStream(fos);

				oos.writeObject(coffee[i]);
			}
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

		// �п�
		File objectFile_ice_drink = new File(CoffeePath.PATH + "/DrinkObjectSave(Ice)/");
		File objectFile_hot_drink = new File(CoffeePath.PATH + "/DrinkObjectSave(Hot)/");
		// ��
//		File objectFile = new File("D:\\��������\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/CoffeeObjectSave/");

		// ��ü ���� (����)
		FileOutputStream fos2 = null;
		ObjectOutputStream oos2 = null;

		if (!objectFile_ice_drink.exists() || !objectFile_hot_drink.exists()) {
			objectFile_ice_drink.mkdirs();
			objectFile_hot_drink.mkdirs();
		} else {
			System.out.println("�����մϴ�.");
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
