package ex7_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamWork_ex {
	public static void main(String[] args) {
		// byte기반의 스트림을 사용할 것!!
		// 아무경로에 file.txt를 만들고 내용을 넣어 저장.
		// 저장된 file.txt를 읽어서 회문수인지 아닌지를 판단하시오.

		String path = "C:/embedded_LSJ/work/Ex_0130/src/ex7_work/file.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int) f.length()];

		FileInputStream fis = null;

		String ori = ""; // 원본
		String rev = ""; // 원본을 뒤집어서 저장할 변수

		try {
			fis = new FileInputStream(f);
			fis.read(b_read);

			// 읽어온 원본을 ori에 저장
			ori = new String(b_read).trim();

			// 원본을 위집어서 rev에 저장
			for (int i = ori.length() - 1; i >= 0; i--) {
				rev += ori.charAt(i);
			} // for

			// 회문수 판단
			if (ori.equals(rev)) {
				System.out.println(ori + " : 회문수");
			} else {
				System.out.println(ori + " : 회문수 아님");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end of main
} // end of class
