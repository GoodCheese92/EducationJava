package ex3_io_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {

		String path = "D:/��������/embedded_LSJ";
		File f = new File(path);

		// f�� ������ path��ΰ� ������ ��� true
		if (f.isDirectory()) { // !f.isFile()
			System.out.println("---���� Ŭ������ ������ ������ϵ�---");

			// f�� ������ ������ ���� ������� �̸��� ��Ƶδ� �޼���
			String[] sArr = f.list();

			for (int i = 0; i < sArr.length; i++) {
				System.out.println(sArr[i]);
			} // for

		}

	} // end of main
} // end of class
