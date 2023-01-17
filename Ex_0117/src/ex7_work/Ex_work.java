package ex7_work;

import java.util.Scanner;

public class Ex_work {
	public static void main(String[] args) {
		// 키보드에서 입력받은 값을 암호표대로 암호화 하시오.
		// 값 : abc123
		// 결과 : `~!wer
		
		Scanner sc = new Scanner(System.in);
		char[] ch1 = new char['z'-'a'+1];
		char count1 = 'a';
		
		for(int i=0; i<ch1.length;i++) {
			ch1[i] = count1++;
		}
		
		char[] ch2 = new char['9'-'0'+1];
		char count2 = '0';
		
		for(int i=0; i<ch2.length; i++) {
			ch2[i] = count2++;
		}
		
		char[] answer1 = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=',
						'|', '[', ']', '{', '}', ';', ':', ',', '.', '/'};
		
		char[] answer2 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		System.out.print("값 : ");
		String res = sc.next();
		String answer = "";
		
		int count = 0;
		
		for(int i=0; i<res.length(); i++) {
			char ch = res.charAt(i);
			
			if(ch>='a' && ch<='z') {
				answer += answer1[ch - 'a'];
			}else if(ch >= '0' && ch <='9'){
				answer += answer2[ch-'0'];
			}
		} // for
		
		System.out.println("결과 : "+answer);
		
		
		
		
		
		
	} // end of main
} // end of class
