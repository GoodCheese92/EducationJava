package problem.standard_of_java.chapter5;

public class Problem10 {
	public static void main(String[] args) {
		// 다음은 	알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
		// (1)에 알맞은 코드를 넣어서 완성하시오.
		
		char[] abcCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		String src = "abc123";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			
			if(ch>='a' && ch<='z') {
				result += abcCode[ch-'a'];
			}else if (ch>='0' && ch<= '9'){
				result += numCode[ch-'0'];
			}
		}
		
		System.out.println("src : "+src);
		System.out.println("result : "+result);
		
		
	} // end of main
} // end of class
