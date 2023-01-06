package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// 키보드에서 n1과 n2 변수에 각각 정수 값을 입력받는다.
		// n1부터 n2까지의 합을 출력.
		// 큰 값을 먼저 입력받아도 결과는 같아야 한다.

		// 수1 : 1
		// 수2 : 5
		// 결과 : 15

		// 수1 : 5
		// 수2 : 1
		// 결과 : 15

		Scanner sc = new Scanner(System.in);

		System.out.println("두 수 사이의 합을 구하시오.");
		System.out.print("수1(정수)을 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.print("수2(정수)을 입력하세요 : ");
		int n2 = sc.nextInt();

		int sum = 0;

		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				sum += i;
			}
		} else if (n1 > n2) {
			for (int i = n2; i <= n1; i++) {
				sum += i;
			}
		} else {
			sum = n1;
		}

		System.out.println("총 합은 : " + sum);

		System.out.println("---------------------------------");
		
		// 방법 2
		System.out.print("수1(정수)을 입력하세요. : ");
		n1 = sc.nextInt();
		System.out.print("수2(정수)을 입력하세요. : ");
		n2 = sc.nextInt();
		
		int temp = 0;
		sum = 0;
		
		if(n1 > n2) {
			temp = n1;
			n1 = n2;
			n2 = temp;			
		}
		for(int i=n1; i<=n2; i++) {
			sum += i;
		}
		
		System.out.println("총 합은 : "+sum);
		
		System.out.println("----------------------------------");
		
		// 강사님 코드
		System.out.print("수1 : ");
		n1 = sc.nextInt();
		System.out.print("수2 : ");
		n2 = sc.nextInt();
		
		int result = 0;
		
		// 변수간의 값 교환
		// 임시 변수를 하나 만들어서 진행
		if(n1>n2) {	
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		for(int i = n1; i<=n2; i++) {
			result += i;
		}
		
		System.out.println("결과 : "+result);
		
		
		
	} // end of main
} // end of class
