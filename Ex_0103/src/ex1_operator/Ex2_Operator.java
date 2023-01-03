package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		// 5. 비교연산자
		// 값을 비교해서 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2;		// < : 프로그래밍 언어에서는 왼쪽이 기준이기 때문에 작다 라는 의미이다.
		System.out.println("n1 < n2 : " + res);
		
		res = n1 >= n2;
		System.out.println("n1 >= n2 : " + res);
		
		res = n1 == n2;
		System.out.println("n1 == n2 : " + res);
		
		res = n1 != n2;
		System.out.println("n1 != n2 : " + res);
		
		System.out.println("----------------------------------");
		
		// 7. 논리연산자
		// 비교연산자를 통한 연산이 두 개 이상 필요할 때
		int age = 30;
		int limit = 35;
		// and(&&)연산자 : 앞의 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다.
		// t && t = t
		// t && f = f
		// f && t = f
		// f && f = f
		res = (limit - age) < 5 && (age += 2) >= 30;		
		System.out.println("&& : " + res);
		System.out.println(age);
		
		int i1 = 10;
		int i2 = 20;
		// or(||)연산자 : 앞의 연산이 참이면 뒤쪽 연산을 수행하지 않는다.
		// t || t = t
		// t || f = t
		// f || t = t
		// f || f = f
		res = (i1 += 10) > 20 || i2 - 10 == 11;
		System.out.println("|| : " + res);
		
		// not(!)연산자 : 참을 거짓으로 거짓을 참으로 바꿔주는 연산자
		System.out.println("! : " + res);
		System.out.println("! : " + !res);
		System.out.println(res);
		
	} // main
}
