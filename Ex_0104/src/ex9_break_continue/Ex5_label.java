package ex9_break_continue;

public class Ex5_label {
	public static void main(String[] args) {
		// label : 반복문에서 식별자(이름표)를 지정하는 형태
		out : for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 10; j++) {
				if(j % 2 == 0) {
					// out이라는 label을 가진 반복문을 빠져나간다.
					break out;
				}
				
				System.out.printf("%d ", j);
			} // inner
			System.out.println();
		} // outer

	} // end of main
} // end of class
