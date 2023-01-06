package ex9_break_continue;

public class Ex1_Break {
	public static void main(String[] args) {
		// break문 : 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나갈 때 사용하는 키워드
		for(int i = 1; i<= 2; i++) {
			for(int j =1; j<=10; j++) {
				if(j % 2 == 0) {
					// 가장 가까운 반복문을 탈출
					break;
					// System.out.println("여기까지 진입 불가");   // break 아래에는 어떤 코드도 추가될 수 없다.
				}				
				
				System.out.printf("%d ", j);
				
			} // inner
			System.out.println();
		} // outer
		
		
	} // end of main
} // end of class
