package ex4_interface;

public class InterChild implements InterTest{
	// 인터페이스는 implements 키워드를 통해서 '구현'한다.
	
	@Override
	public int getVALUE() {
		// 상수는 값을 변경할 수 없다.
		// VALUE += 3; -> 상수라 불가능
		return VALUE;
	}
	
	
} // end of class
