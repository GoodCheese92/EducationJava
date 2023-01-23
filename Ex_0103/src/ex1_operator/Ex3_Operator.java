package ex1_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		// 2. 증감연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		// 선행증감과 후행증감의 차이점만 확실히 구별하자!
		int a = 10;
		System.out.println("a : " + ++a);
		
		int b = 10;
		System.out.println("b : " + b++);
		System.out.println(b);
		
		b++; // 11 b++ 11
		--b; // 12 --b 11
		--b; // 11 --b 10
		++b; // 10 ++b 11
		b--; // 11 b-- 11
		b--; // 10 b-- 10
		b++; // 9  b++ 9
		++b; // 10 b++ 11
		System.out.println(b--);
		
		// 증감연산자는 한번에 1씩만 제어가 가능하므로
		// 2 이상의 증감을 하려면 대입연산자를 사용하는 것이 좋다.
		b += 2;
		System.out.println(b);
		
		System.out.println("-----------------------");
		
		// 8. 삼항(조건)연산자
		// 조건을 두고, 그 조건에 대한 결과가 참일 때와 거짓일 때에 따라
		// 다른 대답을 돌려주는 연산자
		int aa = 10;
		int bb = 15;
		boolean res = (++aa >= bb) ? true : false;	// ? 앞에 조건이 true면 : 왼쪽, false면 : 오른쪽
		System.out.println(res);
		
		char res2 = ++aa < bb ? 'y' : 'n';
		System.out.println(res2);
		
		
	} // main
} // class end
