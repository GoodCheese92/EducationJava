package ex3_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		// 반복문 : 특정 수행문을 여러번 반복할 수 있도록 해 주는 제어문
		// for(초기식; 조건식; 증감식) {
		//		조건식이 참인 경우 실행되는 영역
		// }
		
		for(int i=0; i<5; i++) {
			System.out.println(i);			
		} // for
		
		// for문에서 만들어진 지역변수 i는 for문의 소속이므로
		// for의 영역을 벗어나면 사용이 불가능
		// i = 10;
		
		System.out.println("------------------------");
		int n = 0;	// 전역변수
		for(n=1; n<10; n++) {
			System.out.println("지역변수(n) : " +n);
		} // for
		System.out.println();
		System.out.println("전역변수(n) : "+n);
		
		System.out.println("-------------------------");
		
		// 10 ~ 1까지 감소되는 값을 출력하시오.
		for(int i=10; i>0; i--) {
			System.out.print(i+" ");
		} // for
		
		System.out.println("");
		System.out.println("-------------------------");
		
		// 1 ~ 100까지 100회전을 하는 for문을 만들되,
		// 3의 배수만 출력해보자
		for(int i=1; i<101; i++) {
			if((i%3)==0) {
				System.out.print(i+" ");
			} // if
		} // for
		System.out.println();
		
		System.out.println("------------------------");
		for(int i=3; i<100; i+=3) {
			System.out.print(i+" ");
		} // for
		System.out.println();
		
		
		
		
		
	} // main
} // end class
