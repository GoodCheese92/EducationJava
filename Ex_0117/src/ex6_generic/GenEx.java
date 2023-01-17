package ex6_generic;

public class GenEx<T> {
	// 제너릭 클래스
	// 제너릭 클래스란 일반적인 코드를 작성하고 이 코드를
	// 다양한 타입의 객체에 대하여 재사용이 가능하도록 하는 프로그래밍 기법
	
	T value;
	int num;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	
	
	
} // end of class
