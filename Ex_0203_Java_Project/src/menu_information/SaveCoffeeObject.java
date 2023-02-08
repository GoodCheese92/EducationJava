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
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class SaveCoffeeObject {
	public static void main(String[] args) {
		File file = new File(CoffeePath.PATH + "/Coffee");

		File[] arrFile = file.listFiles();

		// ���� �̸��� ArrayList�� ���� - ���߿� ���� �о�� �� ���� ����
		ArrayList<String> coffeeFileName = new ArrayList<String>();
		;
		for (int i = 0; i < arrFile.length; i++) {
			if (arrFile[i].isFile() && arrFile[i].getName().contains(".txt")) {
				coffeeFileName.add(arrFile[i].getName().substring(0, arrFile[i].getName().length() - 4));
			}
		} // for

		CoffeeProperties[] coffee = new CoffeeProperties[arrFile.length / 2];

		// ���Ͽ� ����� ���� �о�ͼ� ��ü�� ���� ---------------------------------
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

			File img_file = new File(CoffeePath.PATH + "\\Coffee\\" + coffeeFileName.get(i) + ".jpg");
			byte[] img_read = new byte[(int) img_file.length()];
			try {
				fis = new FileInputStream(img_file);
				bis = new BufferedInputStream(fis);
				bis.read(img_read);
				ImageIcon icon = new ImageIcon(img_read);
				SaveCoffeeObject method = new SaveCoffeeObject();
				icon = method.changeIconSize(icon, 250, 200);

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

		for (int i = 0; i < coffee.length; i++) {
			System.out.print(coffee[i].getName());
			System.out.println(" : " + coffee[i].getExplain());
			System.out.println("-------------------------------------");
		}

		File objectFile = new File(CoffeePath.PATH + "/CoffeeObjectSave/");

		// ��ü ����
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			if (!objectFile.exists()) {
				objectFile.mkdirs();
			} else {
				System.out.println("�����մϴ�.");
			}

			for (int i = 0; i < coffee.length; i++) {
				fos = new FileOutputStream(CoffeePath.PATH + "/CoffeeObjectSave/" + coffee[i].getName() + ".save");
				//bos = new BufferedOutputStream(fos);
				oos = new ObjectOutputStream(fos);

				oos.writeObject(coffee[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				//bos.close();
				fos.close();
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

} // end of class
