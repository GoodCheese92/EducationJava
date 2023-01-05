package ex7_while;

public class Ex1_while {
	public static void main(String[] args) {
		// while문 : 간단한 구성을 가진 반복문(선 비교, 후 처리)
		// while(조건식){
		// 조건식이 참일 때 실행되는 영역
		// }
		int num = 1;

		while (num < 5) {
			System.out.println("num은 5보다 작습니다. : " + num);
			num++;
		} // end of while

		// while문을 사용하는 경우
		// 1) 무한반복을 하고 싶을 때
		// 2) 언제 끝날 지 모르는 것을 반복하고 싶을 때

	} // end of main
} // end of class
