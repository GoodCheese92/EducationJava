package ex1_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex3_BufferedFileOutput {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream("C:/embedded_LSJ/bos의 예제.txt");
			bos = new BufferedOutputStream(fos);
			String str = "buffered스트림의 예제.";
			bos.write(str.getBytes());

			// 내용을 물리적으로 기록하기 위한 메서드
			bos.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				// close()하는 과정에서 기록이 된다. 따라서, 닫는 순서를 잘 지켜주어야 한다.
				// -> 실수를 막기 위해 flush()를 사용한다.
				fos.close();
				bos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	} // end of main
} // end of class
