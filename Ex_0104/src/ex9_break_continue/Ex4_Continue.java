package ex9_break_continue;

public class Ex4_Continue {
	public static void main(String[] args) {
		int n = 0;
		while (n < 5) {
			n++;

			if (n % 2 == 0) {
				// while문 내부의 continue는 가장 가까운 while문의 조건식으로 건너뛴다.
				continue;
			}

			System.out.println(n);
		}

		int num = 0;

		for (num = 0; num < 3; num++) {
			switch (num) {
			case 0:
				System.out.println("0이야");
				continue; 	// switch문에서는 continue를 사용 불가.
						  	// 단, 반복문 안에서 switch문에서는 continue가 사용 가능하다.-> 반복문의 조건식으로 건너뛴다. 
			case 1:
				System.out.println("1이야");
				continue;
			}
		}
		
		
	} // end of main
} // end of class
