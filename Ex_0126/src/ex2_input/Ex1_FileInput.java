package ex2_input;

import java.io.IOException;
import java.util.Scanner;

public class Ex1_FileInput {
	public static void main(String[] args) {
		// ...Stream : byte 기반의 스트림
		// ...Reader, ...Writer : char기반의 스트림
		
	    Scanner sc = new Scanner(System.in);
		byte[] keyboard = new byte[100];
		
		System.out.print("값 : ");
		
		// 키보드 값을 입력받아서 keyboard 배열에 저장
		try {
			System.in.read(keyboard);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String str = new String(keyboard);
		
		System.out.println(str.trim());
		
		sc.close();
		
	} // end of main
} // end of class
