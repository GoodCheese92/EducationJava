package ex8_work;

public class Ex2_work {
	public static void main(String[] args) {
		// 3. 2중 for문을 사용하여 아래의 결과를 도출하시오.

		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// ....................
		// 10 1 2 3 4 5 6 7 8 9

		// 총 100개의 숫자를 출력하시오
		int a = 1;
		
		for (int i = 1; i <= 10; i++) {
			for (int j = a; j < a+10; j++) {
				if (j <= 10) {
					System.out.print(j + " ");
				} else {
					System.out.print((j%10) + " ");
				
				}
			} // inner
			System.out.println();
			a++;			
		} // outer

	} // end of main
} // end of class
