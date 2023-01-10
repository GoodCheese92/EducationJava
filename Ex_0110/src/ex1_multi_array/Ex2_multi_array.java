package ex1_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		// 2차원 배열의 선언 및 생성, 초기화를 한 번에 하기
		char[][] chArr = {	{ 'J', 'A', 'V', 'A' },
							{ 'S', 'P', 'R', 'I', 'N', 'G' }	};
		
		for(int i = 0; i<chArr.length; i++) {
			for(int j=0; j<chArr[i].length; j++) {
				System.out.printf("%c ", chArr[i][j]);				
			} // inner
			System.out.println();
		} // outer

	} // end of main
} // end of class
