package ex7_work;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamWork_ex {
	public static void main(String[] args) {
		// char기반의 스트림을 사용할 것!
		// 특정 경로에 char.txt파일을 만들고 아무 내용이나 넣는다.
		// char.txt를 읽어서 내용에 알파벳 대문자와 소문자 갯수를 각각 출력

		// 대문자 : 5
		// 소문자 : 2

		String path = "C:/embedded_LSJ/work/Ex_0130/src/ex7_work/char.txt";
		FileReader fr = null;

		int upper = 0; // 대문자
		int lower = 0; // 소문자

		try {
			fr = new FileReader(path);
			int code = -1;

			while ((code = fr.read()) != -1) {
				if (code >= 'A' && code <= 'Z') {
					upper++;
				}

				if (code >= 'a' && code <= 'z') {
					lower++;
				}

			} // while

			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);

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
