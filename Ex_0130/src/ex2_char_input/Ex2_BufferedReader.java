package ex2_char_input;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex2_BufferedReader {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("C:/embedded_LSJ/test.txt");
			br = new BufferedReader(fr);

			String msg = "";

			// readLine() : 문자열로 읽는다. 읽는 줄이 없으면 null을 반환한다.
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	} // end of main
} // end of class
