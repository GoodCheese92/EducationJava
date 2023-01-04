package problem;

public class Study_230104_chapter4 {
	public static void main(String[] args) {
		// 4-1 다음의 문장을 조건식으로 표현하라.
		// 1) int x
		int x = 0;
		if(10<x && x<20) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// 2) char 공백
		char ch = 'A';
		if(ch != ' ' || ch != '\t') {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// 3) char 'x', 'X'
		if(ch == 'x' || ch == 'X') {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// 4) char '0'
		if(ch >= 48 & ch <= 57) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// 5) char 대문자, 소문자
		if(ch >= 65 && ch <= 90) {
			System.out.println(ch+" : 대문자");
		}else if(ch >=97 && ch <= 122) {
			System.out.println(ch+" : 소문자");
		}else {
			System.out.println("알파벳이 아닙니다.");
		}
		// 6) year 400으로 나눠 떨어지는 것
		int year = 0;
		if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// 7) powerOn false
		boolean powerOn = false;
		if(!(powerOn)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// 8) str "yes"
		String str = "";
		if(str.equals("yes")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		// 4-2 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		for(int i=1; i<21; i++) {
			if (i%2 != 0 || i%3 != 0) {
				int sum;
				sum = sum + 1;
							}
		}
			
		
	} // main
} // end class
