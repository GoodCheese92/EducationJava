package ex1_list;

import java.util.ArrayList;

public class Ex4_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		Ex4_ArrayClass ac = new Ex4_ArrayClass();

		// �Ķ���ͷ� �Ѱ��� ��, �ּҰ��� �ѱ�Ƿ� ���ο����� arr�� ���Ѵ�.
		ac.setArr(arr);

		System.out.println("main : " + arr);

	} // end of main
} // end of class
