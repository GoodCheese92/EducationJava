package ex5_printf;

public class Ex2_work {
	public static void main(String[] args) {
		// 5 * 1 = 5
		// 5 * 2 = 10
		// ...

		// 2~9사이의 값만 입력해주세요

		int dan = 4;
		if (dan >= 2 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			} // end of for
		} else {
			System.out.println("2~9사이의 값만 입력해주세요.\n");
		} // end of if

	} // end of main
} // end of class
