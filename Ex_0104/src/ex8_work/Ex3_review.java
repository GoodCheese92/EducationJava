package ex8_work;

public class Ex3_review {
	public static void main(String[] args) {
		// 1. 별 순서대로 짓기
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		int a = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("* ");
			}
			a++;
			System.out.println();
		}

		System.out.println("----------------------");
		// 2. 별 집 짓기
//			  *
//			* * *
//		  * * * * *
//		* * * * * * *
		int b = 5;
		for(int i=0; i<5; i++) {
			for(int j=0; j<b; j++) {
				if((i+j)<4) {
					System.out.print("  ");
				}else {
					System.out.print("* ");									
				}
			} // inner
			System.out.println();
			b++;
		} // outer
		
		System.out.println("-------------------------------------");
		
		// 3. 숫자 순서대로 출력
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// ....
		// 10 9 8 7 6 5 4 3 2 1
		int c = 1;
		for(int i=1; i<=10; i++) {
			for(int j = c; j<=(c+9); j++) {
				if(j<=10) {
					System.out.print(j+" ");					
				} else {
					System.out.print(j%10+" ");
				}
			}
			System.out.println();
			c++;
		}

	} // end of main
} // end of class
