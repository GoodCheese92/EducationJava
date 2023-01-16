package problem.standard_of_java.chapter5;

import java.util.Scanner;

public class Problem12 {
	public static void main(String[] args) {
		// 아래와 같은 결과가 나오도록 하시오.
		// Q1. chair의 뜻은? dmlwk
		// 틀렸습니다. 정답은 의자입니다.
		// Q2. computer의 뜻은? 컴퓨터
		// 정답입니다.
		// Q3. integer의 뜻은? 정수
		// 정답입니다.
		// 전체 3문제 중 2문제 맞추셨습니다.
		
		String[][] q = {{"Q1. chair의 뜻은?", "의자"}, {"Q2. computer의 뜻은?", "컴퓨터"}, {"Q3. integer의 뜻은?", "정수"}};
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;

		for(int i=0; i<q.length; i++) {
			System.out.println(q[i][0]);
			System.out.print(">> ");
			String answer = sc.next();
			
			if(q[i][1].equals(answer)) {
				System.out.println("정답입니다.");
				count++;
			}else {
				System.out.println("오답입니다. 정답은 "+q[i][1]+"입니다.");
			}
		}
		System.out.println("전체 "+q.length+"문제 중 "+count+"문제 맞추셨습니다.");
		
		
	} // end of main
} // end of class
