package ex3_constructor;

public class ConMain {
	public static void main(String[] args) {
		// new는 heap 메모리 영역에 주소 생성
		// Ex_Con()인 생성자가 호출되면서 heap 메모리 영역에 메모리 생성
		
		Ex_Con con = new Ex_Con();
		
		// 한번 생성된 생성자는 추후에 재 호출이 절대로 불가
		// con.Ex_Con(); -> 생성자는 객체가 생성될 때 호출되고 다시 사용 불가!
		
	} // end of main
} // end of class
