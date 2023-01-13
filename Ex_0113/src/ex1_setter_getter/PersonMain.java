package ex1_setter_getter;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		//p1.name = "홍길동";
		p1.setName("홍길동");		// void로 선언된 메서드기 때문에 name에 이어붙이기, 자료형에 대입하기 등등이 불가능하다.
//		p1.phone = "010-111-1111";
//		p1.age = 30;
		
		p1.setPhone("010-111-1111");
		p1.setAge(30);
		
		// 함부로 변수의 값을 바꾸지 않기 위해서 또는 보안을 위해서 클래스 변수를 private로 선언한다.
		// -> 따라서, 객체 생성 후 변수의 이름을 바꿀 수 없어진다.
		// setter and getter 사용으로 변경
		System.out.println(p1.getName());
//		System.out.println(p1.phone);
//		System.out.println(p1.age);
		
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
		
	} // end of main
} // end of class
