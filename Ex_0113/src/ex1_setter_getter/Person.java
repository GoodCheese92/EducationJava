package ex1_setter_getter;

public class Person {
	// setter & getter : private으로 만들어진 속성들에 접근할 수 있도록 하기 위한 개념
	private String brand = "samsung";	// 값이 절대 바뀌면 안되는 변수에 대해서는 getter만 만들어서 사용한다.
	private String name;
	private String phone;
	private int age;
	
	public String getBrand() {
		return brand;
	}
	
	// 1. get(set) 까지 타이핑 후 ctrl + space를 누르면 setter and getter가 자동완성 되는 목록이 나온다.
	// 2. 마우스 우클릭 후 -> source에서 generate getter and setter를 누르면 자동 생성된다.
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	
	
	
	

	
	
	
	
	// this : 현재 클래스 자신
	
//	public void setName(String name) { // 파라미터를 사용할 때, 변수를 무엇을 넣어야 할지 쉽게 알 수 있게 하기 위한 변수를 사용하여야 한다.
//		this.name = name;	// 따라서, 변수의 이름과 파라미터 변수명이 같아지는 경우가 발생 -> this. 를 사용하여 정확하게 변수가 가르키는 것이 무엇인지 지정해 줘야 한다.	
//	}
	
	
//	public String getName() {
//		return name;
//	}
//	
//	public void setPhone(String p) {
//		phone = p;
//	}
//	
//	public String getPhone() {
//		return phone;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getAge() {
//		return age;
//	}
	
} // end of class
