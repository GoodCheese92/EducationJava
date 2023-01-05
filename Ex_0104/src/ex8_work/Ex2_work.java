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
		
		int s = 11;
		for (int i = 1; i <= s; i++) {
			for (int j = i; j < i+s; j++) {
				if (j <= s) {
					System.out.print(j + " ");
				} else {
					System.out.print((j%s) + " ");
				
				}
			} // inner
			System.out.println();
		} // outer

	} // end of main
} // end of class
