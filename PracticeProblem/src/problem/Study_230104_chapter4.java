package problem;

public class Study_230104_chapter4 {
	public static void main(String[] args) {
		// 4-1 ������ ������ ���ǽ����� ǥ���϶�.
		// 1) int x
		int x = 0;
		if(10<x && x<20) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// 2) char ����
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
		// 5) char �빮��, �ҹ���
		if(ch >= 65 && ch <= 90) {
			System.out.println(ch+" : �빮��");
		}else if(ch >=97 && ch <= 122) {
			System.out.println(ch+" : �ҹ���");
		}else {
			System.out.println("���ĺ��� �ƴմϴ�.");
		}
		// 6) year 400���� ���� �������� ��
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
		
		
		// 4-2 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
		for(int i=1; i<21; i++) {
			if (i%2 != 0 || i%3 != 0) {
				int sum;
				sum = sum + 1;
							}
		}
			
		
	} // main
} // end class
