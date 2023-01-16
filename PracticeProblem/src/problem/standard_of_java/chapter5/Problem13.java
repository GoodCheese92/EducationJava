package problem.standard_of_java.chapter5;

import java.util.Random;
import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) {
		// �ܾ��� ���� ��ġ�� ��� �����ְ� ������ �ܾ ���ߴ� �����̴�.
		// �������� ���� �����ϵ��� ������ �� ���� ä��ÿ�.

		String[] words = { "television", "computer", "mouse", "phone" };

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			// String�� char[]�� ��ȯ

			for(int j=0; j<question.length; j++) {
				System.out.print(question[j]);				
			}
			System.out.println();
			/*
			 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. char�迭 question�� ��� ������ ��ġ�� ���Ƿ� �ٲ۴�.
			 */
			for(int j=0; j<question.length;j++) {
				int num = rnd.nextInt(question.length-j)+j;
				char temp = question[j];
				question[j] = question[num];
				question[num] = temp;
			}
			for(int j=0; j<question.length; j++) {
				System.out.print(question[j]);				
			}
			System.out.println();

			System.out.printf("Q%d. %s�� ������ �Է��ϼ���>", i + 1, new String(question));

			String answer = sc.nextLine();
			
			// trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
			if(words[i].equals(answer.trim())) {
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
			}
			
		} // for
		
		

	} // end of main
} // end of class
