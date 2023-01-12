package ex2_string;

import java.util.Scanner;

public class Ex2_work_ex {
	public static void main(String[] args) {
		// 키보드에서 아무값이나 입력받고 소문자 a의 갯수를 출력
		
		// 입력 : ASDdsgmpgmsdpogsdpogsdmpgs
		// a의 갯수 : 3
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("입력 : ");
		String str = sc.next();
		
		// 입력 받은 문자열의 길이만큼 for문을 반복
		for(int i = 0; i<str.length(); i++) {
			
			// a를 찾아낼 때 마다 카운트를 증가
			if(str.charAt(i)=='a') {
				count++;
			}
		}// for
		
		System.out.println("a의 갯수 : "+count);
		
		
		
	} // end of main
} // end of class
