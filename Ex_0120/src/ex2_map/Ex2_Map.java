package ex2_map;

import java.util.Collection;
import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String, Character> map = new HashMap<String, Character>();
		map.put("k1", '가');
		map.put("k3", 'A');
		map.put("k2", 'B');
		map.put("k4", (char)65);
		
		System.out.println(map);
		
		// Map -> 배열
		// Collection의 제너릭에는 map의 value값의 자료형을 넣어줘야 한다.
		Collection<Character> values = map.values();	// map의 value 값들을 순서없이 저장한다.
		Character[] arr = values.toArray(new Character[0]); // values에 있는 값들을 배열로 저장한다.
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		// map에서 B라는 값을 얻고 싶다면..
		char res = map.get("k2");
		System.out.println("k2로 얻어온 값 : " + res);
		
	} // end of main
} // end of class
