package menu_information;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import path.ProjectMyPath;

public class ThisWeekMenu {
	private String upper_name[] = { "날짜", "조식", "중식", "석식" };
	private String day_of_week[] = { "월", "화", "수", "목", "금" };
	private String lunch_name[] = { "<html>s<br>s<br>s<br>s<br>s</html>", "치킨", "피자", "회", "돈까스" };
	private String dinner_name[] = { "소주", "맥주", "막걸리", "와인", "위스키" };

	private int price = 10000;

	public String[] getLunch_name() {
		return lunch_name;
	}

	public void setLunch_name(String[] lunch_name) {
		this.lunch_name = lunch_name;
	}

	public String[] getDinner_name() {
		return dinner_name;
	}

	public void setDinner_name(String[] dinner_name) {
		this.dinner_name = dinner_name;
	}

	public String[] getUpper_name() {
		return upper_name;
	}

	public void setUpper_name(String[] upper_name) {
		this.upper_name = upper_name;
	}

	public String[] getDay_of_week() {
		return day_of_week;
	}

	public void setDay_of_week(String[] day_of_week) {
		this.day_of_week = day_of_week;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private ArrayList<String> breakfast = new ArrayList<String>();
	ArrayList<String> lunch = new ArrayList<String>();
	private ArrayList<String> dinner = new ArrayList<String>();

	public ArrayList<String> getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(ArrayList<String> breakfast) {
		this.breakfast = breakfast;
	}

	public ArrayList<String> getLunch() {
		return lunch;
	}

	public void setLunch(ArrayList<String> lunch) {
		this.lunch = lunch;
	}

	public ArrayList<String> getDinner() {
		return dinner;
	}

	public void setDinner(ArrayList<String> dinner) {
		this.dinner = dinner;
	}

	String path = ProjectMyPath.path + "Ex_0203_Java_Project/src/menu_information/menuFile/";
	File file = new File(path);

	public void menuGet(String filename) {
		path += filename;
		file = new File(path);
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			if (file.exists()) {
				String str = "";

				while ((str = br.readLine()) != null) {
					System.out.println(str);
					breakfast.add(str.substring(str.indexOf("fast=") + 5, str.indexOf("lunch")));
					lunch.add(str.substring(str.indexOf("lunch=") + 6, str.indexOf("dinner")));
					dinner.add(str.substring(str.indexOf("dinner=") + 7, str.length()));
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		System.out.println(breakfast);
		System.out.println(lunch);
		System.out.println(dinner);

	} // end of menuGet()

	public void menuSave(String filename) {
		if (!file.exists()) {
			file.mkdirs();
		}
		path += filename;
		file = new File(path);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(path);
			bw = new BufferedWriter(fw);

		} catch (Exception e) {
			// TODO: handle exception
		}

	} // end of menuSave()

} // end of class
