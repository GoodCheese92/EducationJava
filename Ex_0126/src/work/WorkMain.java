package work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		// {"apple", "doctor", "view"}
		// Hangman
		// Word : ***** 랜덤으로 선택된 글자 수 만큼 별표 출력
		// >> 입력하면
		// 한 글자의 영 소문자만 입력 가능합니다.

		String[] problem = { "apple", "doctor", "view" };

		Work work = new Work(problem);

		Scanner sc = new Scanner(System.in);

		String rndPb = work.rndProblem();
		System.out.println("Word : " + rndPb);
		
		String answer;
		
		while (true) {
			
			System.out.print(">> ");
			String input_answer =  sc.next();
		
			if(input_answer.length() == 1) {
				answer = work.answer(input_answer);				
			}else {
				System.out.println("문자 혹은 숫자만 입력해주세요!!");
				continue;
			}
			
			System.out.println("Word : " + answer);

			if(!answer.contains("☆")) {
				System.out.println(work.getPb() + " 정답!!");
				break;
			}
			
		} // while

	} // end of main
} // end of class
