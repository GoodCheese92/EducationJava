package ex1_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import util.MyPath;

public class Ex2_FileInput {
	public static void main(String[] args) {
		String path = MyPath.PATH + "/test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		byte[] b_read = new byte[(int) f.length()];

		try {
			if (f.exists()) {
				fis = new FileInputStream(f);

				// fis가 1byte씩 읽어온 내용을 b_read 배열에 순차적으로 저장
				fis.read(b_read);

				// b_read 배열을 출력 가능한 형태의 String 타입으로 변환해 줘야 한다!!
				String res = new String(b_read);

				System.out.println(res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main
} // end of class
