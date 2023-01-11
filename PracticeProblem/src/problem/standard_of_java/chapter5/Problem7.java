package problem.standard_of_java.chapter5;

public class Problem7 {	
	public static void main(String[] args) {
		// 동전의 개수를 추가한 프로그램
		// 커맨드 라인으로부터 거슬러 줄 금액을 입력받아 계산
		// 보유한 동전으로 거스름돈을 지불할 수 없으면 -> '거스름돈이 부족합니다.' 출력
		// 지불할 돈이 충분하면 거스름 돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력
		
		if(args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money = "+money);
		
		int[] coinUnit = {500, 100, 50, 10};	// 동전의 단위
		int[] coin = {5, 5, 5, 5};				// 단위별 동전의 개수
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
			// 문제 -> 직접 작성한 부분
			coinNum = money/coinUnit[i];
			if(coin[i]>=coinNum) {
				coin[i] -= coinNum;				
			}else {
				coin[i] -= coin[i];
			}
			money = coinNum*coinUnit[i];
			
			System.out.println(coinUnit[i]+"원 : "+coinNum);
		}
		
		if(money>0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);	// 프로그램을 종료한다.
		}
		
		System.out.println("=남은 동전의 개수=");
		
		for(int i=0; i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원: "+coin[i]);
		}
		
	} // end of main
} // end of class
