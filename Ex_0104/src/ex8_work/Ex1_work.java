package ex8_work;

public class Ex1_work {
	public static void main(String[] args) {
		// 1. 2중 for문을 사용하여 아래의 결과를 출력하시오.
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------");

		// 강사님 코딩
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			} // inner
			System.out.println();
		} // outer
		
		System.out.println("----------------------------------");
		// 2. 2중 for문을 사용하여 아래의 결과를 출력하시오. (제일 마지막에 풀 것)
		//         *
		//       * * *
		//     * * * * *
		//   * * * * * * *
		// * * * * * * * * *
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < (5 - i) * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {	// 2n-1 : 별의 개수
				System.out.print("* ");				
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		// 강사님 코드
		// 이중 for문은 행과 열의 개수를 지정하는 것이므로
		// 수학에서의 행렬과 비슷하게 생각하면 알고리즘 등을 푸는데 도움이 될 것 같다.
		// ex) 각 행렬 번호에 맞게 - 좌측 번호는 outer for문의 i가 index역할, 우측 번호는 inner for문의 j가 index역할
		// 행렬과는 반대 같다....
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		// 00 01 02 03 04
		// 10 11 12 13 14
		// 20 21 22 23 24
		// 30 31 32 33 34
		// 40 41 42 43 44
		
		System.out.println("-----------------------------------");
		for(int i=0; i<5; i++) {
			for(int j = 0; j<5+i; j++) {
				if(i + j > 3) {
					System.out.print("* ");					
				} else {
					System.out.print("  ");
				}
				
			} // inner
			System.out.println();
		} // outer
		
		System.out.println("-----------------------------------");
		
		for(int i = 3; i>=0; i--) {
			for(int j=0; j<5+i; j++) {
				if(i + j >3) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			} // inner
			System.out.println();
		} // outer
		
		
		
		
		
		
		
	} // end of main
} // end of class
