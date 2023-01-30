package ex3_char_output;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			// true �߰� ��, ����� �� ���� �����ؼ� ����� �ȴ�.
			fw = new FileWriter("C:/embedded_LSJ/fileWriter�� ����.txt", true);

			String str = "first line\n";
			String str2 = "�ι�° ��";

			// character ����̹Ƿ� 2byte�� �� �� �ֱ� ������ �迭�� �ٲ��� �ʾƵ� �ȴ�.
			// fw�� �⺻������ 2byte�� �����ϱ� ������ getByte()�� ����
			// byte[]������ �ɰ��� �ʾƵ� ����� ����
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
