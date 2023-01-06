package ex9_break_continue;

public class Ex6_label {
	public static void main(String[] args) {
		label : for(int i = 1; i <= 3; i++) {
			for(int j =1; j<=5; j++) {
				if(j % 2 == 0) {
					continue label;		// label 이름을 가진 반복문의 증감식으로 건너뛴다.
										// 아래 있는 한줄 넘어가는 코드에 도달할 수 없다.
				}
				System.out.printf("%d ", j);
			} // inner
			System.out.println();
		} // outer
		
		
	} // end of main
} // end of class
