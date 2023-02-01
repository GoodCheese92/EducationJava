package ex3_io_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {

		String path = "D:/국비지원/embedded_LSJ";
		File f = new File(path);

		// f가 접근한 path경로가 폴더일 경우 true
		if (f.isDirectory()) { // !f.isFile()
			System.out.println("---파일 클래스가 접근한 하위목록들---");

			// f가 접근한 폴더의 하위 내용들의 이름을 모아두는 메서드
			String[] sArr = f.list();

			for (int i = 0; i < sArr.length; i++) {
				System.out.println(sArr[i]);
			} // for

		}

	} // end of main
} // end of class
