package ex1_list;

import java.util.ArrayList;

public class Ex4_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		Ex4_ArrayClass ac = new Ex4_ArrayClass();

		// 파라미터로 넘겼을 때, 주소값을 넘기므로 메인에서도 arr이 변한다.
		ac.setArr(arr);

		System.out.println("main : " + arr);

	} // end of main
} // end of class
