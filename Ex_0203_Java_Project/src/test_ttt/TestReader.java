package test_ttt;

import menu_information.ThisWeekMenu;

public class TestReader {
	public static void main(String[] args) {
		ThisWeekMenu twk = new ThisWeekMenu();
		twk.menuGet("2�� 1���� �޴�.txt");
		
		String str = "date=2/6(��)breakfast=-lunch=���dinner=����";
		System.out.println(str.substring(str.indexOf("date=") + 5, str.indexOf("break")));
		
	} // end of main
} // end of class
