package ex1_first;

public class Ex1_print {
	
	public static void main(String[] args) {
		// 주석 : 컴파일 시 JVM이 인지하지 못하는 메모 용도의 텍스트 영역
		// main 메서드 : 컴파일 시 가장 먼저 호출되는 영역
		System.out.println(100); //-< 한줄이 끝나면 반드시 ;으로 마무리
		System.out.println(200);
		
		// 문장을 입력하고자 할때는 ""안에 출력하고자 하는 데이터를 넣어줘야 한다.
		System.out.println("안녕하세요");
		
		System.out.println(10 + 10);
		System.out.println(10 * 10);
		
		System.out.println("10 * 10 = " + 10 * 10);
		System.out.println("5 - 1 = " + (5 - 1));		// "5 - 1 = " + 5 + 1 출력하면 51이 나옴(왼쪽부터 코딩 실행)
		// "" 뒤에 나오는 +는 모두 이어붙이기 적용
		// ()로 사용해서 연산 적용
		System.out.println(1 + 1 + "1 + 1 = " + 1 + 1); 	// 앞에 있는 +는 연산으로 적용된다!
		
	}
	
	
}
