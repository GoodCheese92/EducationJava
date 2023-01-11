package ex1_string;

public class Ex2_String_Method {
	public static void main(String[] args) {
		// String 클래스의 메서드(기능)들
		// 메서드란
		// 반복적으로 사용되는 코드를 줄이기 위해 쓰는 개념

		String name = "Hong Gil Dong";
		// 1. length
		int len = name.length(); // ()안으로 커서 옮겨놓고 ctrl + space 누르면 api에 등록된 정보가 나온다.
		// 메서드는 무조건 ()를 가지고 있다.
		System.out.println("문장의 길이 : " + len);	// 문장의 길이를 리턴한다.
		
		// 2. index
		int index = name.indexOf('o');	// 처음 'o'의 인덱스를 리턴한다.
		System.out.println("맨 첫번째 o의 위치 : " + index);
		
		// length만 1부터 세고 나머지는 다 0부터 센다.
		
		index = name.lastIndexOf('o');	// 맨 뒤의 'o'의 인덱스를 리턴한다.
		System.out.println("맨 뒤의 o의 위치 : "+index);
		
		// 3. charAt
		char ch = name.charAt(5);	// 5번방의 char를 리턴한다.
		System.out.println("5번 방의 추출한 문자 : "+ch);
		
		// 4. substring
		String s1 = name.substring(5);	// 5번방부터 끝까지 모든 문장을 가져온다.(5<=s1)
		System.out.println(s1);

		s1 = name.substring(5, 10);	// 5번방부터 10번 전까지 모든 문장을 가져온다.(5<=s1<10)
		System.out.println(s1);
		
		// 5. replace, replaceAll
		name = "Hong. Gil. Dong";
		s1 = name.replace('.', '/');	// .을 /로 변경한다.
		System.out.println(".을 /로 치환 : "+s1);
		s1 = name.replace("on", "ii");	// on을 il로 변경한다.
		System.out.println("on을 ii로 치환 : "+s1);
		
		name = name.replaceAll("ii","on");
		System.out.println("ii를 on으로 치환 : "+name);
		
		name = "Kim. Lee. Park";
		String name2 = "Kim. Lee. Park";
		
		name = name.replace('.', '/');
		System.out.println("replace : "+name);
		
		name2 = name2.replaceAll(".", "/");	//.앞은 모두 한 묶음으로 생각하기 때문에 전부 변경됨
		System.out.println("replaceAll : "+name2);
		
		// 6. trim
		String id = "  hi hello  ";
		id = id.trim();		// 문장 앞뒤의 의미없는 공백을 제거
		System.out.println("trim 사용 후 : "+id);
		System.out.println("trim 사용한 후 길이 : "+id.length());
		
		// 7. split
		String[] id2 = id.split(" ");	// 특정 문장을 기준으로 배열 형태로 나눠서 저장해주는 메서드
		System.out.println(id2[0]+" / "+id2[1]);
		
		// 8. equalsignoreCase
		String answer = "Apple";
		if(answer.equalsIgnoreCase("apple")) {	// 대소문자 무시하고 같은지 비교
			System.out.println("값이 같다.");
		}
		
		// String class의 method는 아니지만, 앞으로 많이 사용하게 될 메서드
		// 정수형태의 문자열(String)을 연산이 가능한 실제 정수로 바꿔보자!!
		String num = "10";		
		int a = Integer.parseInt(num);	// 모든 기본 자료형에는 항상 부모 클래스(reference class)를 가지고 있다.
		a += 1;
		num += 1;
		System.out.println(a+" / "+num);
		
		
		
	} // end of main
} // end of class
