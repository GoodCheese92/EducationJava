package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		// switch-case문 : 비교값과 조건값을 통해 결과를 처리하는 제어문
		// switch(비교값) {
		//	  case 조건값 :
		//		비교값과 조건값이 일치하는 경우 실행되는 영역
		//    break;
		// }
		
		int n = 4;
		switch(n) { // () 안은 비교값
		case 1: // 조건값(조건값의 타입은 비교값과 반드시 일치해야 한다.)
			System.out.println("1. 게임시작");
			break; // switch문을 완전히 빠져나가는 키워드
		case 2:
			System.out.println("2. 게임소개");
			break;
		case 3:
			System.out.println("3. 옵션");
			break;
		default:
			// 비교값과 조건값이 모두 일치하지 않는 경우
			// 반드시 실행되는 영역
			System.out.println("1, 2, 3 중에서만 입력하세요.");
			break;
		} // switch
		
		// switch 문에 case 에는 true, false 값을 대입할 수 없다.
		// 따라서, 범위에 관련된 조건을 사용해야될 경우(ex. 성적 관리 조건문, ...) if문을 사용하는 게 더 수월하다.
		
		
		
	} // main
} // end class
