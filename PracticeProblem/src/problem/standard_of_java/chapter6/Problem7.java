package problem.standard_of_java.chapter6;

public class Problem7 {
	int x;
	int y;
	
	public Problem7(int x, int y) {
		this.x = x;
		this.y = y;
	} 
	
	public double getDistance(int x1, int y1) {
		return Problem6.getDistance(x, y, x1, y1);
	}
	
	
} // end of class
