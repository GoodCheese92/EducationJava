package problem.standard_of_java.chapter5;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "aabbcc";
		String answer = sc.next();
		if(answer.trim().equals(str)) {
			System.out.printf("정답입니다.%n%n");
		}else {
			System.out.printf("오답입니다.%n%n");
		}
		
		
	} // end of main
} // end of class
