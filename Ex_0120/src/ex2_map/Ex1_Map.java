package ex2_map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
		// Map : 키(key)와 값(value)을 묶어서 하나의 데이터로 저장한다.
		// 키 값을 통해서 밸류를 바로 찾아 검색하므로 많은 양의 데이터 중에서 원하는 값을 찾아내는데
		// 매우 뛰어난 성능을 발휘한다.
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 100);
		map.put(2, 300);
		map.put(4, 320);
		map.put(3, 100);

		// map 구조는 key의 중복은 허용하지 않는다.
		map.put(2, 500);
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println("----------------------");
		
		// 320이 필요하다면... 4라는 이름의 열쇠가 필요하다.
		int res = map.get(4);
		System.out.println(res);
		
		System.out.println("----------------------");
		
		// map객체의 key값 중 1이 포함되어 있다면  true 
		if(map.containsKey(1)) {
			System.out.println(map.get(1));
		}
		
		// map객체의 value값 중 500이 포함되어 있다면  true 
		if(map.containsValue(500)) {
			System.out.println("map의 어딘가에 500이 저장되어 있다.");
		}
		
		System.out.println("-----------------------");
		
		// 키 값이 2인 공간을 삭제
		map.remove(2);
		System.out.println(map);
		
		map.clear();	// map의 모든 데이터 삭제
		System.out.println(map.size());
		
		
		
		
	} // end of main
} // end of class
