package problem.standard_of_java.chapter5;

public class Problem10 {
	public static void main(String[] args) {
		// ������ 	���ĺ��� ���ڸ� �Ʒ��� �־��� ��ȣǥ�� ��ȣȭ�ϴ� ���α׷��̴�.
		// (1)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
		
		char[] abcCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		String src = "abc123";
		String result = "";
		
		// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
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
