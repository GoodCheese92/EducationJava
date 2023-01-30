package ex3_char_output;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			// true 추가 시, 기록할 때 마다 누적해서 기록이 된다.
			fw = new FileWriter("C:/embedded_LSJ/fileWriter의 예제.txt", true);

			String str = "first line\n";
			String str2 = "두번째 줄";

			// character 기반이므로 2byte씩 쓸 수 있기 때문에 배열로 바꾸지 않아도 된다.
			// fw는 기본적으로 2byte를 지원하기 때문에 getByte()를 통해
			// byte[]구조로 쪼개지 않아도 기록이 가능
			fw.write(str);
			fw.write(str2);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end of main
} // end of class
