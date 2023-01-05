package problem;

public class Study_230104_chapter4 {
	public static void main(String[] args) {
		// 4-1 다음의 문장을 조건식으로 표현하라.
		System.out.println("=====4-1=====");
		// 1) int x
		int x = 0;
		if (10 < x && x < 20) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 2) char 공백
		char ch = 'A';
		if (ch != ' ' || ch != '\t') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 3) char 'x', 'X'
		if (ch == 'x' || ch == 'X') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 4) char '0'
		if (ch >= 48 & ch <= 57) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 5) char 대문자, 소문자
		if (ch >= 65 && ch <= 90) {
			System.out.println(ch + " : 대문자");
		} else if (ch >= 97 && ch <= 122) {
			System.out.println(ch + " : 소문자");
		} else {
			System.out.println("알파벳이 아닙니다.");
		}
		// 6) year 400으로 나눠 떨어지는 것
		int year = 0;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 7) powerOn false
		boolean powerOn = false;
		if (!(powerOn)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 8) str "yes"
		String str = "";
		if (str.equals("yes")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// 4-2 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		System.out.println("=====4-2=====");
		int sum2 = 0;

		for (int i = 1; i < 21; i++) {
			if (i % 2 != 0 || i % 3 != 0)
				sum2 += i;
		}
		System.out.println(sum2);

		// 4-3 1+(1+2)+(1+2+3)+....
		System.out.println("=====4-3=====");
		int sum3 = 0;
		for (int i = 0; i < 11; i++) {
			sum3 += i;
		}
		System.out.println(sum3);

		// 4-4 1+(-2)+3+(-4)+..., 총합이 100 이상이 될 때 출력
		System.out.println("=====4-4=====");
		int sum4 = 0;
		int n = 0;
		for (int i = 1; sum4 < 100; i++) {
			if (i % 2 == 1) {
				n = i;
			} else {
				n = i * -1;
			}
			sum4 += n;
		} // for
		System.out.println(n + "일 때, 합은 : " + sum4);

		// 4-5 for문을 while문으로 변경
		System.out.println("=====4-4=====");
		int i5 = 0;
		int j5 = 0;
		while (i5 <= 10) {
			while (j5 <= i5) {
				System.out.print("*");
				j5++;
			}
			System.out.println();
			j5 = 0;
			i5++;
		} // end while

		// 4-6 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.println("주사위 1 : " + i + ", 주사위 2 : " + j);
				}
			}
		} // end of for

		// 4-7 Math.random()을 이용 1~6 사이 출력
		System.out.println("=====4-7=====");
		int value7 = (int) Math.random() * 6;
		System.out.println("value : " + value7);

		// 4-8 2x+4y=10의 모든 해를 구하시오.
		System.out.println("=====4-8=====");
		for (int x8 = 0; x8 < 11; x8++) {
			for (int y8 = 0; y8 < 11; y8++) {
				if (x8 * 2 + y8 * 4 == 10) {
					System.out.println("x = " + x8 + ", y = " + y8);
				}
			}
		}

		// 4-9 숫자로 이루어진 문자열 str, 각 자리 숫자의 합 구하기
		System.out.println("=====4-9=====");
		String str9 = "156156";
		int sum9 = 0;

		for (int i = 0; i < str9.length(); i++) {
			sum9 += Character.getNumericValue(str9.charAt(i));
			System.out.print(str9.charAt(i) + " ");
		}

		System.out.println("sum = " + sum9);
		
		// 4-10 int 타입의 num의 각 자리 숫자 합
		System.out.println("=====4-10=====");
		int num10 = 12345;
		int sum10 = 0;
		for(int i = 1; num10 <10; i *= 10) {
			sum10 += num10%10;
			System.out.print(sum10+" ");
			num10 = num10/10;
			System.out.print(num10+"<- 나머지 ");
		}
		System.out.println(sum10);
		
		
		
	} // main
} // end of class
