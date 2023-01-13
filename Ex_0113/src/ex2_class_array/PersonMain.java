package ex2_class_array;

public class PersonMain {
	public static void main(String[] args) {
		String[] sArr = new String[3];
		sArr[0] = "aaa";
		sArr[1] = "bbb";
		sArr[2] = "ccc";
		
		// String 배열을 제외한 모든 클래스들은
		// 배열화 처리되었을 때, 각 인덱스마다 메모리 할당을 해 줘야 한다.
		Person[] person = new Person[3];
		for(int i=0; i<person.length;i++) {
			person[i] = new Person();
		}
		
//		person[0] = new Person();
//		person[1] = new Person();
//		person[2] = new Person();
		
		// 많은 변수들을 배열로 한 번에 저장하고 싶을 때, 클래스 배열을 이용하여 사용한다.
		person[0].setName("김말똥");
		person[0].setAge(20);
		
		person[1].setName("박소똥");
		person[1].setAge(30);
		
		person[2].setName("김쥐똥");
		person[2].setAge(40);
		
		// 김말똥 / 20
		// 박소똥 / 30
		// 김쥐똥 / 40
		for(int i=0; i<person.length; i++) {
			System.out.println(person[i].getName()+ " / "+person[i].getAge());
		}
		
		
	} // end of main
} // end of class
