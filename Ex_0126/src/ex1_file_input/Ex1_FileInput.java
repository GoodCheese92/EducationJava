package ex1_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import util.MyPath;

public class Ex1_FileInput {
	public static void main(String[] args) {
		String path = MyPath.PATH + "/test.txt"; // D:/국비지원/embedded_LSJ/test.txt
		File f = new File(path);

		// 접근 경로상에 문제가 없다면...!!
		if (f.exists()) {
			// 파일 클래스와 연결된 InputStream을 생성
			try {
				FileInputStream fis = new FileInputStream(f); // 파일에 써져있는 내용을 읽어오기 위해 FileInputStream 사용

				int code = -1;

				// fis은 1byte단위로 값을 가져온다.
				// fis스트림은 더 이상 읽어 올 내용이 없다면 -1을 반환한다.
				// byte단위로 데이터를 읽다가 EOF(End of File)을 만났다는 것을 의미
				while ((code = fis.read()) != -1) { // 파일에 써져있는 내용을 한 글자씩 정수형으로 가져오다가 -1을 만나면 그만둔다.
					System.out.print((char) code);

				} // while
				
				// 사용이 완료된 스트림은 반드시 닫아줘야 한다.
				fis.close();
				
			} catch (Exception e) { // fis.read의 에러도 잡기 위해서 Exception으로 수정
				e.printStackTrace();
			}

		}

	} // end of main
} // end of class





