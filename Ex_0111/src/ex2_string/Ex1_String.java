package ex2_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		// 주민번호를 입력하세요
		// 예)901122-2011345
		// >> 000918-3456789
		// 당신은 00년 9월 18일에 태어난 남자입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		System.out.println("예)901111-2222222");
		System.out.print(">> ");
		
		String id = sc.next();
		
		if(id.trim().length() < 14 || id.trim().charAt(6) != '-') {
			System.out.println("주민번호 형식이 올바르지 않습니다.");
		}else {
			String y = id.substring(0, 2);
			String m = id.substring(2, 4);
			String d = id.substring(4, 6);
			char gender = id.charAt(7);
			
			if((gender-'0')%2 == 1) {
				System.out.printf("당신은 %s년 %s월 %s일에 태어난 남자입니다.",y,m,d);				
			}else {
				System.out.printf("당신은 %s년 %s월 %s일에 태어난 여자입니다.",y,m,d);
			}
			
			
			
		}
		
		
	} // end of main
} // end of class
