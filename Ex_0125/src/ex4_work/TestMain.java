package ex4_work;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		
		System.out.println(list);
		
		list.remove("aaa");
		System.out.println(list);
		
		list.remove("aaa");
		list.remove("bbb");
		list.remove("ccc");
		System.out.println(list);
		System.out.println(list.size());
		
		
		
		
	} // end of main
} // end of class
