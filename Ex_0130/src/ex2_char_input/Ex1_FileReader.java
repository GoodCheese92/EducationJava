package ex2_char_input;

import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {
	public static void main(String[] args) {
		FileReader fr = null;

		try {
			fr = new FileReader("C:/embedded_LSJ/test.txt");

			int code = -1;
			
			// fr.read()�� char�� �����ڵ� ���·� �����´�.
			// ���� �� ������ -1�� �����´�.
			while ((code = fr.read()) != -1) {
				// fr�� �⺻������ 2byte������ �ѱ� ���� �����ڵ� ���·� �о���� ���� �����ϹǷ�
				// byte[]���� ���� �ʿ䰡 ����!!
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
