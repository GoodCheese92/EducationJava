package problem.standard_of_java.chapter6;

public class Problem18 {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	// static int cv2 = iv; // 라인 A
	
	// A : static 변수에 멤버변수의 값을 대입할 수 없다.
	// B : static 메서드에서는 멤버변수를 참조할 수 없다.
	// D : static 메서드에서는 인스턴스 메서드를 참조할 수 없다.
	
	
} // end of class
