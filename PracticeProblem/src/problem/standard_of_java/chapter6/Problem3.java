package problem.standard_of_java.chapter6;

public class Problem3 {
	String name;
	int ban;
	int no ;
	int kor;
	int eng;
	int math;
	
	public Problem3() {

	}
	
	public int getTotal() {
		return kor+eng+math;
	} // end of getTotal()
	
	public float getAverage() {
		return Math.round(getTotal()/3.0f*10)/10f;
	} // end of getAverage()
	
	public Problem3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} // end of constructor
	
	public String info() {
		String str = name +"," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + Integer.toString(getTotal()) + "," + Float.toString(getAverage());
		return str;
	}
	
} // end of class
