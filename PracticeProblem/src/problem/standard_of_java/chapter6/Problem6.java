package problem.standard_of_java.chapter6;

public class Problem6 {
	// �� �� (x, y)�� (x1, y1) ���� �Ÿ��� ���Ѵ�.
	static double getDistance(int x, int y, int x1, int y1) {
		double result = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		return result;
	}
	
	
} // end of class
