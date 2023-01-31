package ex7_work;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamWork_ex {
	public static void main(String[] args) {
		// char����� ��Ʈ���� ����� ��!
		// Ư�� ��ο� char.txt������ ����� �ƹ� �����̳� �ִ´�.
		// char.txt�� �о ���뿡 ���ĺ� �빮�ڿ� �ҹ��� ������ ���� ���

		// �빮�� : 5
		// �ҹ��� : 2

		String path = "C:/embedded_LSJ/work/Ex_0130/src/ex7_work/char.txt";
		FileReader fr = null;

		int upper = 0; // �빮��
		int lower = 0; // �ҹ���

		try {
			fr = new FileReader(path);
			int code = -1;

			while ((code = fr.read()) != -1) {
				if (code >= 'A' && code <= 'Z') {
					upper++;
				}

				if (code >= 'a' && code <= 'z') {
					lower++;
				}

			} // while

			System.out.println("�빮�� : " + upper);
			System.out.println("�ҹ��� : " + lower);

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
