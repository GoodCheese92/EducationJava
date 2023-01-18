package ex1_work;

public class Work {
	String result = "";
	
	public String setEnc(String str, char[] alphaCode, char[] numCode) {
		// str(원본문장) : ab1
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			// 문장을 쪼갰을 때 알파벳 범위 안에 포함된 문자일 경우
			// 아래 if문으로 접근
			if(ch >= 'a' && ch <= 'z') {
				result += alphaCode[ch-'a'];
			} else if(ch >= '0' && ch <= '9') {
				result += numCode[ch-'0'];
			}
				
		} // for
		
		return result;
	}
	
	
} // end of class
