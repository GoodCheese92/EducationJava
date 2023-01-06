package ex2_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		// 배열 : '같은 자료형'끼리 모아둔 하나의 묶음
		// 효율적인 자료관리를 위해 '반드시' 알고 있어야 하는 개념
		
		// 자바에서 쓰는 메모리 종류 : stack, heap
		// new라는 코드를 쓰면 heap 메모리에 생성된다.
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		
		// 1) 배열 선언
		int[] arr;			// stack에 메모리 할당
		
		// 2) 배열 생성
		arr = new int[5];	// heap에 방 4개(index 0~3)짜리 메모리 할당
		
		// 3) 배열 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		// 배열에 존재하지 않는 index에는 값을 추가하거나 가져다 쓸 수 없다.
		// arr[4] = 50;		// 없는 index에 대입할 수 없다.
		
		System.out.println(arr);
		
		// 배열의 장점 중 하나는 변수이름을 통일할 수 있다는데 있다.
		
		System.out.println("---------------------------------");
		System.out.println("20필요해 : " + arr[0]);
		System.out.println("20필요해 : " + arr[1]);
		System.out.println("20필요해 : " + arr[2]);
		System.out.println("20필요해 : " + arr[3]);
		
		System.out.println("---------------------------------");
		
		// 배열이름.length : 배열의 방 갯수
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------------------------");
		
		// 규칙성이 있는 값들을 대압할 때 for문을 이용하여 쉽게 대입할 수 있다.
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (i + 1) * 100;
			System.out.println(arr[i]);
		}
		
		
		
	} // end of main
} // end of class
