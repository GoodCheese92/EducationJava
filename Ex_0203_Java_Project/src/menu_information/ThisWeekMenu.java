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

	public String[] getUpper_name() {
		return upper_name;
	}

	public void setUpper_name(String[] upper_name) {
		this.upper_name = upper_name;
	}

	private ArrayList<String> date = new ArrayList<String>();
	private ArrayList<String> breakfast = new ArrayList<String>();
	private ArrayList<String> lunch = new ArrayList<String>();
	private ArrayList<String> dinner = new ArrayList<String>();

	public ArrayList<String> getDate() {
		return date;
	}

	public void setDate(ArrayList<String> date) {
		this.date = date;
	}

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
//					System.out.println(str);
					date.add(str.substring(str.indexOf("date=") + 5, str.indexOf("breakfast")));
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
