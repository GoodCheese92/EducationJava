package ex2_map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
		// Map : Ű(key)�� ��(value)�� ��� �ϳ��� �����ͷ� �����Ѵ�.
		// Ű ���� ���ؼ� ����� �ٷ� ã�� �˻��ϹǷ� ���� ���� ������ �߿��� ���ϴ� ���� ã�Ƴ��µ�
		// �ſ� �پ ������ �����Ѵ�.
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 100);
		map.put(2, 300);
		map.put(4, 320);
		map.put(3, 100);

		// map ������ key�� �ߺ��� ������� �ʴ´�.
		map.put(2, 500);
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println("----------------------");
		
		// 320�� �ʿ��ϴٸ�... 4��� �̸��� ���谡 �ʿ��ϴ�.
		int res = map.get(4);
		System.out.println(res);
		
		System.out.println("----------------------");
		
		// map��ü�� key�� �� 1�� ���ԵǾ� �ִٸ�  true 
		if(map.containsKey(1)) {
			System.out.println(map.get(1));
		}
		
		// map��ü�� value�� �� 500�� ���ԵǾ� �ִٸ�  true 
		if(map.containsValue(500)) {
			System.out.println("map�� ��򰡿� 500�� ����Ǿ� �ִ�.");
		}
		
		System.out.println("-----------------------");
		
		// Ű ���� 2�� ������ ����
		map.remove(2);
		System.out.println(map);
		
		map.clear();	// map�� ��� ������ ����
		System.out.println(map.size());
		
		
		
		
	} // end of main
} // end of class
