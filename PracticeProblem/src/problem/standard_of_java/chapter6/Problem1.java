package problem.standard_of_java.chapter6;

import java.util.Random;

public class Problem1 {
	// ������ ���� ��������� ���� SutdaCard Ŭ������ �����Ͻÿ�.
	// intŸ���� num -> 1~10������ ����
	// booleanŸ���� isKwang -> ���̸� true, �ƴϸ� false

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
