package test_ttt;

import menu_information.ThisWeekMenu;

public class TestReader {
	public static void main(String[] args) {
		ThisWeekMenu twk = new ThisWeekMenu();
		twk.menuGet("2월 1주차 메뉴.txt");
		
		String str = "date=2/6(월)breakfast=-lunch=라면dinner=소주";
		System.out.println(str.substring(str.indexOf("date=") + 5, str.indexOf("break")));
		
	} // end of main
} // end of class
