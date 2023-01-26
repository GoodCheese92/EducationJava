package work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		// {"apple", "doctor", "view"}
		// Hangman
		// Word : ***** �������� ���õ� ���� �� ��ŭ ��ǥ ���
		// >> �Է��ϸ�
		// �� ������ �� �ҹ��ڸ� �Է� �����մϴ�.

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
				System.out.println("���� Ȥ�� ���ڸ� �Է����ּ���!!");
				continue;
			}
			
			System.out.println("Word : " + answer);

			if(!answer.contains("��")) {
				System.out.println(work.getPb() + " ����!!");
				break;
			}
			
		} // while

	} // end of main
} // end of class
