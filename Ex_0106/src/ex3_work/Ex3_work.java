package ex3_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 키보드에서 정수 값을 입력받고, 입력받은 숫자가 소수인지 판단하시오.
		// 단, 키보드에서 1을 받았다면 '소수가 아님'을 출력해야 한다.

		// 값 : 5
		// 5은(는) 소수입니다.

		// 값 : 6
		// 6은(는) 소수가 아닙니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 2) {
			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					System.out.println(num + "은(는) 소수가 아닙니다.");
					break;
				} else if (num == (i + 1)) {
					System.out.println(num + "은(는) 소수입니다.");
				}

			}

		} else if (num == 2) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			System.out.println("소수가 아님");
		}

		System.out.println("-------------------------");

		// 강사님 코드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		System.out.print("정수를 입력하세요 : ");
		int n = Integer.parseInt(br.readLine());

		int i = 0;	// for문 밖에서도 사용하기 위해 전역변수로 사용
		
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				break;	// break를 통해 i가 n까지 증가하지 못하고 반복문 종료
			}
		}
		
		if(i == n) {
			bw.write(n+ "은(는) 소수입니다.");			
		}else {
			bw.write(n + "은(는) 소수가 아닙니다.");
		}

		bw.flush();
		bw.close();

	} // end of main
} // end of class
