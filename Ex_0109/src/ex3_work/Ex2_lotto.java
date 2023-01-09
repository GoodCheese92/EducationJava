package ex3_work;

import java.util.Random;

public class Ex2_lotto {
	public static void main(String[] args) {
		// 1~45 사이의 중복되지 않는 난수 6개를 만들어 lotto 배열에 담고
		// 최종적으로 lotto 배열에 담긴 값들을 출력하시오.

		// 15 2 41 17 6 9
		// 추후에 보너스 번호로 번호 하나가 추가되더라도 잘 작동하도록 만드시오.

		int[] lotto = new int[6];

		Random rnd = new Random();

		int i=0;
		do {
			lotto[i] = rnd.nextInt(45)+1;	// 1~45 사이의 난수 생성
			i++;		// 안의 for문에서 계산하기 위해 여기서 증감
			
			for (int j = 0; j < lotto.length; j++) {
				if(i-1==j) {	// 인덱스로 비교
					continue;	
				}else if(lotto[i-1] == lotto[j]) {	// i번 째를 기준으로 다 비교
					i--;							// 같은면 i--로 i번째 난수 다시 생성
					break;
				}
			}
		}while(i<lotto.length);
		
		for(int e : lotto) {
			System.out.print(e+" ");
		}

	} // end of main
} // end of class
