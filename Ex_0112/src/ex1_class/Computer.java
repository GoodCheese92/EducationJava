package ex1_class;

public class Computer {
	// 클래스의 구성요소
	// 1) 변수, 속성, 멤버 ...
	// 2) 메서드, 함수, 기능

	// 컴퓨터를 만들기 위한 설계 작업
	private String brand = "apple";
	public int ssd = 256;
	int ram = 16;
	float cpu = 2.4f;
	String color = "white";

	// 컴퓨터의 성능을 확인하기 위한 메서드(기능)
	// 메서드 : 반복적으로 사용되는 코드를 줄이기 위해서 만드는 영역
	public void getInfo() {
		System.out.println("제조사 : "+ brand);
		System.out.println("ssd : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("cpu : " + cpu);
		System.out.println("color : " + color);
		System.out.println("--------------------------");
	}
	
	// 메서드의 구성
	// 접근제한자	반환형	메서드명(파라미터, 인자, 매개변수) 	{매소드 호출 시 실행영역}
	// public	void	getInfo(				)	{				}
	// 메서드는 소문자로 되도록 시작해야 한다.

	// 접근제한자
	// 1) public : 같은 프로젝트 내의 모든 객체들에게 사용 허가
	// 2) private : 현재 클래스에서만 사용을 허가
	// 3) protected : 상속 관계의 객체들에게만 사용을 허가
	// 4) (default) : 현재 패키지 내의 객체들에게 사용을 허가

} // end of class
