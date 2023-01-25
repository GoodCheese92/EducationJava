package ex1_list;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		// ArrayList : 다른 컬렉션 개체들과 같이 size가 정해져 있지 않다.
		// index 구조로 접근이 가능하여 목록 조회등이나 객체 관리가 편리
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(20);
		
		// 특정 index에 값을 채워넣는 것이 가능
		list.add(1, 50);
		
		// set을 통해 특정 index의 값을 수
		list.set(2, 200);
		
		// 1번 index의 값을 삭제
		list.remove(1);
		
		// 존재하지 않는 index로 접근하는 것은 불가능!!
		// list.add(4, 200);
		
		System.out.println(list);
		System.out.println(list.get(1));	// index가 있기 때문에 개별로 출력하기 용이
		System.out.println("list의 크기 : " + list.size());
		
		System.out.println("-------------------------------------");
		
		// list의 모든 내용을 for문으로 출력하기.
		for(int i=0;i<list.size(); i++) {
			System.out.printf("%d ", list.get(i));
		}
		
		System.out.println();
		
		// 리스트 완전삭제
		list.clear();
		System.out.println(list);
		
		
		
	} // end of main
} // end of class
