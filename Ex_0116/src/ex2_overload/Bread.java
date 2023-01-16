package ex2_overload;

public class Bread {
	// 메서드 1
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	} // end of makeBread()

	// 메서드 2
	public void makeBread(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println(count + "개의 빵을 만들었습니다.");
	} // end of makeBread(int n)

	// 메서드 3
	public void makeBread(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name + "을(를) 만들었습니다.");
		}
		System.out.println(count + "개의 " + name + "을(를) 만들었습니다.");
	} // end of makeBread(String s, int n)

} // end of class
