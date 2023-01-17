package problem.standard_of_java.chapter6;

import java.util.Random;

public class Problem1 {
	// 다음과 같은 멤버변수를 갖는 SutdaCard 클래스를 정의하시오.
	// int타입의 num -> 1~10사이의 정수
	// boolean타입의 isKwang -> 광이면 true, 아니면 false

	public Problem1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public Problem1() {

	}

	Random rnd = new Random();
	int num = rnd.nextInt(10) + 1;

	boolean isKwang;

//	if(num > 10 || num < 1) {
//		isKwang = true;
//	}else {
//		isKwang = false;
//	}
//	

	public int info() {
		return num;
	} // end of info()
	
	
	
} // end of class
