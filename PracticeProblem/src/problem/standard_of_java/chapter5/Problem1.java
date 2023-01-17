package problem.standard_of_java.chapter5;

public class Problem1 {
	public static void main(String[] args) {
		// 5-1 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.
		// a
		int[] arr_a[];
		
		// b : 뒤에 쉼표가 붙어 있어도 상관 없다.
		int[] arr_b = {1, 2, 3,};
		
		// c
		int[] arr_c = new int[5];
		
		// d : 선언과 대입을 한 번에 할 수 없다. 만약 하려면 []안에 숫자가 없어야 한다.
		 int[] arr_d;
		 
		 arr_d = new int[] {1, 2, 3, 4, 5};
		
		// e : 자료형이나 변수명 옆에 배열의 크기 선언 X
		//int arr_e[5];
		
		// f
		int[] arr_f[] = new int[3][];
		
		
		
		
	} // end of main
} // end of class
