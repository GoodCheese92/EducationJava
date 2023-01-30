package ex7_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharStreamWork {
	public static void main(String[] args) {
		// char기반의 스트림을 사용할 것!
		// 특정 경로에 char.txt파일을 만들고 아무 내용이나 넣는다.
		// char.txt를 읽어서 내용에 알파벳 대문자와 소문자 갯수를 각각 출력

		// 대문자 : 5
		// 소문자 : 2

		FileWriter fw = null;
		BufferedWriter bw = null;

		// char.txt 파일 만들기
		try {
			fw = new FileWriter("C:/embedded_LSJ/work/Ex_0130/src/ex7_work/char.txt");
			bw = new BufferedWriter(fw);

			bw.write("AsBSSDFdsgsdSDFFHsn1560126vsdonoi"); // 파일에 내용 쓰기

			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		FileReader fr = null;
		BufferedReader br = null;
		String str = "";

		// 파일 내용 읽어와서 대소문자 비교하기
		try {
			fr = new FileReader("C:/embedded_LSJ/work/Ex_0130/src/ex7_work/char.txt");
			br = new BufferedReader(fr);

			// 빈 문자열이 나올 때까지 읽어오기
			str = br.readLine();

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

		// 읽어온 문자열 대소문자 확인
		int upper_count = 0;
		int lower_count = 0;
		int num_count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lower_count++;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				upper_count++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				num_count++;
			}
		} // for
		
		System.out.println(str);
		System.out.printf("대문자  : %d개\n", upper_count);
		System.out.printf("소문자  : %d개\n", lower_count);
		System.out.printf("숫자  : %d개\n", num_count);

	} // end of main
} // end of class
