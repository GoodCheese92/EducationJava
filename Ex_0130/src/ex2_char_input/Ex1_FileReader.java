package ex2_char_input;

import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {
	public static void main(String[] args) {
		FileReader fr = null;

		try {
			fr = new FileReader("C:/embedded_LSJ/test.txt");

			int code = -1;
			
			// fr.read()는 char은 유니코드 형태로 가져온다.
			// 읽을 게 없으면 -1을 가져온다.
			while ((code = fr.read()) != -1) {
				// fr는 기본적으로 2byte문자인 한글 등을 유니코드 형태로 읽어오는 것이 가능하므로
				// byte[]등을 만들 필요가 없다!!
				System.out.print((char) code);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end of main
} // end of class
