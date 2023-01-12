package ex1_class;

import java.util.Scanner;

public class ComMain {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		Computer c1 = new Computer(); // 모델명 : Computer, 시리얼번호 : c1

		// c1이라는 객체를 생성하면 c1에 담겨있는 정보를 가지고 heap 영역에 메모리 생성됨

		c1.getInfo();


		Computer c2 = new Computer();
		c2.getInfo();


		Computer c3 = new Computer();
		c3.ssd = 512;
//		c3.brand = "samsung";	// brand는 접근제한자가 private로 지정되어 있기 때문에 객체생성 후 변경 불가(private은 class에서만 사용 가능) 
		c3.getInfo();


	}// end of main
} // end of class
