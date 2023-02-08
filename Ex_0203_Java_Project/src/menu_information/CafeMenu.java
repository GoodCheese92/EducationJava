package menu_information;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.ImageIcon;

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
		menuCategory.add("커피(HOT)");
		menuCategory.add("커피(ICE)");
		menuCategory.add("음료(HOT)");
		menuCategory.add("음료(ICE)");
	} // end of constructor

	// coffee_pp 객체에 파일 정보읽어오기
	public CoffeeProperties readInfo(CoffeeProperties coffee, String path, String filename) {
		FileReader fr = null;
		BufferedReader br = null;
		File file1 = new File(path + "/" + filename + ".txt"); 
		
		try {
			if(file1.exists()) {
				fr = new FileReader(file1);
				br = new BufferedReader(fr);
				
				String str = "";
				while((str = br.readLine()) != null) {
					switch (str.charAt(0)) {
					case '1':
						coffee.setName(str.substring(3));
						break;
					case '2':
						coffee.setExplain(str.substring(3));
						break;
					}
				} // while
			} else {
				System.out.println("파일을 찾을 수 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		File file2 = new File(path + "/" + filename + ".jpg");
		byte[] br_read = new byte[(int)file2.length()];
		ImageIcon icon = null;
		
		try {
			if(file2.exists()) {
				fis = new FileInputStream(path + "/" + filename + ".jpg");
				bis = new BufferedInputStream(fis);
				
				bis.read(br_read);
				icon = new ImageIcon(br_read);
				icon = setImageSize(icon, 200, 200);
				coffee.setImgicon(icon);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return coffee;
	} // end of readInfo()
	
	public ImageIcon setImageSize(ImageIcon icon, int width, int height) {
		Image img1 = icon.getImage();
		Image img2 = img1.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		ImageIcon icon_res = new ImageIcon(img2);
		
		return icon_res;
	} // end of setImageSize()
	
	File coffeeMenuInfo_file = new File(CoffeePath.PATH);
	CoffeeProperties[] coffee_pp = new CoffeeProperties[100];

} // end of class
