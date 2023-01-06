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
			for (int j = a; j < a + 10; j++) {
				if (j <= 10) {
					System.out.print(j + " ");
				} else {
					System.out.print((j % 10) + " ");
				}
			} // inner
			System.out.println();
			a++;
		} // outer

		System.out.println("------------------------------------");

		// 강사님 코드
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				int num = i + j;
				if (num > 10) {
					num -= 10;
				}
				System.out.print(num + " ");
			} // inner
			System.out.println();
		} // outer

		System.out.println("------------------------------");
		
		// 1부터 n까지의 총 합을 출력하시오.
		// 결과 : 15
		int n = 10;
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);			
		
	} // end of main
} // end of class
