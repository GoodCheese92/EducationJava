package ex3_method;

public class MetMain {
	public static void main(String[] args) {
		Method1 m1 = new Method1();
		m1.test1();
		
		int su = 100;
		su = m1.test2(su);	// 메서드에 들어간 변수(값)은 메서드에서만 작동
							// su의 복사본이 parameter로 들어간다. 따라서 메서드가 끝나면 소멸
		System.out.println("su : " + su);	// 다른 클래스간 값 교환을 하기 위해서는 파라미터와 리턴이 필요하다.	
		m1.test2(su);
		
		String res = m1.test3("홍길동", 32);
		System.out.println(res);
		
		res = m1.test3("kim", 22);
		System.out.println(res);
		
	} // end of class
} // end of class
