package ex3_char_output;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex2_BufferedWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("C:/embedded_LSJ/BufferedWriter의 예제.txt");
			bw = new BufferedWriter(fw);

			bw.write("첫번 째 line입니다.");
			bw.newLine(); // 내부적으로 \n(엔터값에 해당)을 실행하는 메서드
			bw.write("두번 째 줄");

			bw.flush();	// 물리적으로 내용을 기록

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				// 역순으로 스트림을 닫는다.
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	} // end of main
} // end of class
