package ex1_work;

public class Work {
	String result = "";
	
	public String setEnc(String str, char[] alphaCode, char[] numCode) {
		// str(��������) : ab1
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			// ������ �ɰ��� �� ���ĺ� ���� �ȿ� ���Ե� ������ ���
			// �Ʒ� if������ ����
			if(ch >= 'a' && ch <= 'z') {
				result += alphaCode[ch-'a'];
			} else if(ch >= '0' && ch <= '9') {
				result += numCode[ch-'0'];
			}
				
		} // for
		
		return result;
	}
	
	
} // end of class
