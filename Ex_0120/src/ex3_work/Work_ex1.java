package ex3_work;

public class Work_ex1 {
	public String isNumber(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				return str + "은(는) 정수가 아닙니다.";
			}

		} // for
		
		return str+"은(는) 정수입니다.";

	} // end of isNumber()

} // end of class
