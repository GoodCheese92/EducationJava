package ex9_break_continue;

public class Ex3_Continue {
	public static void main(String[] args) {
		// continue문 : 반복문 내에서 특정 문장을 무시하고 건너뛰고자 할 때 사용되는 키워드
		// continue문도 가장 가까운 반복문에 적용이 된다.( {}<---안에 들어있는 코드)
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 5; j++) {
				
				if (j % 2 == 0) {
					// for문 내부의 continue를 만나면 
					// 가장 가까운 for문의 증감식으로 건너뛴다.(아래쪽 라인을 실행하지 않는다.)
					// 증감식이 만약에 {} 안으로 들어와서 작성이 되어 있다면 -> 조건식으로 건너뛴다.
					// -- 만약 for문에서 의도적으로 증감식을 제외했다면,
					// -- 해당 for문의 조건식으로 건너뛴다.
					continue;
					//System.out.println("실행할 수 없는 코드");
				}
				System.out.printf("%d ", j);
			} // inner
			System.out.println();
		} // outer

	} // end of main
} // end of class
