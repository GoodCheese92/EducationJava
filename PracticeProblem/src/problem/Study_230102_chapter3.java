package problem;

public class Study_230102_chapter3 {
	public static void main(String[] args) {
		// 3-1 연산의 결과를 적으시오.
		System.out.println("====3-1====");
		int x = 2;
		int y = 5;
		char c = 'A';	// 'A'의 문자코드는 65
		
		System.out.println(1+x << 33);				// 6
		System.out.println(y >= 5 || x < 0 && x>2);	// true
		System.out.println(y += 10 - x++);			// 13
		System.out.println(x+=2);					// 5
		System.out.println(!('A'<= c && c <='Z'));	// false
		System.out.println('C'-c);					// 2
		System.out.println('5'-'0');				// 5
		System.out.println(c+1);					// 66
		System.out.println(++c);					// B
		System.out.println(c++);					// B
		System.out.println(c);						// C
		System.out.println(x+1);
		System.out.println(x);
		
		// 3-2 사과 바구니 담기
		System.out.println("====3-2====");
		int numOfApples = 123;	// 사과의 개수
		int sizeOfBucket = 10;	// 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ((numOfApples/sizeOfBucket) + ((numOfApples%sizeOfBucket>0) ? 1 : 0));
		System.out.println("필요한 바구니의 수 : "+numOfBucket);
		
		// 3-3 '양수', '음수', '0' 출력
		System.out.println("====3-3====");
		int num = -2;
		System.out.println((num > 0) ? "양수": (num < 0 ? "음수" : "0"));
		
		// 3-4 백의 자리 이하 버림
		System.out.println("====3-4====");
		int num1 = 456;
		System.out.println((num1/100) * 100);
		
		// 3-5 일의 자리 1로 변경
		System.out.println("====3-5====");
		int num2 = 333;
		System.out.println((num2/10)*10 + 1);
		
		// 3-6 가장 가까운 10의 배수에서 빼기
		System.out.println("====3-6====");
		int num3 = 24;
		System.out.println(10 - num3%10);
		//System.out.println((num3/10 + 1)*10 - num3);
		
		// **3-7 화씨 온도 -> 섭씨 온도로 변경하기
		System.out.println("====3-7====");
		int fahrenheit = 100;
		float celcius =(5f/9f *((float)fahrenheit-32.0f));
		System.out.println("Fahrenheit : "+fahrenheit);
		System.out.println("Celcius : "+celcius);
		
		// 3-8 오류 변경하기
		System.out.println("====3-8====");
		byte a = 10;
		byte b = 20;
		byte c1 = (byte)(a + b);
		
		char ch = 'A';
		ch = (char)(ch + 2);
		
		float f = (3f/2);
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2;
		
		System.out.println("c1 = "+c1);
		System.out.println("ch = "+ch);
		System.out.println("f = "+f);
		System.out.println("l = "+l);
		System.out.println("result = "+result);
		
		// 3-9 ch9가 영문자거나 숫자일 때만 b9 값 true
		System.out.println("====3-9====");
		char ch9 = 'z';
		
		boolean b9 = ((ch9>= 48 && ch9<=57)||(ch9>= 65 && ch9<=90)||(ch9>= 97 && ch9<=122));
		
		System.out.println(b9);
		
		// 3-10 대문자 -> 소문자 변경
		System.out.println("====3-10====");
		char ch10 = 'A';
		
		char lowerCase = (ch10>=65 && ch10<=90) ? ((char)(ch10+32)) : ch10;
		
		System.out.println("ch10 : "+ ch10);
		System.out.println("ch10 to lowerCase : "+lowerCase);
		
		
	
	
	}
}
