package ex2_map;

import java.util.Collection;
import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String, Character> map = new HashMap<String, Character>();
		map.put("k1", '��');
		map.put("k3", 'A');
		map.put("k2", 'B');
		map.put("k4", (char)65);
		
		System.out.println(map);
		
		// Map -> �迭
		// Collection�� ���ʸ����� map�� value���� �ڷ����� �־���� �Ѵ�.
		Collection<Character> values = map.values();	// map�� value ������ �������� �����Ѵ�.
		Character[] arr = values.toArray(new Character[0]); // values�� �ִ� ������ �迭�� �����Ѵ�.
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		// map���� B��� ���� ��� �ʹٸ�..
		char res = map.get("k2");
		System.out.println("k2�� ���� �� : " + res);
		
	} // end of main
} // end of class
