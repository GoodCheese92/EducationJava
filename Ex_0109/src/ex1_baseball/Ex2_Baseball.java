package ex1_baseball;

import java.util.Random;
import java.util.Scanner;

public class Ex2_Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int[] com = new int[3];
		
		do {
			for(int i = 0; i<com.length; i++) {
				com[i] = rnd.nextInt(9)+1;
			}			
		} while(com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
		
		for(int i = 0; i<com.length; i++) {
			System.out.print(com[i]);
		}
		
		int[] u = new int[3];
		int strike = 0;
		int ball = 0;
		int count = 0;
		do {
			count++;	// 시도 횟수 세기
			for(int i=0; i<u.length; i++) {
				u[i] = sc.nextInt();
			}
			
			
		} while(strike != 3);
		
		
		
	} // end of main
} // end of class
