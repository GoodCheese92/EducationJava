package ex3_work;

public class Work_ex1 {
	public String isNumber(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				return str + "��(��) ������ �ƴմϴ�.";
			}

		} // for
		
		return str+"��(��) �����Դϴ�.";

	} // end of isNumber()

} // end of class
