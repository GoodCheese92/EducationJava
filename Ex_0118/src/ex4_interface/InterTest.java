package ex4_interface;

public interface InterTest {
	// 인터페이스
	// 서비스 요청에 따른 중개자 역할을 하는 클래스
	
	// 인터페이스 내부에는 상수, 추상메서드는 추가가 가능
	// 상수 : final 키워드로 사용, 한번 정해진 값으로 프로그램 종료까지 변하지 않는 수
	// 이름을 모두 대문자로 선언함
	
	final int VALUE = 100;
	abstract int getVALUE();
}
