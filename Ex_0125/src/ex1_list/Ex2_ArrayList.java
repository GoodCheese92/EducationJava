package ex1_list;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("장비");
		sList.add("전위");
		sList.add("황충");
		sList.add("길동");
		sList.add("조조");

		System.out.println(sList);

		sList.add(0, "유비");
		sList.add(1, "관우");
		sList.remove(3);
		sList.remove(3);
		sList.remove(3);
		sList.add("조운");

		System.out.println(sList);

	} // end of main
} // end of class
