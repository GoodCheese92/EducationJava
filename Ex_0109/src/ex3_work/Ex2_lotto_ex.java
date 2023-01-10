package ex3_work;

import java.util.Random;

public class Ex2_lotto_ex {
	public static void main(String[] args) {
		// 최종적으로 lotto 배열에 담긴 값들을 출력하시오

		// 15 2 41 17 6 9

		Random rnd = new Random();
		int[] lotto = new int[6];

		outer: for (int i = 0; i < lotto.length;) {
			lotto[i] = rnd.nextInt(45) + 1;

			// 중복 값을 체크하는 반복문
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					continue outer;		// 조건이 만족하면 바깥에 for문의 조건식으로 건너 뜀
				}

			} // inner

			System.out.print(lotto[i] + " ");	
			i++;	// 증감식을 for문 안으로 넣으면서 위의 조건이 만족하지 않다면 i를 증감시키지 않는다.

		} // outer

	} // end of main
} // end of class
