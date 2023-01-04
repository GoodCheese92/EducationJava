package ex1_if;

public class Ex3_else_if {
	public static void main(String[] args) {
		// else-if문
		// if(조건식1) {
		// 	   조건식 1이 참일 때 실행되는 영역	
		// }else if(조건식2) {
		//	   조건식 2이 참일 때 실행되는 영역
		// }else if(조건식3) ...
		
		int num = 75;
		String str = "";
		
		if(num >= 90) {
			str = "A";
		}else if(num >= 80) {
			str = "B";
		}else if(num >= 70) {
			str = "C";
		}else if(num >= 60) {
			str = "D";
		}else {
			// 위의 모든 조건이 거짓일 때 반드시 실행되는 영역
			str = "F";
		}
		
		System.out.println("학점은 : "+str+" 입니다.");
		
		
	} // main
}
